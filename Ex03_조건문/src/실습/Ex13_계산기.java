package switch문;

import java.util.Scanner;

public class ex15_자판기2 {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
         System.out.println("금액을 입력하세요");
         int price = sc.nextInt();
         
         System.out.println("메뉴를 고르세요");
         System.out.println("1. 콜라(800원) 2. 생수(500원) 3. 비타민워터(1500원)");
         int menu = sc.nextInt();
         int change = 0 ;
         // 콜라 선택
         
         switch(menu) {
         case 1: if(price>=800) { 
        	 change = 800;
         }
            
                    } else {System.out.println("돈 부족");};
            break;
         case 2 : if(price>500) { change = 500; 
               } else {System.out.println("돈 부족");}
         break;
         case 3 : if(price>500) { change = 1500;
                    } else {System.out.println("돈 부족");}
         break;
         default : System.out.println("이상한 거 누르지 마세요");
         break;
         
         }
         System.out.println("잔돈 " +(price - change));
         System.out.println("천원 : " + ((price-change)/1000));
         System.out.println("오백원 : "+(((price-change)%1000)/500));
         System.out.println("백원 : "+((((price-change)%1000)%500)/100));
   }