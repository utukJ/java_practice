import java.util.*;

public class Shape {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shape name: ");
        String shape_name = sc.next().toLowerCase();

        if (shape_name.equals("rectangle")) {
            Rectangle shape = new Rectangle();
            shape.requireParameters();
            shape.displayResults();
        } else if (shape_name.equals("square")) {
            Square shape = new Square();
            shape.requireParameters();
            shape.displayResults();
        } else if (shape_name.equals("circle")) {
            Circle shape = new Circle();
            shape.requireParameters();
            shape.displayResults();
        } else {
            System.out.println("Invalid shape!");
            return;
        }
    }
}
