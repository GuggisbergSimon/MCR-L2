
public class Main {
    public static void main(String[] args) {
        int width = 800;
        int height = 600;
        int nbCircles = 5;
        int nbSquares = 5;
        if (args.length > 3) {
            try {
                width = Integer.parseInt(args[0]);
                height = Integer.parseInt(args[1]);
                nbCircles = Integer.parseInt(args[2]);
                nbSquares = Integer.parseInt(args[3]);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }

        Display instance = Display.getInstance();
        instance.setWidth(width);
        instance.setHeight(height);
        instance.createShape(nbCircles, new Circle());
        instance.createShape(nbSquares, new Square());
        instance.moveShapes();
    }
}