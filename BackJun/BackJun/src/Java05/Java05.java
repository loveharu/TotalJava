package Java05;

import java.util.Scanner;

public class Java05 {
	public static final int STATE_LOGOUT = 0;
	public static final int STATE_USER_LOGIN = 1;
	public static final int STATE_ADMIN_LOGIN = 2;
	public static final int STATE_EXIT = -1;

	public static String id[] = new String[100];
	public static String pw[] = new String[100];
	public static double account[] = new double[100];
	// 관리자정보

	public static String adminId = "admin";
	public static String adminPw = "1111";
	public static int totalUserCount = 0;
	public static int LoginUserIndex = 1;
	public static int LoginUserState = Java05.STATE_LOGOUT;

	public static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static String inputId = null;
	public static String inputPw = null;
	public static double inputAccount = 0;

	public static void main(String[] args) {
		// 1명의 관리자와 100명의 은행사용자를 관리하는 프로그램
		Java05.id[0] = "user1";
		Java05.pw[0] = "user1";
		Java05.account[0] = 1000;
		Java05.id[1] = "user2";
		Java05.pw[1] = "user2";
		Java05.account[1] = 2000;
		Java05.id[2] = "user3";
		Java05.pw[2] = "user3";
		Java05.account[2] = 3000;
		Java05.totalUserCount = 3;

		while (Java05.LoginUserState != Java05.STATE_EXIT) {

			// 로그인 작업

			System.out.println("아이디와 pw를 입력하세요" + ".종료하고 싶으면  EXIT를 입력하세요.");
			System.out.println("id>>");
			Java05.inputId = sc.nextLine();
			System.out.println("pw>>");
			Java05.inputPw = sc.nextLine();
			// 로그인 시도전 초기상태를 로그아웃으로 만듬

			Java05.LoginUserState = Java05.STATE_LOGOUT;
			for (int i = 0; i < Java05.totalUserCount; i++) {
				// System.out.println(i);
				if (Java05.id[i].equals(Java05.inputId)) {// id 찾음
					if (Java05.pw[i].equals(Java05.inputPw)) {
						// 로그인 성공//user1~3 user1~3
						System.out.println(id[i] + " 님 로그인 하셨습니다.");
						Java05.LoginUserIndex = i;
						Java05.LoginUserState = Java05.STATE_USER_LOGIN;
					} else {// user1~3 패스워드 틀릴경우

						System.out.println("잘못된 패스워드 입력");
					}
					break;
				}

			}
			if (Java05.LoginUserState != Java05.STATE_USER_LOGIN) {

				// 관리자인지 확인

				if (Java05.adminId.equals(Java05.inputId) && Java05.adminPw.equals

				(Java05.inputPw)) {

					System.out.println("관리자로 로그인 하였습니다.");// admin 1111

					Java05.LoginUserState = Java05.STATE_ADMIN_LOGIN;

				} else {

					System.out.println("없는 아이디 입니다. 다시입력해주세요.");

				}

			}

			// 사용자가 프로그램 종료요청시 실행

			if (Java05.inputId.equals("EXIT")) {

				Java05.LoginUserState = Java05.STATE_EXIT;
			}
			switch (Java05.LoginUserState) {

			case Java05.STATE_ADMIN_LOGIN:
				System.out.println("관리자 관련 작업메뉴");
				break;
			case Java05.STATE_USER_LOGIN:
				System.out.println("사용자 관련 작업메뉴");
				break;
			case Java05.STATE_LOGOUT:
				System.out.println("로그아웃된 상태입니다.");
				break;
			case Java05.STATE_EXIT:
				System.out.println("프로그램을 종료합니다.");
				break;

			default:
				System.out.println("알수 없는 문제가 발생한 상태입니다.");

			}
		} // while문 종료

		System.out.println("프로그램 종료");

		System.out.println("관리자 관련 작업메뉴");

		boolean isAdmMenu = true;

		while (isAdmMenu) {

			System.out.println("1.계정추가 2.계정삭제 3. id변경 4.모든 사용자 출력 5.종료");

			switch (Java05.sc.nextLine()) {

			case "1":

				System.out.println("추가할 id>>");

				inputId = sc.nextLine();

				System.out.println("추가할 pw>>");

				inputPw = sc.nextLine();

				id[Java05.totalUserCount] = inputId;

				pw[Java05.totalUserCount] = inputPw;

				account[Java05.totalUserCount] = 100;

				System.out.println(id[Java05.totalUserCount] + "계정생성");

				Java05.totalUserCount++;

				break;

			case "2":

				System.out.println("삭제할 id>>");// 삭제 작업

				inputId = sc.nextLine();

				int findIndex = Java05.totalUserCount;

				for (int i = 0; i < Java05.totalUserCount; i++) {

					if (id[i].equals(inputId)) {// 찾음

						findIndex = i;

					}

				}

				for (int i = findIndex; i < Java05.totalUserCount - 1; i++) {

					id[i] = id[i + 1];

					pw[i] = pw[i + 1];

					account[i] = account[i + 1];

				}

				Java05.totalUserCount--;

				break;

			case "3":

				System.out.println("변경할 id>>");

				inputId = sc.nextLine();

				for (int i = 0; i < Java05.totalUserCount; i++) {

					if (id[i].equals(inputId)) {

						// 찾음

						System.out.println("변경할 id>>");

						id[i] = sc.nextLine();

						System.out.println("변경할 pw>>");

						pw[i] = sc.nextLine();

					}

				}

				break;

			case "4":

				System.out.println("출력 시작");

				for (int i = 0; i < Java05.totalUserCount; i++) {

					System.out.print(i + " 번째 id>>" + id[i]);

					System.out.print(" pw>>" + pw[i]);

					System.out.println(" account>>" + account[i]);

				}

				System.out.println("모두 출력");

				break;

			case "5":

				System.out.println("관리자 메뉴 종료");

				Java05.LoginUserIndex = Java05.STATE_LOGOUT;

				isAdmMenu = false;

				break;

			}

		}
		boolean isUseMenu = true;

		while (isUseMenu) {

			System.out.println("1.입금 2.출금 3.잔액 조회 4.종료 입력>>");

			switch (sc.nextLine()) {

			case "1":

				System.out.println("입금액 입력>>");

				inputAccount = Double.parseDouble(sc.nextLine());

				account[Java05.LoginUserIndex] += inputAccount;

				System.out.println(id[Java05.LoginUserIndex] + "님 잔액:" + account[Java05.LoginUserIndex]);

				break;

			case "2":

				System.out.println("출금액 출력>>");

				inputAccount = Double.parseDouble(sc.nextLine());

				account[Java05.LoginUserIndex] -= inputAccount;

				System.out.println(id[Java05.LoginUserIndex] + "님 잔액:" + account[Java05.LoginUserIndex]);

				break;

			case "3":

				System.out.println("잔액 조회>>");

				System.out.println(id[Java05.LoginUserIndex] + "님 잔액:" + account[Java05.LoginUserIndex]);

				break;

			case "4":

				System.out.println("사용자 메뉴 종료");

				Java05.LoginUserState = Java05.STATE_LOGOUT;

				isUseMenu = false;

				break;
			}
		}
	}// main메소드 종료

// 클래스 종료
}
