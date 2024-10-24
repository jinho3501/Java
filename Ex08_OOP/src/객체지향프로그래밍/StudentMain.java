package 객체지향프로그래밍;

public class StudentMain {

	public static void main(String[] args) {
		
		// Student클래스를 불러와서 학생 객체 생성
		Student s1 = new Student("박수현", "0122", 20, 100, 90, 80);
		s1.show();
		
		// 전교 1등을 하고 싶어서 s1의 점수를 조작 -> 캡슐화(priavte)를 통해서 정보은닉
//		s1.java = 100;
//		s1.db = 100;
//		s1.ml = 100;
		
		// 잘못입력한 정보를 수정 -> setter()로 접근
		s1.setJava(100);
		s1.setDb(100);
		s1.setMl(100);
		
		s1.show();
		
		// 정보를 확인
		int java = s1.getJava();
		System.out.println("Java점수 : "+java);

	}

}
