package FigurePrinter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGeometricFigure {
    private  String[] colors = {"red", "blue", "green", "yellow", "purple", "orange"};
    public GeometricFigure createShape() {
        Random random = new Random();
        String color = colors[random.nextInt(colors.length)];
        int shape = random.nextInt(4); //Numero aleatorio del cero al 3
        switch (shape) {
            case 0:
                return new Circle(color, random.nextDouble() * (50 - 1));
            case 1:
                return new Triangle(color, random.nextDouble() * (50 - 1), random.nextDouble() * (50 - 1), random.nextDouble() * (50 - 1));
            case 2:
                return new Square(color, random.nextDouble() * (50 - 1));
            case 3:
                return new Rectangle(color, random.nextDouble() * (50 - 1), random.nextDouble() * (50 - 1));
            default:
                return null;
        }
    }
    public List<GeometricFigure> createListOfShape  (int cantidad){
        List<GeometricFigure> setOfFigures = new ArrayList<>();
        for (int i = 0 ; i <=cantidad ; i++){
            setOfFigures.add(createShape());
        }
        return setOfFigures;
    }
}
