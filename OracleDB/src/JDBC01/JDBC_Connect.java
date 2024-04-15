package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connect {

	public static void main(String[] args) {
		
		//1. JDBC 를 통한 데이터베이스 연결 클래스 의 객체 : Connection 생성
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String id = "scott";
		String pw = "tiger";
		
		//외부 장치와의 연결은 항상 예외처리가 따라다님 
		try {
			//연결될 데이터 베이스의 드라이버 파일 지정하는 명령
			Class.forName(driver);
			
			//DriverManager 라는 클래스의 스태틱 메소드인 getConnection을 이용하여 
			//실제로 데이터베이스를 연결하고 연결 결과 객체를 con 에 저장
			
			con = DriverManager.getConnection(url, id, pw);
			
			System.out.println("데이터베이스 연결 성공");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if (con != null)
				con.close();
			System.out.println("데이터베이스 종료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
