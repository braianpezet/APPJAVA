package FigurePrinter;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class PersonGenerator implements Runnable{
    private String nombre;
    private RandomGeometricFigure randomGeometricFigure;
    private BlockingQueue<GeometricFigure> printSpooler;
    private int numberOfFigures;
    public PersonGenerator(String nombre , BlockingQueue<GeometricFigure> printSpooler , RandomGeometricFigure randomGeometricFigure, int numerOfFigures){
        this.nombre = nombre;
        this.printSpooler = printSpooler;
        this.randomGeometricFigure = randomGeometricFigure;
        this.numberOfFigures = numerOfFigures;
    }

    @Override
    public void run() {
        int aux =0;
        while (aux <= numberOfFigures){
            aux++;
            try{
                System.out.println("Hilo de persona " + this.nombre);
                GeometricFigure shape = randomGeometricFigure.createShape();
                System.out.println("La persona " +this.nombre + " genero un " + shape  );
                printSpooler.put(shape);
                System.out.println("Se puso la figura " + shape + " perteneciente a la persona " + this.nombre + " en la cola ");
                Thread.sleep(new Random().nextInt(2000)); // Agrega un retraso aleatorio
            } catch (InterruptedException e) {
                System.out.println("Se produjo una interrupcion en la generacion de figuras de la persona " + this.nombre);
            }
        }
    }
}
