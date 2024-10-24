package JDBC;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02_select {
	
	public static void main(String[] args) {
		
		// 로그인 : id, pw를 입력받아서 DB 테이블에 있는 회원정보와 일치하는 확인
		//         일치하는 경우 ~(이름)님 환영합니다 라는 문구 출력
		// sql : select name from member where id = ?(입력한 id) and pw = ?(입력한 pw)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==로그인==");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String name = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_user = "hrd";
			String db_pw = "12345";	
			
			conn = DriverManager.getConnection(db_url, db_user, db_pw);
			
			String sql = "select name from member where id = ? and pw = ?";
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
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
		
		if(name != null) {
			System.out.println(name+"님 환영합니다~ 로그인 성공!");
		}else {
			System.out.println("아이디와 비밀번호를 다시 확인하세요!");
		}
		
		
		
	}

}
