package Develhope_Ex.DesignPattern_1;

public class FactoryShape {
    public static Shape getShape(Shapes shapes) {
        Shape shape = null;

        switch (shapes) {
            case Shapes.RETTANGOLO -> shape = new Rettangolo(4);
            case Shapes.TRIANGOLO -> shape = new Cerchio(0);
            default -> shape = null;
        }
        return shape;
    }
}
