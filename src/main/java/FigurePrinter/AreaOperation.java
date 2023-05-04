package FigurePrinter;

import java.util.List;

public class AreaOperation {

    public double area (GeometricFigure geometricFigure){
        return geometricFigure.area();
    }

    public double SumArea(List<GeometricFigure> shapes){
        return shapes.stream().mapToDouble(r -> area(r)).sum();
    }
}
