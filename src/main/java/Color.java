import java.util.Objects;

public class Color {
    public static final Color DEFAULT_COLOR = new Color(0,0,0);
    private final int red;
    private final int green;
    private final int blue;

    public Color(int red, int green, int blue) {
        if (red < 0) red = 0;
        if (red > 255) red = 255;

        if (green < 0) green = 0;
        if (green > 255) green = 255;

        if (blue < 0) blue = 0;
        if (blue > 255) blue = 255;

        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Color (Color color) {
        this.red = color.red;
        this.green = color.green;
        this.blue = color.blue;
    }


    public int[] getColor() {
        return new int[]{red, green, blue};
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Color color = (Color) object;
        return red == color.red && green == color.green && blue == color.blue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(red, green, blue);
    }

    @Override
    public String toString() {
        return "{" + red +
                ", " + green +
                ", " + blue +
                '}';
    }
}
