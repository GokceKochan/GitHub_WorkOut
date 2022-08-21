package tasks.day43.shapeTask;

public final class Rectangle extends Shape {

    private double length;
    private  double width;

    public Rectangle(double length, double width) {
        super("rectangle");
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {

        if(length<=0){
            System.err.println("Invalid length: "+length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.err.println("Invalid width: "+width);
            System.exit(1);
        }

        this.width = width;
    }



    @Override
    public void area() {
        System.out.println("Area: "+width*length);

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter: "+2*(width+length));

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + getName()+ '\'' +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
