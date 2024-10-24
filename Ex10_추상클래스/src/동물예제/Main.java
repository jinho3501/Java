package 동물예제;

public class Main {

	public static void main(String[] args) {
		System.out.println("== Animal ==");
		// 추상클래스는 구현부가 없기 때문에 인스턴스화 불가능
		// == new 불가능
//		Animal a = new Animal();
//		a.cry();
//		a.play();
		
		System.out.println("== Dog ==");
		Dog d = new Dog();
		d.cry();
		d.play();
		
		System.out.println("== Cat ==");
		Cat c = new Cat();
		c.cry();
		c.play();
	}
}
