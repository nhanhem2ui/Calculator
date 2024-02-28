package Controller;

import Model.Circle;
import Model.Rectangle;
import Model.Shape;
import Model.Triangle;
import View.Menu;
import java.util.Scanner;

public class Handler {

    private Scanner scanner;
    public Handler() {
        
        scanner = new Scanner(System.in);
    }

    public void triangle() {
        System.out.println("Enter side A of triangle:");
        double sideA = scanner.nextDouble();
        System.out.println("Enter side B of triangle:");
        double sideB = scanner.nextDouble();
        System.out.println("Enter side C of triangle:");
        double sideC = scanner.nextDouble();
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        performOperation(triangle);
    }

    public void rectangle() {
        System.out.println("Enter width of rectangle:");
        double width = scanner.nextDouble();
        System.out.println("Enter length of rectangle:");
        double length = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, length);
        performOperation(rectangle);
    }

    public void circle() {
        System.out.println("Enter radius of circle:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        performOperation(circle);
    }

    private void performOperation(Shape shape) {
        Menu<String> menu = new Menu<>("What to do", new String[]{
            "Get perimeter",
            "Get area",
            "Print result",
            "Exit"
        }) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1 ->
                        System.out.println("Perimeter: " + shape.getPerimeter());
                    case 2 ->
                        System.out.println("Area: " + shape.getArea());
                    case 3 ->
                        shape.printResult();
                    case 4 ->
                        System.exit(0);
                    default ->
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        };
        menu.run();
    }
}
