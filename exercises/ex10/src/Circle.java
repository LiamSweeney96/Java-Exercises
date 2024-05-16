import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

public class Circle implements Writeable {

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

    public void writeTo (Writer destination) throws IOException {

        destination.write("Circle: r=" + String.format("%.4f", radius) + "\n");

    }
}
