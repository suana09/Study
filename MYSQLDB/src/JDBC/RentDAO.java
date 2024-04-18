package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RentDAO {

	// singleton pattern

	private RentDAO() {
	}

	private static RentDAO itc = new RentDAO();

	public static RentDAO getInstance() {
		return itc;
	}

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public ArrayList<RentDTO> selectRent() {
		ArrayList<RentDTO> list = new ArrayList<RentDTO>();
		con = Dbman.getConnection();

		String sql = "select * from rentDetail order by numseq desc";

		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {

				RentDTO rdto = new RentDTO();
				rdto.setNumseq(rs.getInt("numseq"));
				rdto.setRentdate(rs.getString("rd"));
				rdto.setBnum(rs.getInt("bnum"));
				rdto.setSubject(rs.getString("subject"));
				rdto.setMnum(rs.getInt("mnum"));
				rdto.setName(rs.getString("name"));
				rdto.setRentprice(rs.getInt("rentprice"));
				rdto.setDiscount(rs.getInt("discount"));
				rdto.setAmount(rs.getInt("amount"));
				list.add(rdto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Dbman.close(con, pstmt, rs);
		}

		return list;
	}

	public int memberOk(String membernum) {
		int result = 0;
		con = Dbman.getConnection();
		// String sql = "select count(*) as cnt from memberlist where membernum=?";
		String sql = "select * from memberlist where membernum=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt( membernum ) );
			rs = pstmt.executeQuery();
			if( rs.next() ) {
				//result = rs.getInt("cnt");
				result = 1;
			}			
		} catch (SQLException e) { e.printStackTrace();
		}finally {	Dbman.close(con, pstmt, rs); }
		return result;
	}

	public int bookOk(String booknum) {
		int result = 0;
		con = Dbman.getConnection();
		String sql = "select * from booklist where booknum=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt( booknum ) );
			rs = pstmt.executeQuery();
			if( rs.next() ) {
				result = 1;
			}			
		} catch (SQLException e) { e.printStackTrace();
		}finally {	Dbman.close(con, pstmt, rs); }
		return result;
	}

	public int insertRent(RentDTO rdto) {
		int result = 0;
		con = Dbman.getConnection();
		String sql = "insert into rentlist(bnum, mnum, discount) values(?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,	rdto.getBnum());
			pstmt.setInt(2,  rdto.getMnum());
			pstmt.setInt(3, rdto.getDiscount());
			result = pstmt.executeUpdate();
		} catch (SQLException e) { e.printStackTrace();
		} finally { Dbman.close(con, pstmt, rs); }
		return result;
	}
	
	public int rentOK(int numseq){
		int result = 0;
		con = Dbman.getConnection();
		
		String sql = "select*from rentlist where numseq = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  numseq);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				result = 1;				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Dbman.close(con, pstmt, rs);
		}		
		return result;
	}


	public RentDTO getRent(int numseq) {
	      RentDTO rdto = null;
	      con = Dbman.getConnection();
	      String sql = "select * from rentDetail where numseq = ?";
	      try {
	         pstmt = con.prepareStatement(sql);
	         pstmt.setInt(1, numseq);
	         rs = pstmt.executeQuery();
	         
	         while(rs.next()){
	            rdto = new RentDTO();
	            rdto.setNumseq(rs.getInt("numseq"));
	            rdto.setRentdate(rs.getString("rd"));
	            rdto.setBnum(rs.getInt("bnum"));
	            rdto.setMnum(rs.getInt("mnum"));
	            rdto.setDiscount(rs.getInt("discount"));
	         }
	         
	      } catch (SQLException e) { e.printStackTrace();
	      } finally{
	         Dbman.close(con, pstmt, rs); }
	      return rdto;
	}
	
	

	
	public int updateRent(RentDTO rdto) {
		int result = 0;
		con = Dbman.getConnection();
		
		//data type 이 Date 타입인 rentdate에 String으로 입력받아 값을 넣으면 에러 발생
		//
		String sql = "update rentlist set rentdate = str_to_date(concat('', ?, ''), '%Y%m%d'), "
				+ "bnum = ?, mnum = ?, discount = ? "
				+ "where numseq = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  rdto.getRentdate());
			pstmt.setInt(2, rdto.getBnum());
			pstmt.setInt(3,  rdto.getMnum());
			pstmt.setInt(4,  rdto.getDiscount());
			pstmt.setInt(5, rdto.getNumseq());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Dbman.close(con, pstmt, rs);
		}
		
		
		return result;
	}

	public int deleteRent(RentDTO rdto) {
		int result = 0;
		con = Dbman.getConnection();
		String sql = "delete from rentlist where numseq = ?";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, rdto.getNumseq());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Dbman.close(con, pstmt, rs);
		}
		
		
		return result;
	}
	
}
