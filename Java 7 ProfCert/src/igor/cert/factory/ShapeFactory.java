package igor.cert.factory;

public class ShapeFactory {
	public Shape getShape(ShapeType shapeType){
		Shape result = null;
		switch (shapeType) {
		case RECTANGLE:
			result = new Rectangle();
			break;
		case SQUARE:
			result = new Square();
			break;
		case CIRCLE:
			result = new Circle();
			break;
		}
		return result;
	}
}
