package JDBC02;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.security.auth.Subject;

public class BookDao {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String driver = "oracle.jdbc.driver.OracleDriver";
	String id = "scott";
	String pw = "tiger";
	
	
	
	//연결하는 메소드
	public Connection getConnection() {	
		Connection con = null;
		try {Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);		
		} catch (ClassNotFoundException e) {e.printStackTrace();
		} catch (SQLException e) {e.printStackTrace();}	
		return con;		
	}
	
	
	//연결을 종료하는 메소드
	public void close() {
		
		try {
			if (rs != null) rs.close();
			if (pstmt != null) pstmt.close();
			if (con != null) {con.close();}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

	//booklist 테이블의 모든 데이터를 리턴해주는 메소드
	//BookDto에 레코드를 하나씩 저장 -> BookDto들이 ArrayList에 저장돼서 리턴
	public ArrayList<BookDto> getBooklist() {
		
		//데이터베이스에 연결
		con = getConnection(); //getConnection() 을 호출하여 반환된 값을 con에 담아줌
		ArrayList<BookDto> list = new ArrayList<BookDto>();
		
		//테이블내용 조회
		String sql = "select*from booklist order by booknum desc";
				
		//조회내용을 정리하여 리턴
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); //실행
			while (rs.next()) {
				BookDto bdto = new BookDto();
				
				int booknum = rs.getInt("booknum");
				bdto.setBooknum(booknum);
				
				bdto.setSubject(rs.getString("subject"));
				bdto.setMakeyear(rs.getInt("makeyear"));
				bdto.setInprice(rs.getInt("inprice"));
				bdto.setRentprice(rs.getInt("rentprice"));
				bdto.setGrade(rs.getString("grade"));
				
				list.add(bdto);
			}
		} catch (SQLException e) {e.printStackTrace();}
		
		//데이터베이스 연결 종료
		close();
		
		
		return list;
	}


	public int insertBook(BookDto bdto) {
		int result = 0;
		con = getConnection();
		String sql = "insert into booklist(booknum, subject, makeyear, inprice, rentprice, grade)"
				+ " values(book_seq.nextVal, ?, ?, ?, ?, ?)";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bdto.getSubject());
			pstmt.setInt(2, bdto.getMakeyear());
			pstmt.setInt(3, bdto.getInprice());
			pstmt.setInt(4, bdto.getRentprice());
			pstmt.setString(5, bdto.getGrade());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return result;
	}

	public BookDto getBook(int booknum) {
		BookDto bdto = null;
		con = getConnection();
		String sql = "select*from booklist where booknum = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  booknum);
			rs = pstmt.executeQuery();
			System.out.println("\nexecuteQuery() result : \n"+rs);
			if (rs.next()) {
				bdto = new BookDto();
				bdto.setBooknum(rs.getInt("booknum"));
				bdto.setSubject(rs.getString("subject"));
				bdto.setMakeyear(rs.getInt("makeyear"));
				bdto.setInprice(rs.getInt("inprice"));
				bdto.setRentprice(rs.getInt("rentprice"));
				bdto.setGrade(rs.getString("grade"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close();
		
		return bdto;
	}
	
	public int updateBook(BookDto bdto) {
		int result = 0;
		con = getConnection();
		String sql = "update booklist set subject = ?, makeyear = ?, inprice = ?, rentprice = ?, grade = ? "
				+ " where booknum = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  bdto.getSubject());
			pstmt.setInt(2,  bdto.getMakeyear());
			pstmt.setInt(3,  bdto.getInprice());
			pstmt.setInt(4,  bdto.getRentprice());
			pstmt.setString(5,  bdto.getGrade());
			pstmt.setInt(6,  bdto.getBooknum());
			
			result = pstmt.executeUpdate();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return result;
	}


	public int deleteBook(int booknum) {
		int result = 0;
		con = getConnection();
		String sql = "delete from booklist where booknum = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  booknum);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}

		
		return result;
	}




}
