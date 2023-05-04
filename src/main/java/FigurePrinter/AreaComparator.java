package FigurePrinter;

import java.util.Comparator;

public class AreaComparator implements Comparator<GeometricFigure>{
    @Override
    public int compare(GeometricFigure geometricFigure1, GeometricFigure geometricFigure2) {
        return Double.compare(geometricFigure1.area(), geometricFigure2.area());
    }
}
