package game;

public class Model {
    private static Model model = null;
    private GameEnv env = GameEnv.getGame();

    private String board = "Hello World";

    private Model(){};

    public static Model getModel(){
        if(model == null) {
            model = new Model();
        }
        return model;
    }

    public String getBoard () {
        return board;
    }

    public void quit() {
        env.quit();
    }

}
