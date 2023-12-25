import java.util.Objects;

public class Circle extends Shape implements Scaling {
    private double radius;

    public Circle(double radius, Position position) {
        this(radius, position, Color.DEFAULT_COLOR);
    }

    public Circle(double radius, Position position, Color color) {
        this.radius = radius;
        this.position = new Position(position);
        this.color = new Color(color);
        this.turn = 0d;
        this.scale = 1d;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        renderingShape();
    }

    public double getRadius() {
        return radius;
    }

    //======== Overriding Object method ==============================================================
    @Override
    public String toString() {
        return this.getName()+" pos: " + position.toString() + ", col: " + color.toString() + ", radius: " + radius;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Circle circle = (Circle) object;
        return radius == circle.radius && scale == circle.scale && color.equals(circle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, scale) + color.hashCode();
    }

    //======== Overriding Shape method ==============================================================
    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public void renderingShape() {
        System.out.println(this.toString() + " is rendering");
    }

    //======== implements Scaling method ==============================================================

    @Override
    public void setScale(double scale) {
        this.scale = scale;
        renderingShape();
    }

    @Override
    public double getScale() {
        return scale;
    }
}
