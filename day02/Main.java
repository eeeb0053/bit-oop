package day02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BMI bmi = new BMI();
		GradeBook gradeBook = new GradeBook();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. GradeBook 2. BMI > ");
		int userChoice = scanner.nextInt();
		if(userChoice == 1) {
			System.out.print("번호: ");
			gradeBook.setId(scanner.nextInt());
			
			System.out.print("이름: ");
			gradeBook.setName(scanner.next());
			
			System.out.print("국어: ");
			gradeBook.setKorean(scanner.nextInt());
			System.out.print("영어: ");
			gradeBook.setEnglish(scanner.nextInt());
			System.out.print("수학: ");
			gradeBook.setMath(scanner.nextInt());
			
			System.out.printf("번호: %d번 이름:%s\n", gradeBook.getId(), gradeBook.getName());
			System.out.printf("국어: %03d점 영어:%03d점 수학:%03d점\n", gradeBook.getKorean(),
														gradeBook.getEnglish(), gradeBook.getMath());
			int sum = gradeBook.getKorean() + gradeBook.getEnglish() + gradeBook.getMath();
			double average = sum / 3.0;
			
			System.out.printf("총점: %03d점 평균:%.2f점\n", sum, average);	
		} else if(userChoice == 2){
			System.out.print("키(m): ");
			bmi.setHeight(scanner.nextDouble());
			System.out.print("몸무게(kg): ");
			bmi.setWeight(scanner.nextDouble());
			
			System.out.println("BMI: "+(bmi.getWeight() / bmi.getHeight() / bmi.getHeight()));			
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		scanner.close();
	}
}
