package 객체지향프로그래밍;

import java.util.ArrayList;

public class PocketmonMain {

	public static void main(String[] args) {
		// 설계도를 활용해서 포켓몬 만들기
		Pocketmon 피카츄 = new Pocketmon("피카츄", "전기", 5, 50, 30, 100);
		Pocketmon 파이리 = new Pocketmon("파이리", "불", 3, 70, 20, 90);
		Pocketmon 꼬부기 = new Pocketmon("꼬부기", "물", 4, 60, 40, 90);
		Pocketmon 이상해씨 = new Pocketmon("이상해씨", "풀", 5, 40, 60, 80);
		
		System.out.println(피카츄.toString());
		System.out.println(파이리.toString());
		System.out.println(꼬부기.toString());
		System.out.println(이상해씨.toString());
		
		피카츄.attack();
		파이리.defense();
		
		// 포켓몬 4마리의 이름만 출력
		System.out.println(피카츄.getName());
		System.out.println(파이리.getName());
		System.out.println(꼬부기.getName());
		System.out.println(이상해씨.getName());
		
		
		// 객체 배열
		int[] array = new int[5]; 
		Pocketmon[] pocketmons = new Pocketmon[4];
		
		pocketmons[0] = 피카츄;
		pocketmons[1] = 파이리;
		pocketmons[2] = 꼬부기;
		pocketmons[3] = 이상해씨;
		
		// 모든 포켓몬의 이름과 속성을 출력!
//		System.out.println(pocketmons[0].getName()+", "+pocketmons[0].getType());
//		System.out.println(pocketmons[1].getName()+", "+pocketmons[1].getType());
		
		for(int i=0; i<pocketmons.length; i++) {
			System.out.println(pocketmons[i].getName()+", "+pocketmons[i].getType());
		}
		
		// 객체 ArrayList
		ArrayList<Pocketmon> pocketmonList = new ArrayList<Pocketmon>();
		
		pocketmonList.add(피카츄);
		pocketmonList.add(파이리);
		pocketmonList.add(꼬부기);
		pocketmonList.add(이상해씨);
		
		// 모든 포켓몬의 이름 출력
		for(int i=0; i<pocketmonList.size(); i++) {
			System.out.println(pocketmonList.get(i).getName());
			pocketmonList.get(i).attack();
			
		}
		
		

	}

}
