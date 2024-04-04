package Develhope_Ex.DesignPattern_1;

public class Main {
    public static void main(String[] args) {
        Shape shape = FactoryShape.getShape(Shapes.RETTANGOLO);
        shape.draw();
    }
}
