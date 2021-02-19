/*
    Studenti: Dobos Alexandru-Cristian & Murariu Gabriela
    An, Grupa: 2B3
    #Laborator_1 - Ingineria Programarii
*/
interface IFigure {
    public double computeArea();
}

abstract class Shape implements IFigure {
    private double area;

    public Shape() {
        System.out.print("I am a shape, ");
    }

    public double computeArea() {
        return area;
    }
}

class Circle extends Shape {
    private double radius;
    public final double pi = 3.14;

    public Circle(double raza) {
        radius = raza;
        System.out.println("a circle.");
    }

    public void setRadius(double raza) {
        radius = raza;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        System.out.print("a rectangle");
        this.width = w;
        this.height = h;
    }

    public Rectangle(Square s) {
        System.out.println("a rectangle with equal sides.");
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public Triangle[] splitIntoTriangles() {
        System.out.println("Triangles from rectangle (the next two):");
        Triangle[] t1 = {new Triangle(width, height), new Triangle(width, height)};
        return t1;
    }
}

class Square extends Rectangle {
    private double side;

    public Square(double s) {
        super(s, s);
        this.side = s;
        System.out.println(", a square.");
    }

    public void setSide(double s) {
        this.side = s;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double b, double h) {
        System.out.println("a triangle.");
        this.base = b;
        this.height = h;
    }

    public void setBase(double b) {
        this.base = b;
    }

    public void setHeight(double h) {
        this.height = h;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle figure1 = new Circle(5);
        Square figure2 = new Square(3);
        Rectangle figure3 = new Rectangle(figure2);
        Triangle figure4 = new Triangle(3, 3);
        Triangle[] fromRectangle1 = figure3.splitIntoTriangles();
        Triangle[] fromRectangle2 = figure3.splitIntoTriangles();
    }
}
