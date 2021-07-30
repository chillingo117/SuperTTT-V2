package game;

import validation.Validation;

import java.util.Arrays;
import java.util.Scanner;

public class View {
    private static View view = null;
    private static final Scanner scanner = new Scanner(System.in);

    private Model model = Model.getModel();
    private Controller controller = Controller.getController();

    private View(){ }

    public static View getView(){
        if(view == null){
            view = new View();
        }
        return view;
    }

    public void displayBoard () {
        String boardFormat = "" +
                "[Y]-----------------------[ ]\n" +
                "[1] %s %s %s | %s %s %s | %s %s %s [ ]\n" +
                "[2] %s %s %s | %s %s %s | %s %s %s [ ]\n" +
                "[3] %s %s %s | %s %s %s | %s %s %s [ ]\n" +
                "[ ]-----------------------[ ]\n" +
                "[4] %s %s %s | %s %s %s | %s %s %s [ ]\n" +
                "[5] %s %s %s | %s %s %s | %s %s %s [ ]\n" +
                "[6] %s %s %s | %s %s %s | %s %s %s [ ]\n" +
                "[ ]-----------------------[ ]\n" +
                "[7] %s %s %s | %s %s %s | %s %s %s [ ]\n" +
                "[8] %s %s %s | %s %s %s | %s %s %s [ ]\n" +
                "[9] %s %s %s | %s %s %s | %s %s %s [ ]\n" +
                "[ ]-1-2-3---4-5-6---7-8-9-[N]";
        String toDisplay = String.format(boardFormat, (Object[]) model.getBoard());
        System.out.println(toDisplay);
    }

    public int getCoord(String coord){
        System.out.printf("%s-coord: %n", coord);
        String s = scanner.nextLine();
        while(!Validation.isValidCoord(s)){
            System.out.println("Please input a number between 1 and 9.");
            System.out.println("%s-coord: ");
            s = scanner.nextLine();
        }
        return Integer.parseInt(s);
    }

    public void makeTurn(){
        String currentPlayerChar = model.getCurrentPlayer();
        System.out.printf("Player %s, place your mark.%n", currentPlayerChar);
        int x = getCoord("X");
        int y = getCoord("Y");
        controller.makeTurn(currentPlayerChar, x, y);
    }

    public void requestUserInput () {
        System.out.println("Please type 'yes' to quit");
        String ans = scanner.nextLine();
        while(!controller.receiveUserInput(ans)){
            System.out.println("Please type 'yes' to quit");
            ans = scanner.nextLine();
        }
    }

}
