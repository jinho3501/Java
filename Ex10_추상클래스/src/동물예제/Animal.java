package 동물예제;

// 추상클래스 : 추상메소드가 하나라도 있는 클래스
// abstract 키워드를 붙여서 선언
public abstract class Animal {

	// 추상클래스도 일반 필드 생성 가능
	private String name;
	
	// 동물마다 cry, play하는 방법이 다 다르기 때문에
	// Animal클래스에서는 설계만 해놓고 구현은 각 동물 객체에서 진행
	// 추상메소드 : 선언은 되어있으나 구현되지 않은 메소드
	// abstract 키워드를 붙여서 선언
	// 만약, 추상메소드를 상속받는 경우, 자식클래스에서 오버라이딩하여 재구현 필수!
	public abstract void cry();
	public abstract void play();

	
	// 일반 메소드도 생성 가능
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	


}
