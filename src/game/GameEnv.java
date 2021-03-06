package game;

/**
 * Contains the main function which initiates the game.
 * A GameEnvironment is instantiated when the game starts.
 *
 */

public class GameEnv {
    private static GameEnv env = null;
    private boolean run = true;

    private Model model = null;
    private Controller controller = null;
    private View view = null;

    private GameEnv () {};
    public static GameEnv getGame(){
        if(env == null){
            env = new GameEnv();
        }
        return(env);
    }

    public void setup(){
        model = Model.getModel();
        controller = Controller.getController();
        view = View.getView();
    }

    public void run() {
        while(run){
            view.displayBoard();
            view.makeTurn();
        }
    }

    public void quit(){
        run = false;
    }
}
