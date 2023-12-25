import java.util.Objects;

public class Quad extends Shape implements Scaling, Rotation {
    private double length;

    public Quad(double length, Position position) {
        this(length, position, Color.DEFAULT_COLOR);
    }

    public Quad(double length, Position position, Color color) {
        this.length = length;
        this.position = new Position(position);
        this.color = new Color(color);
        this.turn = 0d;
        this.scale = 1d;
    }

    public void setLength(double length) {
        this.length = length;
        renderingShape();
    }

    public double getLength() {
        return length;
    }

    //======== Overriding Object method ==============================================================
    @Override
    public String toString() {
        return this.getName()+" pos: " + position.toString() + ", col: " + color.toString() + ", length: " + length;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Quad quad = (Quad) object;
        return length == quad.length && scale == quad.scale && turn == quad.turn && color.equals(quad.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, scale, turn) + color.hashCode();
    }

    //======== Overriding Shape method ==============================================================
    @Override
    public String getName() {
        return "Quad";
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
