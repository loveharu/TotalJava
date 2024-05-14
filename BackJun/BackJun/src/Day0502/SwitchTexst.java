package Day0502;

import java.util.Scanner;
public class SwitchTexst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요>>");
		int input =sc.nextInt();
		int b =sc.nextInt();
		if(input>10) 
			System.out.println("10보다 크다");
		else if(input<10)
			System.out.println("10보다 작다");
	    System.exit(0);
		
		
	}
}
