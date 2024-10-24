package 객체지향프로그래밍;

public class PiggyBankMain {

	public static void main(String[] args) {
		
		// 저금통 객체 생성
		PiggyBank bank = new PiggyBank();
		
		// 1500원 입금
		bank.deposit(1500);
		
		// 현재 잔액 출력
		bank.showMoney();
		
		// 500원 인출
		bank.withdraw(500);
		
		// 현재 잔액 출력
		bank.showMoney();

	}

}
