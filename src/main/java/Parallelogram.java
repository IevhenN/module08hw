import java.util.Objects;

public class Parallelogram extends Shape implements Scaling, Rotation {
    private double lengthA;
    private double lengthB;
    private double angle;

    public Parallelogram(double lengthA,double lengthB,double angle, Position position) {
        this(lengthA,lengthB,angle, position, Color.DEFAULT_COLOR);
    }

    public Parallelogram(double lengthA,double lengthB,double angle, Position position, Color color) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.angle = angle;
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

    public void setAngle(double angle) {
        this.angle = angle;
        renderingShape();
    }

    public double getAngle() {
        return angle;
    }

    //======== Overriding Object method ==============================================================
    @Override
    public String toString() {
        return this.getName()+" pos: " + position.toString() + ", col: " + color.toString() + ", length: " + lengthA+"*"+lengthB+", ang: "+angle;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Parallelogram parallelogram = (Parallelogram) object;
        return lengthA == parallelogram.lengthA && lengthB == parallelogram.lengthB && angle == parallelogram.angle && scale == parallelogram.scale && turn == parallelogram.turn && color.equals(parallelogram.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lengthA,lengthB,angle, scale, turn) + color.hashCode();
    }

    //======== Overriding Shape method ==============================================================
    @Override
    public String getName() {
        return "Parallelogram";
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


