package FigurePrinter;

import java.util.concurrent.BlockingQueue;

public class Impresora implements Runnable  {
    private  BlockingQueue<GeometricFigure> printSpooler;
    private String colorDeImpresion;

    public Impresora(BlockingQueue<GeometricFigure> printSpooler){
        this.printSpooler = printSpooler;
    }
    public synchronized void imprimir(){
        try {
            System.out.println("Figuras en la cola: " + printSpooler);
            GeometricFigure shape = printSpooler.take(); //take toma el primer elemento y lo elimina de la cola de impresion
            this.colorDeImpresion = shape.color;
            shape.printer();
        }
        catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("La cola esta vacia");
        }
    }

    @Override
    public void run() {
        while (!printSpooler.isEmpty()) {
            imprimir();
        }

    }
}
