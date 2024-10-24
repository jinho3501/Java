package 객체지향프로그래밍;

import java.util.Random;

public class PersonMain {

	public static void main(String[] args) {
		// 설계한 설계도를 불러와서 실제 객체로 생성할 공간 -> main메소드가 필요
		
		// 1. 설계도 불러오기
		// 클래스명 변수명 = new 클래스명();
		Random r = new Random();
		
		Person person1 = new Person();
		
		System.out.println("사람 되기 전=========");
		System.out.println("이름 : "+person1.name);
		System.out.println("나이 : "+person1.age);
		System.out.println("성별 : "+person1.gender);
		
		// 2. 사람 만들기 => 필드에 값을 채우기
		person1.name = "박수현";
		person1.age = 10;
		person1.gender = "여자";
		
		System.out.println("사람 된 후 ==========");
		System.out.println("이름 : "+person1.name);
		System.out.println("나이 : "+person1.age);
		System.out.println("성별 : "+person1.gender);
		
		// 사람의 기능도 실행
		person1.eat();
		person1.sleep();
		person1.play();
		
		// 3. 짝궁만들기
		Person person2 = new Person();
		
		person2.name = "서보경";
		person2.age = 20;
		person2.gender = "여자";
		
		System.out.println("짝궁 ==========");
		System.out.println("이름 : "+person2.name);
		System.out.println("나이 : "+person2.age);
		System.out.println("성별 : "+person2.gender);
		
		// 4. 생성자를 활용하여 사람 만들기
		Person person3 = new Person("이명훈", 20, "남자");
		
		System.out.println("머신러닝강사 ==========");
		System.out.println("이름 : "+person3.name);
		System.out.println("나이 : "+person3.age);
		System.out.println("성별 : "+person3.gender);
		

	}

}
