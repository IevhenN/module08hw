import java.util.Arrays;

public abstract class Shape implements Moving {
    protected Position position;
    protected double scale;
    protected double turn;
    protected Color color;

    public abstract String getName();
    public abstract void renderingShape();

    @Override
    public Position getPosition() {
        return new Position(position);
    }

    @Override
    public void setPosition(Position position){
        this.position = new Position(position);
    }

    @Override
    public void movePosition(int moveX, int moveY) {
        position = new Position(position.getX()+moveX, position.getY()+moveY);
    }

    public Color getColor() {
        return new Color(color);
    }

    public void setColor(Color color) {
        this.color = new Color(color);
    }
}
