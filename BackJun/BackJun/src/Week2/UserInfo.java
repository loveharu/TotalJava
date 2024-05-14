package Week2;

import java.util.*;
import java.util.Scanner;

public class UserInfo {

	private int weaponIndex;
	private int userHP = 200;
	private int damage;
	private weaponType weapon;
	private int x= 0;
	private int y= 0;

	public UserInfo() {
		super();
		chooseWeapon();
		
	}

	public int getWeaponIndex() {
		return weaponIndex;
	}

	public void setWeaponIndex(int weaponIndex) {
		this.weaponIndex = weaponIndex;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getUserHP() {
		return userHP;
	}

	public void setUserHP(int userHP) {
		this.userHP = userHP;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public weaponType getWeapon() {
		return weapon;
	}

	public void setWeapon(weaponType weapon) {
		this.weapon = weapon;
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
