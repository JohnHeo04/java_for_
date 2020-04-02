package java_tutorials;

import java.util.Scanner;

public class buying_Money_algorithm extends LoginDemo_0 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	
		System.out.print("돈의 액수를 입력하세요.");
		int money = scanner.nextInt();
		int a = money % 500;
		int b = money / 500;
		int c = a % 100;
		int d = a / 100;
		int e = c % 10;
		int f = c / 10;
		int g = e % 1;
		int h = e / 1;
		
		
		System.out.println("500원 ->" + b);
		System.out.println("100원 ->" + d);
		System.out.println("10원 ->" + f);
		System.out.println("1원 ->" + h);
		
		
		
/*	System.out.print("돈의 액수를 입력하세요.");
	int money = scanner.nextInt();
	int obaek = (money / 500);
	int baek = (obaek / 100);
	int sib = (baek / 10);
	int ill = (sib / 1);
	
	System.out.println("5백원 ->" + obaek);
	System.out.println("1백원 ->" + baek);
	System.out.println("10원 ->" + sib);
	System.out.println("1원 ->" + ill); 
*/	


		
	}
}
