package tasks.day43.shapeTask;

public abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public abstract void area();

    public abstract void perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
