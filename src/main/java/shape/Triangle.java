package shape;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    public double getArea() {
        return Math.sqrt((getPerimeter() / 2)
                * ((getPerimeter() / 2) - getSide1())
                * ((getPerimeter() / 2) - getSide2())
                * ((getPerimeter() / 2) - getSide3()));
    }

    @Override
    public String toString() {
        return "Toan giac co 3 canh lan luot la : " + getSide1() + ", " + getSide2()
                + ", " + getSide3() + " co dien tich va chu vi la : "
                + getArea() + ", " + getPerimeter() + " Is "
                + super.toString();
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}
