package Shapes.model;

public class Circle extends Shape {

    public Circle(int newX, int newY) {
        super(newY, newY);

    }

    private int radius = 0;

    // get radius of the circle

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * getRadius()); 
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int newRadius) {
        if (newRadius >= 0) {
            radius = newRadius;
        }
    }

    public int getArea() {
        return (int) (Math.PI * Math.pow(getRadius(), 2));
    }
}