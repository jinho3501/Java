package 오버라이딩;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("== Animal ==");
		Animal a = new Animal();
		a.cry();
		a.play();
		
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
