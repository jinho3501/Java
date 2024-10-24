package 객체지향프로그래밍;

public class PiggyBank {

	// 저금통 설계도
	// 필드 : 객체의 특성(속성)
	int money;

	// 메소드 : 객체의 기능(행위)
	// 돈을 넣는 deposit 메소드
	// 사용자가 입금할 돈을 입력(매개변수)하면 현재 재산(money)에 추가(실행문장)되는 기능
	public void deposit(int money) {
		this.money = this.money+money;
		System.out.println("입금되었습니다.");
	}

	// 돈을 인출하는 withdraw 메소드
	// 사용자가 출금할 돈(매개변수)을 입력하면 현재 재산(money)에서 차감(실행문장)되는 기능
	public void withdraw(int money) {
		this.money = this.money - money;
		System.out.println("출금되었습니다.");
	}
	
	// 잔액을 보여주는 showMoney 메소드
	// 현재 재산을 출력(실행문장)하는 기능
	public void showMoney() {
		System.out.println("현재 잔액 : "+money);
	}

}
