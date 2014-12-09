package igor.cert.abstractFactory;

public abstract class AbstractFactory {
	abstract Color getColor(ColorType color);
	abstract Shape getShape(ShapeType shape);
}
