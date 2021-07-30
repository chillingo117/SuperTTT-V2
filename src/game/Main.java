package game;

public class MainClass {

	/**
	 * main function that starts and ends the game
	 * @param args
	 */
	public static void main(String[] args) {
		//Creates new game environment and waits for it be finished, then generates win message
		GameEnv env = new GameEnv();
        env.setup();
		//Until the game is finished, keep prompting turns to be made
		while (!env.isFinished()) {
			env.turn();
		}

	}
}
