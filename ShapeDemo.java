interface Shape {
    void draw();
    void resize(int factor);
}

class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing Circle with radius: " + radius);
    }

    public void resize(int factor) {
        radius *= factor;
    }
}

class Line implements Shape {
    double length;

    Line(double length) {
        this.length = length;
    }

    public void draw() {
        System.out.println("Drawing Line with length: " + length);
    }

    public void resize(int factor) {
        length *= factor;
    }
}

class Rectangle implements Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Drawing Rectangle with width: " + width + ", height: " + height);
    }

    public void resize(int factor) {
        width *= factor;
        height *= factor;
    }
}

class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }

    public void draw() {
        System.out.println("Drawing Square with side: " + width);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.draw();
        circle.resize(2);

        Shape line = new Line(10);
        line.draw();
        line.resize(2);

        Shape rectangle = new Rectangle(4, 6);
        rectangle.draw();
        rectangle.resize(2);

        Shape square = new Square(4);
        square.draw();
        square.resize(2);
    }
}
