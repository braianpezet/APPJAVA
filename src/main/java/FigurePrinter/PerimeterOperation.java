package FigurePrinter;

import java.util.List;

public class PerimeterOperation {
    public double perimeter(GeometricFigure geometricFigure){
        return geometricFigure.perimeter();
    }
    public double sumPerimeter(List<GeometricFigure> shapes){
        return shapes.stream().mapToDouble(r -> perimeter(r)).sum();
    }
}
