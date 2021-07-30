package game;

public class Controller {
    private static Controller controller = null;
    private Model model = Model.getModel();

    private Controller(){}

    public static Controller getController(){
        if(controller == null){
            controller = new Controller();
        }
        return controller;
    }

    public void makeTurn(String playerChar, int x, int y){
        model.makeTurn(playerChar, x, y);
    }

    public boolean receiveUserInput(String input){
        if (input.equals("yes")){
            model.quit();
            return true;
        } else {
            return false;
        }
    }
}
