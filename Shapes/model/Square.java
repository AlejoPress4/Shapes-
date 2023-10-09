package Shapes.model;

public class Square extends Shape {

    public Square(int newx, int newy, int newWidth) {

        super(newx, newy);
        setWidth(newWidth);

    }

    public Square(int newWidth) {
        this(0, 0, newWidth);
    }

    private int width = 0;

    public int getWidth() {
        return width;
    }

    public void setWidth(int newWidth) {
        if (newWidth >= 0) {
            width = newWidth;
        }
    }

    public int getHeight() {
        return getWidth();
    }

    public void setHeight(int newHeight) {
        setHeight(newHeight);
    }

        @Override
        public int getArea() {
            return getWidth() * getHeight();
        }

        @Override
        public int getPerimeter() {
            return 2 * getHeight() + 2 * getWidth();
        }

        public Square(int newX, int newY) {
            super(newX, newY);
        }
    }

