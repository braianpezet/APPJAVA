package FigurePrinter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Rectangle extends GeometricFigure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double height;
    private double weight;

    public Rectangle(String color, double height ,double weight) {
        super(color);
        this.height = height;
        this.weight = weight;
    }

    public Rectangle() {

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
