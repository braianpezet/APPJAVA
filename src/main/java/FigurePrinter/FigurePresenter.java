package FigurePrinter;

import java.util.List;

public class FigurePresenter {
    public void printFigure (List<GeometricFigure> setOfFigures) {
        for (GeometricFigure geometricFigure : setOfFigures) {
            System.out.println(geometricFigure + "Cuyo perimetro es: " + geometricFigure.perimeter() + " Y su area " + geometricFigure.area());
        }
    }
}
