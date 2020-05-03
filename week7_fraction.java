package org.opentutorials.javatutorials.numberstring;
import java.io.*;

public class week7_fraction {

//	public static String numbering(int init, int limit) {
//		// TODO Auto-generated method stub
//		int i = init;
//		String output = "";
//		while (i < limit) {
//			output += i;
//			i++;
//		}
//		return output;
//	}
//	// 여러 줄 주석처리 원하는 줄 드래그 + Cmd(Ctrl) + Shift + C
//
//	public static void main(String[] args) {
//		String result = numbering(1, 5);
//		// numbering(3);
//		System.out.println(result);
//		try {
//			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
//			out.write(result);
//			out.close();
//		} catch (IOException e) {
//		}
//	}
//	public static int one() {
//		return 1;
//		return 2
//		return 3;
//	}
//	
//	public static void main(String[] args) {
//		System.out.println(one());
//	}
//	
//}
		public static String num(int i) {
			if(i==0) {
				return "zero";
			} else if(i==1) {
				return "one";
			} else if(i==2) {
				return "two";
			}
			return "none";
		}
		
		public static void main(String[] args) {
			System.out.println(num(2));
		}
}
	
	
	
	
	
	
	
	
	
