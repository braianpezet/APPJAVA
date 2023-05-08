package FigurePrinter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;


@Entity
public class Triangle extends GeometricFigure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double side1;
    private double side2;
    private double side3;

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public Triangle(String color, double side1 , double side2 , double side3){
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(){

    }

    @Override
    public double area() {
        //Esto se conoce como formula de heron y sirve para calcular el area de un triangulo sin saber su altura
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
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
        if(this == object){
            return true;
        }
        if(this == null){
            return false;
        }
        Triangle triangle = (Triangle) object;
        if (Double.compare(triangle.side1, side1) == 0 && Double.compare(triangle.side2, side2) == 0 && Double.compare(triangle.side3, side3) == 0){
            if(this.color == triangle.color){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2, side3,color);
    }
}
