package day04;

public class Calculator { 
	int number1;
	int number2;
	String operator;
	
	int getNumber1() {
		return number1;
	}
	void setNumber1(int number1) {
		this.number1 = number1;
	}
	
	int getNumber2() {
		return number2;
	}
	void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	String getOperator() {
		return operator;
	}
	void setOperator(String operator) {
		this.operator = operator;
	}
	
	int add(int a, int b) {
		return a + b;
	}
	
	int subtrace(int a, int b) {
		return a - b;
	}
	
	int multiply(int a, int b) {
		return a * b;
	}
	
	double divide(int a, int b) {
		return (double)a / b;
	}
}
