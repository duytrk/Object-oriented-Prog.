package Circle_Cylinder;

public class Circle {
    protected static final double PI = 3.14159;
    private double radius = 1;
    private String color = "red";

    /**  .*/
    public Circle() {};

    /**  .*/
    public Circle(double radius) {
        this.radius = radius;
    }

    /**  .*/
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**  .*/
    public double getRadius() {
        return this.radius;
    }

    /**  .*/
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**  .*/
    public String getColor() {
        return this.color;
    }

    /**  .*/
    public void setColor(String color) {
        this.color = color;
    }

    /**  .*/
    public double getArea() {
        return this.radius*this.radius*PI;
    }

    /**  .*/
    public String toString() {
        return "Circle[radius=r,color=c]";
    }
}
