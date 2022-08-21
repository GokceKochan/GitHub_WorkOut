package tasks.day43.shapeTask;

public class ShapeClass {
    public static void main(String[] args) {
        Square square=new Square(5.5);
        System.out.println(square);

        square.setSide(6.5);
        System.out.println(square);
        square.area();
        square.perimeter();


        System.out.println("------------------------------");
        Circle circle = new Circle(12);
        System.out.println(circle);

        circle.area();
        circle.perimeter();


        System.out.println("------------------------------");
        Rectangle rectangle = new Rectangle(5,6);
        System.out.println(rectangle);

        rectangle.perimeter();
        rectangle.area();


    }
}
