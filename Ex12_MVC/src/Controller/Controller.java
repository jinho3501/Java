package Controller;

import Model.MemberDAO;
import Model.MemberDTO;

public class Controller {
	
	// Model과 View의 중간다리 역할
	// View, Model에서 필요한 데이터를 처리
	
	public String joinCon(String id, String pw, int age, String name) {
		
		// 입력받은 데이터를 DTO로 묶는 작업
		MemberDTO dto = new MemberDTO(id, pw, age, name);
		
		// DB에 값을 입력하기 위해 join메소드 호출
		int row = new MemberDAO().join(dto);
		
		// 실행한 결과값 도출 -> return
		if (row > 0)
			return "성공";
		else
			return "실패";
	}

	public String loginCon(String id, String pw) {
		
		// 입력받은 값을 DTO로 묶기
		MemberDTO dto = new MemberDTO(id, pw);
		 
		// 데이터베이스에 값이 있는지 없는지 확인하는 login메소드 호출
		String name = new MemberDAO().login(dto);
		
		return name;
	}
}
