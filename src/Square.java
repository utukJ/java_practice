import java.util.Scanner;

public class Square implements Shape {
    double side;

    public void setSide(double value){
        side = value;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public void requireParameters() {
        System.out.println("Enter the side: ");
        Scanner sc = new Scanner(System.in);
        this.setSide(sc.nextDouble());
    }

    @Override
    public void displayResults() {
        System.out.println("Area of Square is: " + this.area());
        System.out.println("Perimeter of Square is: " + this.perimeter());
    }

}
