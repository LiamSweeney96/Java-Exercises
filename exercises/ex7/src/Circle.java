public class Circle {

    private final double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double r) {

        if (r <= 0) {
            throw new IllegalArgumentException("Invalid radius");
        }
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return (Math.PI * radius) * 2;
    }

    @Override
    public String toString() {
        return String.format("Circle(radius=%.4f)", radius);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        } else if (obj instanceof Circle) {

            Circle objCircle = (Circle) obj;
            double difference = this.radius - objCircle.radius;

            return difference > -0.00005 && difference < 0.00005;
        }

        return false;
    }
}


