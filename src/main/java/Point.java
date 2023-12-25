public class Point extends Shape {

    public Point(Position position) {
        this(position, Color.DEFAULT_COLOR);
    }

    public Point(Position position, Color color) {
        this.position = new Position(position);
        this.color = new Color(color);
    }

    @Override
    public String toString() {
        return this.getName()+" pos: " + position.toString() + ", col: " + color.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Point point = (Point) object;
        return color.equals(point.color);
    }

    @Override
    public int hashCode() {
        return color.hashCode();
    }

    @Override
    public String getName() {
        return "Point";
    }

    @Override
    public void renderingShape() {

        System.out.println(this.toString() + " is rendering");
    }
}
