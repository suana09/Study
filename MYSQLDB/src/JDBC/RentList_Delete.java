package JDBC;

import java.util.Scanner;

public class RentList_Delete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RentDAO rdao = RentDAO.getInstance();
		
		
		//삭제할 대여기록의 번호 입력
		
		System.out.print("삭제할 대여기록의 번호를 입력해주세요 : ");
		int rnum = Integer.parseInt(sc.nextLine());
		
		
		//해당 대여기록이 있는지 확인합니다. 없으면 종료
		
		RentDTO rdto = rdao.getRent(rnum);
		if(rdto == null) {
			System.out.println("입력하신 번호에 해당하는 대여기록이 없습니다. 프로그램이 종료됩니다.");
			return;
		}
		
		System.out.println(rdto.toString());
		
		int result = rdao.deleteRent(rdto);
		if (result == 1) {
			System.out.println("삭제가 완료되었습니다.");			
		}else {
			System.out.println("삭제가 실패하였습니다.");
		}

	}

}
