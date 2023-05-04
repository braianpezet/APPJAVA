package FigurePrinter;

public class Rectangle extends GeometricFigure {
    private double height;
    private double weight;

    protected Rectangle(String color, double height ,double weight) {
        super(color);
        this.height = height;
        this.weight = weight;
    }

    public void printer(){
        System.out.println("Imprimiendo figura... por favor espere");
        try {
            Thread.sleep(2000); // espera de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Impresion completa!");
        System.out.println("Se imprimio una " + this);
    }


    @Override
    public double area() {
        return this.weight * this.height;
    }

    @Override
    public double perimeter() {
        return 2*this.weight + 2*this.height;
    }
}
