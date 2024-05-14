package Week2;

public class MakeGameMain {

	public static void main(String[] args) {
		
		PlayGame play = new PlayGame();
		MonsterSpawn spawn = new MonsterSpawn();
		spawn.spawnMonster();
		play.startGame();
	}

}
