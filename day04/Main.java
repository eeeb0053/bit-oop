package day04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		System.out.print("숫자1: ");
		calculator.setNumber1(scanner.nextInt());
		System.out.print("숫자2: ");
		calculator.setNumber2(scanner.nextInt());
		System.out.print("연산자: ");
		calculator.setOperator(scanner.next());
		
		if(calculator.getOperator().equals("+")) {
			System.out.println("숫자1 + 숫자2 = "+calculator.add(calculator.getNumber1(), calculator.getNumber2()));
		}else if(calculator.getOperator().equals("-")) {
			System.out.println("숫자1 - 숫자2 = "+calculator.subtrace(calculator.getNumber1(), calculator.getNumber2()));
		}else if(calculator.getOperator().equals("*")) {
			System.out.println("숫자1 * 숫자2 = "+calculator.multiply(calculator.getNumber1(), calculator.getNumber2()));
		}else if(calculator.getOperator().equals("")) {
			System.out.println("숫자1 / 숫자2 = "+calculator.divide(calculator.getNumber1(), calculator.getNumber2()));
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		scanner.close();
	}
}
