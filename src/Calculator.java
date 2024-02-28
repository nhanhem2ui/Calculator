
import Controller.Handler;
import View.Menu;

public class Calculator {

    Handler handler;

    public Calculator() {
        handler = new Handler();
    }

    public void displayMainMenu() {
        Menu<String> mainMenu = new Menu<>("Calculator Shape Program", new String[]{
            "Triangle",
            "Circle",
            "Rectangle",
            "Exit"
        }) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1 ->
                        handler.triangle();
                    case 2 ->
                        handler.circle();
                    case 3 ->
                        handler.rectangle();
                    case 4 ->
                        System.exit(0);
                    default ->
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        };
        mainMenu.run();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.displayMainMenu();
    }
}
