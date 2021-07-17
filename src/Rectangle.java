import java.util.Scanner;

public class Rectangle implements Shape {
    double length;
    double width;

    public void setLength(double value){
        length = value;
    }
    public void setWidth(double value){
        width = value;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return (length + width) * 2;
    }

    @Override
    public void requireParameters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        this.setLength(sc.nextDouble());
        System.out.println("Enter the width: ");
        this.setWidth(sc.nextDouble());
    }

    @Override
    public void displayResults() {
        System.out.println("Area of Rectangle is: " + this.area());
        System.out.println("Perimeter of Rectangle is: " + this.perimeter());
    }
}
