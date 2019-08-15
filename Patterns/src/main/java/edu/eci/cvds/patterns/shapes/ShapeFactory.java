package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
	public static Shape create(RegularShapeType tipo){
		Shape figura=null;
		switch(tipo){
			case Triangle:
				figura = new Triangle();
				break;
			case Quadrilateral:
				figura = new Quadrilateral();
				break;
			case Pentagon:
				figura = new Pentagon();
				break;
			case Hexagon:
				figura = new Hexagon();
				break;
			default:
				break;
		}
		return figura;
	}
}
