package Week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayGame {

	private List<MonsterInfo> monsters;
	UserInfo user;
	int result = 0;

	// GameManager 객체 설정 메서드

	public PlayGame() {

	}

	public PlayGame(List<MonsterInfo> monsters) {

		this.monsters = monsters;
		System.out.println("킬킬" + this.monsters.get(0).getMonsterName());
		System.out.println(this.monsters.size());
	}

	Scanner sc = new Scanner(System.in);

	void startGame() {
		while (true) {

			System.out.println("게임 시작(1.시작 2.종료)");
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				user = new UserInfo();
				break;
			case 2:
				System.exit(0);
				break;
			default:
				System.out.println("잘못된 숫자 입력!");
				break;
			}
			if (menu == 1 || menu == 2)
				break;
		}
		doSomething();

	}

	void moveUser() {
		System.out.println("유저를 이동시켜보세요! (위 = w ,아래 = s ,왼쪽 = a ,오른쪽 = d");
		String getCmd = sc.nextLine();

		switch (getCmd) {
		case "w":
			System.out.println("위로 이동");
			int y = user.getY() + 10;
			user.setY(y);
			System.out.println("현재 위치 x :" + user.getX() + ", y: " + user.getY());			
			System.out.println(result);
			break;
		case "a":
			System.out.println("왼쪽으로 이동");
			int xLeft = user.getX() - 10;
			user.setX(xLeft);
			System.out.println("현재 위치 x :" + user.getX() + ", y: " + user.getY());
			System.out.println(result);
			break;
		case "s":
			System.out.println("아래로 이동");
			int yDown = user.getY() - 10;
			user.setY(yDown);
			System.out.println("현재 위치 x :" + user.getX() + ", y: " + user.getY());
			System.out.println(result);
			break;
		case "d":
			System.out.println("오른쪽으로 이동");
			int xRight = user.getX() + 10;
			user.setX(xRight);
			System.out.println("현재 위치 x :" + user.getX() + ", y: " + user.getY());
			System.out.println(result);
			break;
		default:
			System.out.println("잘못된 입력!");
			break;
		}

	}

	void doSomething() {
		System.out.println(
				"유저의 hp: " + user.getUserHP() + " 유저의 공격력: " + user.getDamage() + " 유저의 무기는: " + user.getWeapon());

		while (true) {
			matchPosition();
			System.out.println("행동을 선택하세요 (1.이동 2. 공격 3. 방어 4. 도주)");
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				moveUser();
				break;
			case 2:

				switch (result) {
				case 1:
					System.out.println("일반 몬스터와 충돌!!");
					result = 0;
					break;
				case 2:
					System.out.println("마법 몬스터와 충돌!");
					result = 0;
					break;
				case 3:
					System.out.println("네임드 몬스터와 충돌!");
					result = 0;
					break;
				case 4:
					System.out.println("보스 몬스터와 충돌!");
					result = 0;
					break;
				default:
					System.out.println("주변에 몬스터가 없습니다.!");
					break;
				}

			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("몬스터 포지션 매칭");
				// matchPosition();
				break;
			default:
				System.out.println("잘못된 숫자 입력!");
				break;
			}

		}
	}

	void matchPosition() {

     for(MonsterInfo info : monsters) {
    	 System.out.println(info.getX());
     }
	}
}
