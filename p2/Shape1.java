package p2;


    
// Shape class
class Shape {
    public void printShape() {
        System.out.println("This is a shape.");
    }
}

// Rectangle class inheriting from Shape
class Rectangle extends Shape {
    @Override
    public void printShape() {
        System.out.println("This is a rectangular shape.");
    }
}

// Circle class inheriting from Shape
class Circle extends Shape {
    @Override
    public void printShape() {
        System.out.println("This is a circular shape.");
    }
}

// Square class inheriting from Rectangle
class Square extends Rectangle {
    @Override
    public void printShape() {
        System.out.println("Square is a rectangle.");
    }
}

public class Shape1 {
    public static void main(String[] args) {
        Square square = new Square();
        square.printShape();  
        Rectangle rectangle = new Rectangle();
        rectangle.printShape();  

        Shape shape = new Shape();
        shape.printShape(); 
    }
}

