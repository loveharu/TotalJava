package Week2;

public class MakeGameMain {

	public static void main(String[] args) {
		MonsterSpawn spawn = new MonsterSpawn();
		spawn.spawnMonster();
		PlayGame play = new PlayGame();
		play.startGame();
	}

}
