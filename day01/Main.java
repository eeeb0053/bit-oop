package day01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Operator operator = new Operator();
		Variable variable = new Variable();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자1: ");
		operator.setMyNumber1(scanner.nextInt());
		
		System.out.print("숫자2: ");
		operator.setMyNumber2(scanner.nextInt());
		
		System.out.println("숫자1 + 숫자2 = "+(operator.getMyNumber1()+operator.getMyNumber2()));
		System.out.println("숫자1 - 숫자2 = "+(operator.getMyNumber1()-operator.getMyNumber2()));
		System.out.println("숫자1 / 숫자2 = "+((double)operator.getMyNumber1()/operator.getMyNumber2()));
		System.out.println("숫자1 % 숫자2 = "+(operator.getMyNumber1()%operator.getMyNumber2()));
		
		System.out.print("숫자: ");
		int num = scanner.nextInt();
		variable.setNumber(num);
		
		System.out.println(num+"을 입력하셨습니다.");
		
		scanner.close();
	}
}
