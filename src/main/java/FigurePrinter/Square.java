package FigurePrinter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;


@Entity
public class Square extends GeometricFigure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double side;
    public Square(String color, Double side) {
        super(color);
        this.side = side;

    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
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
        if (this == object) return true;
        if (this == null) return false;
        Square square = (Square) object;
        if((Double.compare(this.side, square.side) == 0) && (this.color == square.color)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side,color);
    }
}
