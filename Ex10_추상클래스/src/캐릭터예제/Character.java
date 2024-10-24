package 캐릭터예제;

public abstract class Character {
	
	// 캐릭터를 설계하라 클래스
	
	// 필드(이름, 포지션)
	private String name;
	private String position;
	
	// 메소드(생성자, 공격, 방어, toString)
	// 생성자 메소드 : 객체를 생성할 때 필드값(이름, 포지션)을 초기화 하는 목적
	// 생성자 메소드 -> 객체 생성 시 name과 position을 초기화
	// - 객체가 생성되는 순간(new)에 자동으로 호출되는 메소드
	// - new Animal(생성자메소드);
	// 특징1. 리턴 타입이 없다. void도 적지 않음.
	// 특징2. 생성자 메소드의 이름은 클래스의 이름과 동일, 
	//      생성자 메소드를 여러개 만들면 오버로딩(중복정의) - 매개변수 타입, 순서, 개수가 달라야함!
	// 특징3. 생성자 메소드는 new키워드를 통해서 이루어지며, 객체 생성할 때 한번만 호출
	// 특징4. 생성자 메소드를 따로 만들지 않았을 때는 기본생성자가 자동으로 생성
	public Character(String name, String position) {
		this.name = name;
		this.position = position;
	}
	
	// 공격메소드(q, w, e, r)
	// 각 캐릭터 별로 공격의 형태가 다르기 때문에, 각 구현클래스에서 구체적인 공격방안은 구현할 수 있도록
	// 추상메소드 형태로 생성 == 강제성을 부여
	public abstract void q();
	public abstract void w();
	public abstract void e();
	public abstract void r();
	
	// 방어메소드
	// 모든 캐릭터가 가지고 있는 방어 메소드라서 일반 메소드로 정의
	// 캐릭터별로 오버라이딩 할 필요X
	public void flash() {
		System.out.println("점멸! 빠르게 도망가기");
	}

	// toString : 객체가 가지고 있는 값을 문자열로 리턴해주는 메소드
	// 모든 클래스의 부모클래스(수퍼클래스)는 Object객체
	@Override
	public String toString() {
		return "캐릭터 [이름=" + name + ", 포지션=" + position + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
	

}






