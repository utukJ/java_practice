import java.util.Scanner;

public class Rectangle {
    double length;
    double width;

    public void setLength(double value){
        length = value;
    }
    public void setWidth(double value){
        width = value;
    }
    public double area() {
        return length * width;
    }
    public double perimeter() {
        return (length + width) * 2;
    }
    public void requireParameters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        this.setLength(sc.nextDouble());
        System.out.println("Enter the width: ");
        this.setWidth(sc.nextDouble());
    }
    public void displayResults() {
        System.out.println("Area of Rectangle is: " + this.area());
        System.out.println("Perimeter of Rectangle is: " + this.perimeter());
    }
}
