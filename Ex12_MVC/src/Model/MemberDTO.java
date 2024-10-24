package Model;

public class MemberDTO {
	
	// Model : 실행에는 직접적인 관여를 하지 않지만
	// 		   데이터를 전달하거나 수정하는 객체
	
	// DTO(Data Transfer Object) : 데이터를 전달, 수정하는 객체
	// VO(Value Object) : 수정 불가능한 객체
	
	// 회원의 설계도 == 클래스
	// 필드(회원 객체의 속성)
	private String id;
	private String pw;
	private int age;
	private String name;
	
	// 메소드(Getter, Setter, 생성자)
	public MemberDTO(String id, String pw, int age, String name) {
		this.id = id;
		this.pw = pw;
		this.age = age;
		this.name = name;
	}
	
	public MemberDTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	
	

}
