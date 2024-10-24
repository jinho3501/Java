package 캐릭터예제;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// 추상클래스는 구현부가 없기 때문에 인스턴스로 생성 불가능! -> new 키워드 사용X
		// new Character();
		
		// 업캐스팅 : 상위클래스에 담는 것
		Teemo teemo = new Teemo("티모", "탑");
		System.out.println(teemo.toString());
		teemo.q();
		teemo.w();
		teemo.e();
		teemo.r();
		teemo.flash();
		System.out.println();
		
		Zyra zyra = new Zyra("자이라", "미드/서폿");
		System.out.println(zyra); // 
		zyra.q();
		zyra.e();
		zyra.r();
		zyra.flash();
		System.out.println();
		
		// 캐릭터를 담아줄 ArrayList
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add(teemo);
		list.add(zyra);
		
		System.out.println("ArrayList의 캐릭터 출력하기");
		for(int i=0; i<list.size(); i++) {
			System.out.println("=="+list.get(i)+"==");
			list.get(i).q();
			list.get(i).w();
			list.get(i).e();
			list.get(i).r();
			list.get(i).flash();
			System.out.println();
		}
		
		
		System.out.println("탑만 출력하기");
		for(int i=0; i<list.size(); i++) {
			// list.get(i) == 캐릭터 객체 형태
			// 각 필드에 private 걸려있어서 필드접근 불가능
			// getter 메소드 필요 -> Character추상클래스에 구현
			if(list.get(i).getPosition().equals("탑")) {
				System.out.println(list.get(i));
			}
		}
		
		// 추상화
		// 1. 공통되는 멤버의 통합(이름, 포지션, flash 방어 메소드 등)
		// -> 중복되는 코드를 제거하여 코드의 재사용성으로 유지보수에 효율적
		// 2. 구현의 강제성을 통한 기능을 보장
		// -> 모든 캐릭터가 필요한 기능(q,w,e,r)을 구현하게 하여 오류 발생 가능성을 감소
		// 3. 규격에 맞는 설계
		// -> 추상클래스(Character)는 설계만하고 구현 클래스(티모, 자이라 등)에서 각 공격 메소드를
		//    구현하기 때문에 공격의 형태가 바뀌더라도 다른 캐릭터에 영향 미치지 않음.
		// -> 규격이 정해져있기 때문에 설계하는 시간을 절약, 수정하기 편리


	}

}
