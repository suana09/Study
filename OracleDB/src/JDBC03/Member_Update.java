package JDBC03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Member_Update {

	public static void main(String[] args) throws ParseException {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("수정할 회원의 번호를 입력하세요 : ");
		int membernum = Integer.parseInt(sc.nextLine());
		
		MemberDAO mdao = new MemberDAO();
		MemberDTO mdto = null;
		
		
		if (mdto == null) {
			System.out.println("입력한 번호의 회원이 존재하지 않습니다\n프로그램을 종료합니다.");
			return;
		}
		
		ArrayList<MemberDTO> list = mdao.selectMember();
		
		
		
		System.out.print("수정할 이름을 입력하세요 : ");
		String name = sc.nextLine();
		if(!name.equals("")) mdto.setName(name);
		
		System.out.print("수정할 전화번호를 입력하세요 : ");
		String phone = sc.nextLine();
		if(!phone.equals("")) mdto.setPhone(phone);
		
		System.out.print("수정할 성별을 입력하세요 (M/F) : ");
		String gender = sc.nextLine();
		if(!gender.equals("")) mdto.setGender(gender);
	

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		System.out.print("수정할 생년월일을 입력하세요 (YYYY-MM-DD) : ");
		String input = sc.nextLine();
		if(!gender.equals("")) {
			java.util.Date d = sdf.parse(input);

			java.sql.Date birth = new java.sql.Date( d.getTime() );
			mdto.setBirth(birth);
			
			Calendar today = Calendar.getInstance();
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			int age = today.get(Calendar.YEAR) - c.get(Calendar.YEAR);
			mdto.setAge(age);
			
		}		

		int result = mdao.updateMember(mdto); 
		if( result == 1 ) System.out.println("레코드 추가 성공"); 
		else System.out.println("레코드 추가 실패");

	}

}
