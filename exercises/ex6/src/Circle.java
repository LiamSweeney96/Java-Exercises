public class Circle {

    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double perimeter() {
        double perimeter = (Math.PI * radius) * 2;
        return perimeter;
    }
}
