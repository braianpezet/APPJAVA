package FigurePrinter;

import java.util.Objects;

public class Circle extends GeometricFigure {
    private double radius;

    public Circle(String color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadio() {
        return radius;
    }

    public void setRadio(double radio) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
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
    public boolean equals(Object object) {
        if (this == object){
            return true;
        }
        if(object == null){
            return false;
        }
        //Double.compare devuelve 0 si son iguales
        Circle circle = (Circle) object;
        if((Double.compare(this.radius, circle.radius )) == 0 && (this.color == circle.color)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius,color);
    }
}

