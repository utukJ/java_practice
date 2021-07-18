import java.util.Locale;
import java.util.Scanner;

public class ShapeFactory {
    public Shape getShape(String shapeName){
        switch(shapeName.toLowerCase(Locale.ROOT)) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}

