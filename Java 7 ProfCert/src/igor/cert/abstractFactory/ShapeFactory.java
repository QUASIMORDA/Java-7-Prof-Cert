package igor.cert.abstractFactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(ColorType color) {
		return null;
	}

	@Override
	Shape getShape(ShapeType shape) {
		Shape result = null;
		switch (shape) {
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
