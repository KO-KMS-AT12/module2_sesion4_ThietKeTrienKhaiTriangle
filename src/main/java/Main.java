import shape.Shape;
import shape.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.toString());
    }
}
