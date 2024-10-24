package 객체지향프로그래밍;

import java.util.Objects;

public class Student {
	
	// 학생정보 설계도
	
	// 필드 -> 객체의 특성(속성)
	// 필드는 학생의 정보이기 때문에 중요! -> 데이터 보호 필요
	// 접근제한자(private)를 통해서 데이터를 보호
	// private : 현재 객체 내에서만 접근 가능
	private String name;
	private String birth;
	private int age;
	private int java;
	private int db;
	private int ml;
	
	// 생성자 메소드 
	// -> 이름이 클래스 이름과 같다.
	// -> 리턴타입이 없다. void도 사용하지 않는다.
	// -> new키워드로 객체를 생성할 때 호출
	// -> 오버로딩(중복정의) 가능
	// -> 생성자를 만들지않으면 기본생성자가 자동으로 생성
	// 자동생성 방법 : 오른쪽마우스 - Source - Generate Constructor using field
	// 			 : Alt+Shift+S - Generate Constructor using field
	public Student(String name, String birth, int age, int java, int db, int ml) {
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.java = java;
		this.db = db;
		this.ml = ml;
	}
	
	
	// 메소드 -> 객체의 기능(행위)
	public void show() {
		System.out.println("이름 : "+name);
		System.out.println("생일 : "+birth);
		System.out.println("나이 : "+age);
		System.out.println("Java점수 : "+java);
		System.out.println("DB점수 : "+db);
		System.out.println("ML점수 : "+ml);
	}
	
	// 필드에 private를 걸었기 때문에 필드변수들은 설계도 내부에서만 접근 가능
	// 메소드(기능)을 만들어서 접근 가능하도록
	// getter : 가지고 오는 것 -> 객체의 필드값을 가지고 오는 메소드
	// setter : 지정하는 것 -> 객체의 필드값을 지정하는 메소드
	
	// getter : 필드의 값을 돌려주는 메소드
	public String getName() {
		return name;
	}
	
	// setter : 필드에 지정할 값을 매개변수로 받아서 필드에 저장해주는 메소드
	public void setName(String name) {
		this.name = name;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getJava() {
		return java;
	}


	public void setJava(int java) {
		this.java = java;
	}


	public int getDb() {
		return db;
	}


	public void setDb(int db) {
		this.db = db;
	}


	public int getMl() {
		return ml;
	}


	public void setMl(int ml) {
		this.ml = ml;
	}

	
}














