package Week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonsterSpawn {

	
	public List<MonsterInfo> monsterNomral = new ArrayList();
	public List<MonsterInfo> monsterMagic = new ArrayList();
	public  List<MonsterInfo> monsterNamed = new ArrayList();
	public  List<MonsterInfo> monsterBoss = new ArrayList();
    private boolean exit = false;
	void spawnMonster() {

		Random random = new Random();
		
				for(int i = 0; i < 1; i++) {
					
				int monsterIndex = 0;
				int xn;
				int yn;
				do {
			        xn = random.nextInt(101) - 50;
			    } while (xn % 10 != 0); // 10으로 나누어 떨어지는 난수만 사용
			    do {
			        yn = random.nextInt(101) - 50;
			    } while (yn % 10 != 0);
				MonsterInfo normal = new MonsterInfo(monsterIndex, xn, yn);
				System.out.println(normal.getX() + "," + normal.getY() + "," + normal.getMonsterName() + ","
						+ normal.getMonsterHP() + "," + normal.getThisType().toString());
				monsterNomral.add(normal);
			
				}
				for(int i = 0; i < 1; i++) {
					int monsterIndex = 1;
				int xm;
				int ym;
				do {
					xm = random.nextInt(101) - 50;
			    } while (xm % 10 != 0); // 10으로 나누어 떨어지는 난수만 사용
			    do {
			    	ym = random.nextInt(101) - 50;
			    } while (ym % 10 != 0);
				MonsterInfo magic = new MonsterInfo(monsterIndex, xm, ym);
				System.out.println(magic.getX() + "," + magic.getY() + "," + magic.getMonsterName() + ","
						+ magic.getMonsterHP() + "," + magic.getThisType().toString());

				monsterMagic.add(magic);
				}
				
				for(int i = 0; i < 1;i++) {
					int monsterIndex = 2;
				int xN;
				int yN;
				do {
					xN = random.nextInt(101) - 50;
			    } while (xN % 10 != 0); // 10으로 나누어 떨어지는 난수만 사용
			    do {
			    	yN = random.nextInt(101) - 50;
			    } while (yN % 10 != 0);
				MonsterInfo named = new MonsterInfo(monsterIndex, xN, yN);
				System.out.println(named.getX() + "," + named.getY() + "," + named.getMonsterName() + ","
						+ named.getMonsterHP() + "," + named.getThisType().toString());

				monsterNamed.add(named);
				}
				
				for(int i = 0; i < 1; i++) {		
					int monsterIndex = 3;
				int xB;
				int yB;
				do {
					xB = random.nextInt(101) - 50;
			    } while (xB % 10 != 0); // 10으로 나누어 떨어지는 난수만 사용
			    do {
			    	yB = random.nextInt(101) - 50;
			    } while (yB % 10 != 0);
				MonsterInfo boss = new MonsterInfo(monsterIndex, xB, yB);
				System.out.println(boss.getX() + "," + boss.getY() + "," + boss.getMonsterName() + ","
						+ boss.getMonsterHP() + "," + boss.getThisType().toString());

				monsterBoss.add(boss);
				}
				
	}
		
	

	public List<MonsterInfo> getMonsterNomral() {
		return monsterNomral;
	}



	public void setMonsterNomral(List<MonsterInfo> monsterNomral) {
		this.monsterNomral = monsterNomral;
	}



	public List<MonsterInfo> getMonsterMagic() {
		return monsterMagic;
	}



	public void setMonsterMagic(List<MonsterInfo> monsterMagic) {
		this.monsterMagic = monsterMagic;
	}



	public List<MonsterInfo> getMonsterNamed() {
		return monsterNamed;
	}



	public void setMonsterNamed(List<MonsterInfo> monsterNamed) {
		this.monsterNamed = monsterNamed;
	}



	public List<MonsterInfo> getMonsterBoss() {
		return monsterBoss;
	}



	public void setMonsterBoss(List<MonsterInfo> monsterBoss) {
		this.monsterBoss = monsterBoss;
	}



	void setMonsterPos() {

	}
}