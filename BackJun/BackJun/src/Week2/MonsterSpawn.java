package Week2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MonsterSpawn {

	
	public List<MonsterInfo> monsters = new ArrayList();
	
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
				monsters.add(normal);			
				for(MonsterInfo info : monsters) {
					System.out.println(info.getX() + "," + info.getY() + "," + info.getMonsterName() + ","
                            + info.getMonsterHP() + "," + info.getThisType().toString());
					
				}
			
			
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
				monsters.add(magic);
				for(MonsterInfo info : monsters) {
					System.out.println(info.getX() + "," + info.getY() + "," + info.getMonsterName() + ","
                            + info.getMonsterHP() + "," + info.getThisType().toString());
					
				}
				
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
				monsters.add(named);
				for(MonsterInfo info : monsters) {
					System.out.println(info.getX() + "," + info.getY() + "," + info.getMonsterName() + ","
                            + info.getMonsterHP() + "," + info.getThisType().toString());
					
				}
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
				monsters.add(boss);
				for(MonsterInfo info : monsters) {
					System.out.println(info.getX() + "," + info.getY() + "," + info.getMonsterName() + ","
                            + info.getMonsterHP() + "," + info.getThisType().toString());
					
				}
				
				}
			PlayGame sendInfo = new PlayGame(monsters);
				
	}
	public List<MonsterInfo> getMonsters(){
		
		return monsters;
	}
		
	

	
}
