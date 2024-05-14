package Week2;

import java.util.ArrayList;
import java.util.List;

public class MonsterInfo {
	private String monsterName;
	private int monsterHP;
	private int damage;
	private MonsterType thisType;
	private int monsterIndex;
	private int x;
	private int y;
	

	public MonsterInfo(int monsterIndex, int x, int y) {
		super();
		this.monsterIndex = monsterIndex;
		this.x = x;
		this.y = y;
		setMonster();
		

	}



	public MonsterInfo() {

	}

	public MonsterType getThisType() {
		return thisType;
	}

	public void setThisType(MonsterType thisType) {
		this.thisType = thisType;
	}

	public String getMonsterName() {
		return monsterName;
	}

	public void setMonsterName(String monsterName) {
		this.monsterName = monsterName;
	}

	public int getMonsterHP() {
		return monsterHP;
	}

	public void setMonsterHP(int monsterHP) {
		this.monsterHP = monsterHP;
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

	public enum MonsterType {
		NORMAL, MAGIC, NAMED, BOSS
	}



	public void setMonster() {

		switch (monsterIndex) {

		case 0:
			this.monsterName = "잡몹";
			this.damage = 10;
			this.monsterHP = 100;
			this.thisType = MonsterType.NORMAL;
			break;
		case 1:
			this.monsterName = "마법 몬스터";
			this.damage = 20;
			this.monsterHP = 80;
			this.thisType = MonsterType.MAGIC;
			break;
		case 2:
			this.monsterName = "네임드 몬스터";
			this.damage = 30;
			this.monsterHP = 150;
			this.thisType = MonsterType.NAMED;
			break;
		case 3:
			this.monsterName = "보스 몬스터";
			this.damage = 50;
			this.monsterHP = 250;
			this.thisType = MonsterType.BOSS;
			break;

		}
	}
}
