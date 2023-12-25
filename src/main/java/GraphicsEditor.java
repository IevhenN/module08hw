public class GraphicsEditor {
    public static void main(String[] args) {
        Color color = new Color(12,28,255);

        Position positionPoint = new Position(1,4);
        Point point = new Point(positionPoint,color);
        System.out.println("Shape name: "+point.getName());
        System.out.println(point);

        Position positionLine = new Position(22,17);
        Line line = new Line(12d,positionLine,color);
        System.out.println("Shape name: "+line.getName());
        System.out.println(line);
        line.setTurn(1.2);


        Position positionCircle = new Position(33,11);
        Circle circle = new Circle(12d, positionCircle,new Color(12,12,11));
        System.out.println("Shape name: "+circle.getName());
        System.out.println(circle);
        circle.setScale(1.5);


        Quad quad = new Quad(13d,new Position(77,22),new Color(255,255,0));
        System.out.println("Shape name: "+quad.getName());
        System.out.println(quad);
        quad.setLength(20d);

        Rectangle rectangle = new Rectangle(40,50,new Position(10,10));
        System.out.println("Shape name: "+rectangle.getName());
        System.out.println(rectangle);
        rectangle.setLengthA(20d);

        Parallelogram parallelogram = new Parallelogram(40,50,18,new Position(1,1));
        System.out.println("Shape name: "+parallelogram.getName());
        System.out.println(parallelogram);

        Parallelogram parallelogram2 = new Parallelogram(40,50,18,new Position(20,21));
        System.out.println("Shape name: "+parallelogram2.getName());
        System.out.println(parallelogram2);

        System.out.println("hash parallelogram:  "+ parallelogram.hashCode());
        System.out.println("hash parallelogram2: "+ parallelogram2.hashCode());
        System.out.println("parallelogram=parallelogram2: "+parallelogram.equals(parallelogram2));

        parallelogram2.setScale(1.1);

        System.out.println("hash parallelogram:  "+ parallelogram.hashCode());
        System.out.println("hash parallelogram2: "+ parallelogram2.hashCode());
        System.out.println("parallelogram=parallelogram2: "+parallelogram.equals(parallelogram2));

        ShapePrinter.printShapeName(parallelogram);
        ShapePrinter.printShapeOptions(parallelogram);
    }
}
