package FigurePrinter;

public abstract class GeometricFigure implements ShapeArea, ShapePerimeter {
    protected String color;
    protected GeometricFigure(String color){
        this.color = color;
    }
    @Override
    public String toString() {
        return "Figura geométrica de tipo " + this.getClass().getSimpleName() ;//getSimpleName retorna el nombre de la clase en tiempo de ejecucion
    }

    public void printer() {

    }

}
