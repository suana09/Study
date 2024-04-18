package JDBC03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;


public class MemberDAO {
	
	DataBaseManager dbm = new DataBaseManager();
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	

	public ArrayList<MemberDTO> selectMember() {
		
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		con = dbm.getConnection();
		
		String sql = "select*from memberlist";
		
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				MemberDTO mdto = new MemberDTO();
				mdto.setMembernum(rs.getInt("membernum"));
				mdto.setName(rs.getString("name"));
				mdto.setPhone(rs.getString("phone"));
				mdto.setBirth(rs.getDate("birth")); //SQL의 DATE 형식 : java.sql.Date
				mdto.setBpoint(rs.getInt("bpoint"));
				mdto.setGender(rs.getString("gender"));
				mdto.setAge(rs.getInt("age"));			
				list.add(mdto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
			
		dbm.close(con, pstmt, rs);
		return list;
	}


	public int insertMember(MemberDTO mdto) {
		
		int result = 0;
		
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		con = dbm.getConnection();
		
		String sql = "insert into memberlist(membernum, name, phone, birth, gender, age)"
				+ " values(member_seq.nextVal, ?, ?, ?, ?, ?)";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getName());
			pstmt.setString(2, mdto.getPhone());
			pstmt.setDate(3, mdto.getBirth());
			pstmt.setString(4, mdto.getGender());
			pstmt.setInt(5, mdto.getAge());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		dbm.close(con, pstmt, rs);
		return result;
	}


	public int updateMember(MemberDTO member) {
	      int result = 0;
	      con = dbm.getConnection();
	      
	      String sql = "update memberlist set name = ?, phone = ?, birth = ?, bpoint = ?, gender = ?, age = ? where membernum = ?";
	      
	      try {
	         pstmt = con.prepareStatement(sql);
	         pstmt.setString(1, member.getName());
	         pstmt.setString(2, member.getPhone());
	         pstmt.setDate(3, member.getBirth());
	         pstmt.setInt(4, member.getBpoint());
	         pstmt.setString(5, member.getGender());
	         pstmt.setInt(6, member.getAge());
	         pstmt.setInt(7, member.getMembernum());
	         result = pstmt.executeUpdate();
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } finally {
	         dbm.close(con, pstmt, rs);
	      }
	      
	      return result;
	   }


	public MemberDTO getMember(int membernum) {
		MemberDTO mdto = null;
		con = dbm.getConnection();
		String sql = "select name, phone, gender, bpoint, birth from memberlist where membernum = ?";
		
		//이름 전화번호 성별 bpoint 생일
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, membernum);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				mdto = new MemberDTO();
				mdto.setMembernum( rs.getInt("membernum") );
				mdto.setName( rs.getString("name") );
				mdto.setPhone( rs.getString("phone") );
				mdto.setBirth( rs.getDate("birth") );  
				mdto.setGender( rs.getString("gender") );
				mdto.setAge( rs.getInt("age") );
				mdto.setBpoint( rs.getInt("bpoint") );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

		return mdto;
	}


	public int deleteMember(int membernum) {
		int result = 0;
		con = dbm.getConnection();
		String sql = "delete from memberlist where membernum = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,  membernum);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			dbm.close(con, pstmt, rs);
		}
		
		
		
		return result;
	}

}
