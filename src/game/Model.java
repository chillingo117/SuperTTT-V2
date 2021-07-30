package game;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Model {
    private static Model model = null;
    private final GameEnv env = GameEnv.getGame();

    private String currentPlayer = "X";
    private String[] board = {
            " "," "," ",   " "," "," ",   " "," "," ",
            " "," "," ",   " "," "," ",   " "," "," ",
            " "," "," ",   " "," "," ",   " "," "," ",

            " "," "," ",   " "," "," ",   " "," "," ",
            " "," "," ",   " "," "," ",   " "," "," ",
            " "," "," ",   " "," "," ",   " "," "," ",

            " "," "," ",   " "," "," ",   " "," "," ",
            " "," "," ",   " "," "," ",   " "," "," ",
            " "," "," ",   " "," "," ",   " "," "," ",
    };

    private Model(){};

    public static Model getModel(){
        if(model == null) {
            model = new Model();
        }
        return model;
    }

    public String[] getBoard () {
        return board;
    }

    public void makeTurn(String playerChar, int x, int y){
        int location = ((x-1) + (y-1)*9);
        board[location] = playerChar;
        if(playerChar.equals("X")){
            currentPlayer = "O";
        } else {
            currentPlayer = "X";
        }
    }

    public String getCurrentPlayer(){
        return currentPlayer;
    }

    public void quit() {
        env.quit();
    }

}
