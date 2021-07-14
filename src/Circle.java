import java.util.Scanner;

public class Circle {
    double radius;

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    public void setRadius(double value) {
        radius = value;
    }
    public void requireParameters() {
        System.out.println("Enter the side: ");
        Scanner sc = new Scanner(System.in);
        this.setRadius(sc.nextDouble());
    }
    public void displayResults() {
        System.out.println("Area is: " + this.area());
        System.out.println("Perimeter is: " + this.perimeter());
    }
}
