package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO {

	// DAO : Data Access Object 데이터베이스에 접근하는 객체

	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;
	
	// 회원가입 메소드
	public int join(MemberDTO dto) {
		int row = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_user = "hrd";
			String db_pw = "12345";

			conn = DriverManager.getConnection(db_url, db_user, db_pw);

			if (conn == null)
				System.out.println("DB연결실패");
			else
				System.out.println("DB연결성공");

			String sql2 = "insert into member values(?, ?, ?, ?)";

			psmt = conn.prepareStatement(sql2);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setInt(3, dto.getAge());
			psmt.setString(4, dto.getName());

			row = psmt.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return row;
	}

	public String login(MemberDTO dto) {
		
		String name = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_user = "hrd";
			String db_pw = "12345";	
			
			conn = DriverManager.getConnection(db_url, db_user, db_pw);
			
			String sql = "select name from member where id = ? and pw = ?";
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			
			// ResultSet : select의 결과를 저장하는 객체
			rs = psmt.executeQuery();
			
			// rs.next() : 다음줄로 내려가서 값이 있는지 없는지 확인 -> t/f 리턴
			if(rs.next()) {
				name = rs.getString("name");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// 무조건 실행, 역순으로 닫기
			try {
				if(rs != null) rs.close();
				if(psmt != null) psmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return name;
	}

}
