package ClassQuastion;

import java.util.*;
public class Hello {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요>>");
		String cmd = sc.nextLine();
		
		switch(cmd) {
		case "안녕":
			System.out.println("너도 안녕");
			break;
		case "잘자":
			System.out.println("너도 잘자");
			break;
		case "잘가":
			System.out.println("너도 잘가");
			break;
		}
		
	}

}
