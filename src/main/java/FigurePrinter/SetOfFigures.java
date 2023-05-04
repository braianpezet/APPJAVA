package FigurePrinter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetOfFigures {
    private List<GeometricFigure> setOfFigures = new ArrayList<GeometricFigure>();
    public void addFigure(GeometricFigure geometricFigure){
        setOfFigures.add(geometricFigure);
    }
    public void delFigure(GeometricFigure geometricFigure){
        setOfFigures.remove(geometricFigure);
    }
    public List<GeometricFigure> orderByArea(){
        Collections.sort(setOfFigures, new AreaComparator().reversed()); //Es reversed porque quiero el orden de mayor a menor
        return this.setOfFigures;
    }

    public List<GeometricFigure> getSetOfFigures() {
        return setOfFigures;
    }

}
