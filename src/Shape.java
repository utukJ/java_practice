import java.util.*;

public interface Shape {
    double area();
    double perimeter();
    void requireParameters();
    void displayResults();

    public static void main(String args[]){
        ShapeFactory factory = new ShapeFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter shape name: ");
        Shape shape = factory.getShape(sc.next());
        if (shape == null){
            System.out.println("Invalid shape!");
        }
        else {
            shape.requireParameters();
            shape.displayResults();
        }
    }
}


