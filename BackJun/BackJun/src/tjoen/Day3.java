package tjoen;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.*;
import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int change1000 = 0, change500 = 0, change100 = 0, change50 = 0, change10 = 0, moneyInput;
		System.out.println("금액을 입력하세요");
		int account = sc.nextInt();
		
			change1000 = account / 1000;
			int rest = account % 1000;
			change500 = rest / 500;
			int rest2 = rest % 500;
			change100 = rest2 / 100;
			int rest3 = rest2 % 100;
			change50 = rest3 / 50;
			int rest4 = rest3 % 50;
			change10 = rest4 / 10;
			int rest5 = rest4 % 10;

		

		System.out.println("천원짜리" + change1000 + "개, 오백원짜리 " + change500 + "개, 백원짜리" + change100 + "개, 오십원짜리 "
				+ change50 + "개, 십원짜리 " + change10 + "개");
		/*
		 * while (true) { System.out.println("원하는 메뉴 입력 1. 입금 2. 조회 4.종료"); int menu =
		 * sc.nextInt(); switch (menu) { case 1: System.out.println("입금액을 입력하세요."); int
		 * inputMoney= sc.nextInt(); account += inputMoney; break; case 2:
		 * System.out.println("출금액을 입력하세요."); int outputMoney= sc.nextInt(); account -=
		 * outputMoney; break; case 3: System.out.println("현재 통장 잔애은 "+ account +
		 * "원 입니다."); default: System.out.println("종료합니다"); System.exit(0); }
		 */
	}
}