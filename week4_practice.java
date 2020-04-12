package java_tutorials;

import java.util.Scanner;
public class week4_practice extends LoginDemo_0 {
	
	public static void main(String[] args) {
		//3개의 정수를 입력받아서 가장 큰 값을 출력. 단 삼항조건연산자를 사용하시오.
		Scanner scanner = new Scanner(System.in);
		System.out.println("5개의 정수를 공백으로 띄워서 입력하세요!");
		double i1 = scanner.nextDouble();
		double i2 = scanner.nextDouble();
		double i3 = scanner.nextDouble();
		double i4 = scanner.nextDouble();
		double i5 = scanner.nextDouble();
	
		
//		3항 연산자를 2번 써서 나타내기 		
		double max = ((i1>i2) ? i1:i2);
		max = ((max>i3) ? max:i3);
		max = ((max>i4) ? max:i4);
		max = ((max>i5) ? max:i5);
		
		
		System.out.println("Max값은 " + max + " 입니다.");
	}
	
	
	
}
