package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01_insert {
	
	public static void main(String[] args) {
		
		// 회원가입 : 사용자에게 회원정보(id, pw, age, name)를 입력받아서 DB에 저장하는 기능
		// insert into member values(id, pw, age, name)
		
		// 1. member테이블 생성
		// 2. 사용자에게 회원정보 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==회원가입==");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.print("AGE : ");
		int age = sc.nextInt();
		System.out.print("NAME : ");
		String name = sc.next();
		
		// 3. DB 연결해서 입력받은 값 insert
		
		PreparedStatement psmt = null;
		Connection conn = null;
		
		// 3-1. 외부 라이브러리 추가 : ojdbc6.jar
		// 프로젝트 오른쪽마우스 - build path - Library탭 - add External JARs..
		// ojdbc6.jar 경로 : C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar

		// try-catch문 예외처리
		// 문법적 오류와 같은 컴파일 에러는 수정이 가능하지만
		// 런타임 오류처럼 실행을 했을 발생하는 오류는 예기치 못한 상황에서 발생하기 때문에
		// 예외처리(try-catch문)를 통해서 대응하고자 하는 것
		// try문 : 일단 시도(예외가 발생할 수 있는 실행문장)
		// catch문 : 예외처리문(예외가 발생했을 때 실행하는 문장)
		try {
			// 3-2. Java와 DB 사이에 통로를 만들어줄 클래스 호출 : OracleDriver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 3-3. DB접속하기 위한 보안카드 필요
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_user = "hrd";
			String db_pw = "12345";
			
			// 3-4. DB연결
			// -> 연결 성공했을 때 Connection객체로 return
			// -> Connection객체를 데이터 타입으로 하는 변수 conn에 대입
			conn = DriverManager.getConnection(db_url, db_user, db_pw);
			
			if(conn == null) System.out.println("DB연결실패");
			else System.out.println("DB연결성공");
			
			// 3-5. SQL문장 작성
			// 문장끝에 ; 사용 X
			// ? 바인드변수, soft파싱
			// String sql = "insert into member values("+id+", "+pw+","+age+")";
			String sql2 = "insert into member values(?, ?, ?, ?)";
			
			// 3-6. SQL문장 실행 가능 여부 확인
			// 실행가능하면 PreparedStatement객체로 return
			psmt = conn.prepareStatement(sql2);
			
			// 3-7. 바인드변수(?) 값 채우기
			// set자료형(?의 순서, 채울값)
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setInt(3, age);
			psmt.setString(4, name);
			
			// 3-8. 실행
			// 변화가 된 행의 개수를 return
			int row = psmt.executeUpdate();
			
			// 실행 결과 확인
			if(row>0) System.out.println("회원가입 성공");
			else System.out.println("회원가입 실패");
			
			
		}
		// 1
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			// 문닫는코드
		}
		// 2
		catch (Exception e) {
			e.printStackTrace();
		}
		// 무조건 실행하는 구문(try문에서 끝나든, catch문에서 끝나든)
		finally {
			// 3-9. 접속 종료 : 객체를 열었던 역순으로 닫고 나와야한다!
			try {
				if(psmt != null) psmt.close();
				if(conn != null) conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}









