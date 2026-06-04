public class ShapeDetails {

    static class Shape {
        void draw() {
            System.out.println("Drawing shape");
        }
    }

    static class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing Circle");
        }
    }

    static class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing Rectangle");
        }
    }

    public static void main(String[] args) {
        System.out.println("Drawing Shape");
        Shape s = new Shape();
        s.draw();

        System.out.println("\nDrawing Circle");
        Shape c = new Circle();
        c.draw();

        System.out.println("\nDrawing Rectangle");
        Shape r = new Rectangle();
        r.draw();
    }
}