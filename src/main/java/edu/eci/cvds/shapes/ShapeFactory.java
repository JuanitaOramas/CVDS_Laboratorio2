package edu.eci.cvds.shapes;
import edu.eci.cvds.shapes.concrete.Hexagon;
import edu.eci.cvds.shapes.concrete.Pentagon;
import edu.eci.cvds.shapes.concrete.Quadrilateral;
import edu.eci.cvds.shapes.concrete.Triangle;
public class ShapeFactory {
    public static Shape create(RegularShapeType shapeType){
        switch (shapeType){
            case Triangle:
                return new Triangle();
            case Quadrilateral:
                return new Quadrilateral();
            case Pentagon:
                return new Pentagon();
            case Hexagon:
                return new Hexagon();
            default:
                return null;
        }
    }
}
