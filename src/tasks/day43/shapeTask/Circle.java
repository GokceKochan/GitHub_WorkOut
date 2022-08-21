package tasks.day43.shapeTask;

public final class Circle extends Shape {
    private final double pi=3.14;
    private double round;

    public Circle(double round) {
        super("Circle");
        this.round = round;
    }

    public double getPi() {
        return pi;
    }

    public double getRound() {
        return round;
    }

    public void setRound(double round) {
        if(round<=0) {
            System.err.println("Invalid round " + round);
            System.exit(1);

        }
        this.round = round;
    }

    @Override
    public void area() {
        System.out.println("Area: "+ (round*round*pi));

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter: "+ (2*round*pi));

    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + getName()+ '\'' +
                "pi=" + pi +
                ", round=" + round +
                '}';
    }
}
