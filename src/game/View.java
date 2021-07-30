package game;

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
        System.out.println(model.getBoard());
        requestUserInput();
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
