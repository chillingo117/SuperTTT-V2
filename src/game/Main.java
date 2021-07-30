package game;

public class Main {

	/**
	 * Main Loop
	 */
	public static void main(String[] args) {
		GameEnv env = GameEnv.getGame();
		env.setup();
		env.run();
	}
}
