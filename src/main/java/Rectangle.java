import java.util.Objects;

public class Rectangle extends Shape implements Scaling, Rotation {
    private double lengthA;
    private double lengthB;

    public Rectangle(double lengthA,double lengthB, Position position) {
        this(lengthA,lengthB, position, Color.DEFAULT_COLOR);
    }

    public Rectangle(double lengthA,double lengthB, Position position, Color color) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.position = new Position(position);
        this.color = new Color(color);
        this.turn = 0d;
        this.scale = 1d;
    }

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
        renderingShape();
    }

    public double getLengthA() {
        return lengthA;
    }

    public void setLengthB(double lengthB) {
        this.lengthB = lengthB;
        renderingShape();
    }

    public double getLengthB() {
        return lengthB;
    }
    //======== Overriding Object method ==============================================================
    @Override
    public String toString() {
        return this.getName()+" pos: " + position.toString() + ", col: " + color.toString() + ", length: " + lengthA+"*"+lengthB;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Rectangle rectangle = (Rectangle) object;
        return lengthA == rectangle.lengthA && lengthB == rectangle.lengthB && scale == rectangle.scale && turn == rectangle.turn && color.equals(rectangle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthA,lengthB, scale, turn) + color.hashCode();
    }

    //======== Overriding Shape method ==============================================================
    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public void renderingShape() {
        System.out.println(this.toString() + " is rendering");
    }

    //======== implements Rotation method ==============================================================
    @Override
    public void setTurn(double turn) {
        this.turn = turn;
        renderingShape();
    }

    @Override
    public double getTurn() {
        return turn;
    }

    @Override
    public void rotate(double angle) {
        this.turn += angle;
        renderingShape();
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

