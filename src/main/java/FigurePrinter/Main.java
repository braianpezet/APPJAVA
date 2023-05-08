package FigurePrinter;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner run(CircleRepository circleRepository, TriangleRepository triangleRepository , SquareRepository squareRepository) {
        return (args -> {
            insertShapes(circleRepository,triangleRepository ,squareRepository);
            System.out.println(circleRepository.findAll());
            System.out.println(triangleRepository.findAll());
            System.out.println(squareRepository.findAll());
        });





        /*
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

         */
    }

    private void insertShapes(CircleRepository circleRepository, TriangleRepository triangleRepository , SquareRepository squareRepository) {
        Circle circle = new Circle("red", 2.0);
        Circle circle1 = new Circle("black", 3.1);
        Square square = new Square("blue", 1.1);
        Square square2 = new Square("purple", 3.5);
        Triangle triangle = new Triangle("green", 1.2, 1.2, 1.2);

        circleRepository.save(circle);
        circleRepository.save(circle1);
        triangleRepository.save(triangle);
        squareRepository.save(square);
        squareRepository.save(square2);
    }
}