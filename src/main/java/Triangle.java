import java.util.Objects;

public class Triangle extends Shape implements Scaling, Rotation {
    private double lengthA;
    private double lengthB;

    private double lengthC;

    public Triangle(double lengthA,double lengthB,double lengthC, Position position) {
        this(lengthA,lengthB,lengthC, position, Color.DEFAULT_COLOR);
    }

    public Triangle(double lengthA,double lengthB,double lengthC, Position position, Color color) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
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

    public void setLengthC(double lengthC) {
        this.lengthC = lengthC;
        renderingShape();
    }

    public double getLengthC() {
        return lengthC;
    }

    //======== Overriding Object method ==============================================================
    @Override
    public String toString() {
        return this.getName()+" pos: " + position.toString() + ", col: " + color.toString() + ", length: " + lengthA+"*"+lengthB+"*"+lengthC;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Triangle triangle = (Triangle) object;
        return lengthA == triangle.lengthA && lengthB == triangle.lengthB && lengthC == triangle.lengthC && scale == triangle.scale && turn == triangle.turn && color.equals(triangle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthA,lengthB,lengthC, scale, turn) + color.hashCode();
    }

    //======== Overriding Shape method ==============================================================
    @Override
    public String getName() {
        return "Triangle";
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


