package tasks.day43.shapeTask;

public final class Square extends Shape{
    private double side;

    public Square( double side) {
        super("Circle");
        this.side = side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side<=0){
            System.err.println("Invalid side"+ side);
            System.exit(1);
        }
        this.side = side;
    }




    @Override
    public void area() {

        System.out.println("area: "+ (side*side));

    }

    @Override
    public void perimeter() {
        System.out.println("perimeter: "+(4*side));

    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + getName()+ '\'' +
                "side=" + side +
                '}';
    }
}
