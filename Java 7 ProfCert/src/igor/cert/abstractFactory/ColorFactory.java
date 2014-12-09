package igor.cert.abstractFactory;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(ColorType color) {
		Color result = null;
		switch (color) {
		case RED:
			result = new Red();
			break;
		case GREEN:
			result = new Green();
			break;
		case BLUE:
			result = new Blue();
			break;
		}
		return result;
	}

	@Override
	Shape getShape(ShapeType shape) {
		return null;
	}

}
