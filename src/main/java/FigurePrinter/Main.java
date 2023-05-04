package FigurePrinter;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<GeometricFigure> printSpooler= new LinkedBlockingQueue<>();
        RandomGeometricFigure randomGeometricFigure = new RandomGeometricFigure();
        PersonGenerator persona1 = new PersonGenerator("persona1",printSpooler,randomGeometricFigure,5);
        PersonGenerator persona2 = new PersonGenerator("persona2",printSpooler,randomGeometricFigure,7);
        Thread hilopersona1 = new Thread(persona1);
        Thread hilopersona2 = new Thread(persona2);
        hilopersona1.start();
        hilopersona2.start();
        Impresora impresora = new Impresora(printSpooler);
        Thread hiloImpresora = new Thread(impresora);

        //hago esto para que se execute la impresora un tiempo despues
        try {
            Thread.sleep(1000);
            hiloImpresora.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}