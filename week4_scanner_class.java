package java_tutorials;

import java.util.Scanner;

/* 
 for(초기화; 조건식; 증감식;){
	조건식이 참일 때 수행되는 부분
}
*/


public class week4_scanner_class extends LoginDemo_0 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수값(n)을 입력하세요.");
		double n = scanner.nextInt();
		double i = 1;
		double result = 0;
		
		for(double n1 = 1; n1 <= n; n1++) {
//			System.out.println(i/n1);
			result += i/n1;
		}
		System.out.println(result);
		
		
	}

}
