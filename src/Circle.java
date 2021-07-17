import java.util.Scanner;

public class Circle implements Shape {
    double radius;

    public void setRadius(double value) {
        radius = value;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void requireParameters() {
        System.out.println("Enter the radius: ");
        Scanner sc = new Scanner(System.in);
        this.setRadius(sc.nextDouble());
    }

    @Override
    public void displayResults() {
        System.out.println("Area of circle is: " + this.area());
        System.out.println("Perimeter of circle is: " + this.perimeter());
    }
}
