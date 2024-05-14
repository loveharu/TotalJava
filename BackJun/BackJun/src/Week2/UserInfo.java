package Week2;

import java.util.*;
import java.util.Scanner;

public class UserInfo {

	private int weaponIndex;
	private int userHP = 200;
	private int damage;
	private weaponType weapon;

	public UserInfo() {
		super();
		chooseWeapon();
		System.out.println(this.weapon.toString());
	}

	enum weaponType {
		SWORD, HAMMER, ARROW
	}

	void chooseWeapon() {
		Scanner sc = new Scanner(System.in);
		System.out.println("무기를 선택하시오>(1.칼 2. 망치 3. 활)");
		weaponIndex = sc.nextInt();

		switch (weaponIndex) {
		case 1:
			weapon = weaponType.SWORD;
			this.damage = 50;
			break;
		case 2:
			weapon = weaponType.HAMMER;
			this.damage = 70;
			break;
		case 3:
			weapon = weaponType.ARROW;
			this.damage = 60;
			break;
		default:
			System.out.println("잘못된 입력!");
			chooseWeapon();

		}
	}

}
