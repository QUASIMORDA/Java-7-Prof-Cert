package igor.cert.factory;

public class FactoryTest {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		
		Shape rectangle = sf.getShape(ShapeType.RECTANGLE);
		Shape square = sf.getShape(ShapeType.SQUARE);
		Shape circle = sf.getShape(ShapeType.CIRCLE);
		
		rectangle.draw();
		square.draw();
		circle.draw();

	}

}
