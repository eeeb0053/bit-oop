package day04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		System.out.print("숫자1: ");
		int num1 = scanner.nextInt();
		calculator.setNumber1(num1);
		System.out.print("숫자2: ");
		int num2 = scanner.nextInt();
		calculator.setNumber2(num2);
		System.out.print("연산자: ");
		String op = scanner.next();
		calculator.setOperator(op);
		
		if(op.equals("+")) {
			System.out.println("숫자1 + 숫자2 = "+calculator.add(num1, num2));
		}else if(op.equals("-")) {
			System.out.println("숫자1 - 숫자2 = "+calculator.subtrace(num1, num2));
		}else if(op.equals("*")) {
			System.out.println("숫자1 * 숫자2 = "+calculator.multiply(num1, num2));
		}else if(op.equals("")) {
			System.out.println("숫자1 / 숫자2 = "+calculator.divide(num1, num2));
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		scanner.close();
	}
}
