package 메소드;

public class Ex03_연산결과 {
	public static void main(String[] args) {
		// num1, num2, op를 매개변수로 받아서 
		// num1, num2를 op에 맞게 연산한 결과값을 반환해주는 메소드
		
		int num1 = 50;
		int num2 = 15;
		char op = '*';
		
		System.out.println(cal(num1, num2, op));
	}

	public static int cal(int num1, int num2, char op) {
		int result = 0;
		if(op=='+') {
			result = num1+num2;
		}else if(op == '-') {
			result = num1-num2;
		}else if(op == '*') {
			result = num1*num2;
		}else if(op == '/') {
			result = num1/num2;
		}else {
			System.out.println("잘못 입력했습니다. ");
		}
		
		return result;
	}
	public static int cal2(int num1, int num2, char op) {
        return switch (op) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> throw new IllegalStateException("연산자 오류");
        };
    }

    public static int cal(int a,int b,String c) {
        int result = 0;
        switch(c) {
        case("-") : result = a-b; break;
        case("+") : result = a+b; break;
        case("/") : result = a/b; break;
        case("*") : result = a*b; break;
        default : System.out.println("잘못 입력했습니다.");
        }
        return result;
              
     }
    
    

	
}
