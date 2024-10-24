package arrayList;

import java.util.ArrayList;
import java.util.Scanner;


public class Ex02_musicPlayList {
	
	public static void main(String[] args) {
		
		// 필요한 도구들 불러오기
		Scanner sc = new Scanner(System.in);
		
		// 뮤직리스트를 담아줄 ArrayList객체 생성
		ArrayList<String> musicList = new ArrayList<String>();
		
		// index번호를 담아줄 변수
		int index = 0;
		
		System.out.println("=== Music Play List ===");
		
		while(true) {
			System.out.println();
			System.out.print("[1] 노래 추가 [2] 노래 조회 [3] 노래 삭제 [4] 종료 >> ");
			int menu = sc.nextInt();
			
			// 사용자가 4번을 선택했을 때
			if(menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 사용자가 2번을 선택했을 때
			else if(menu == 2) {
				System.out.println("======== 현재 재생 목록 =========");
				
				// 재생목록이 비어있을 때 == musicList의 크기가 0과 같다.
				if(musicList.size() == 0) {
					System.out.println("재생 목록이 없습니다. ");
				}
				// 재생목록에 노래가 있을 때
				else {
					for(int i=0; i<musicList.size(); i++) {
						System.out.println(i+1+". "+musicList.get(i));
					}
				}
			}
			// 사용자가 1번을 선택했을 때
			else if(menu == 1) {
				System.out.println("========================");
				System.out.print("[1] 원하는 위치에 추가 [2] 마지막 위치에 추가 >> ");
				menu = sc.nextInt();
				
				// 2 - 마지막 위치에 추가
				if(menu == 2) {
					System.out.print("추가할 노래 입력 : ");
					String title = sc.next();
					
					// musicList에 추가
					musicList.add(title);
				}
				// 1 - 원하는 위치에 추가
				else if(menu == 1) {
					System.out.print("추가할 번호를 입력 : ");
					index = sc.nextInt();
					System.out.print("추가할 노래 입력 : ");
					String title = sc.next();
					
					// musicList에 추가
					musicList.add(index-1, title);
				}
				
			}
			
			// 사용자가 3번을 선택했을 때
			else if(menu == 3) {
				System.out.println("==========================");
				System.out.print("[1] 선택삭제 [2] 전체삭제 >> ");
				menu = sc.nextInt();
				
				// 1. 선택삭제
				if(menu == 1) {
					System.out.print("삭제 할 번호 입력 : ");
					index = sc.nextInt();
					
					// musicList에서 삭제
					musicList.remove(index-1);
					
					System.out.println("삭제 되었습니다. ");
				}
				// 2. 전체삭제
				else if(menu == 2) {
					musicList.clear();
					System.out.println("전체 삭제되었습니다.");
				}
				else {
					System.out.println("잘못 입력했습니다. ");
				}
				
			}
		}
		
	}

}
