class Circle {
    private double radius = 1.0;
    private String color = "red";

    // Constructor không tham số
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor có tham số radius
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    // Constructor có tham số radius, color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter cho radius
    public double getRadius() {
        return radius;
    }

    // Getter cho color
    public String getColor() {
        return color;
    }

    // Setter cho radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Setter cho color
    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}

class Cylinder extends Circle {
    private double height = 1.0;

    // Hoàn thiện constructor không tham số cho Cylinder
    public Cylinder() {
        super();
        this.height = 1.0;
    }

    // Hoàn thiện constructor có tham số (radius)
    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }

    // Hoàn thiện constructor có tham số (radius, height)
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Hoàn thiện constructor có tham số (radius, height, color)
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // Hoàn thiện getter cho height
    public double getHeight() {
        return height;
    }

    // Hoàn thiện phương thức tính thể tích
    public double getVolume() {
        return getArea() * height;
    }

    // Hoàn thiện phương thức toString cho Cylinder
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}

public class Bai01 {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "blue");
        System.out.println(circle.toString());
        System.out.println(circle.getArea());

        Cylinder cylinder = new Cylinder(2.0, 3.0, "green");
        System.out.println(cylinder.toString());
        System.out.println(cylinder.getVolume());
    }
}
