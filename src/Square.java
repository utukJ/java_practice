import java.util.Scanner;

public class Square {
    double side;

    public void setSide(double value){
        side = value;
    }
    public double area() {
        return Math.pow(side, 2);
    }
    public double perimeter() {
        return 4 * side;
    }
    public void requireParameters() {
        System.out.println("Enter the side: ");
        Scanner sc = new Scanner(System.in);
        this.setSide(sc.nextDouble());
    }
    public void displayResults() {
        System.out.println("Area is: " + this.area());
        System.out.println("Perimeter is: " + this.perimeter());
    }

}
