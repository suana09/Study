package JDBC03;

import java.util.Scanner;

public class Member_Delete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); System.out.print("삭제할 회원의 번호를 입력하세요");
		int membernum = Integer.parseInt( sc.nextLine() );
				

		MemberDAO mdao = new MemberDAO();
		MemberDTO mdto = mdao.getMember( membernum );
		if(mdto == null ) {
			System.out.println(" | |* 18% 32944.");
			return;
		} 
		

		int result = mdao.deleteMember(membernum); 
		if(result == 1) System.out.println(""); 
		else System.out.println("");
		
	
	
	
	}

}
