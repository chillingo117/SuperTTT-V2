package game;

public class Main {

	/**
	 * main function that starts and ends the game
	 * @param args
	 */
	public static void main(String[] args) {
		GameEnv env = GameEnv.getGame();
		env.setup();
		env.run();
	}
}
