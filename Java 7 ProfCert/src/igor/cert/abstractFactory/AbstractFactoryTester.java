package igor.cert.abstractFactory;

public class AbstractFactoryTester {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);
		AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);
		
		Shape shape1 = shapeFactory.getShape(ShapeType.RECTANGLE);
		Shape shape2 = shapeFactory.getShape(ShapeType.SQUARE);
		Shape shape3 = shapeFactory.getShape(ShapeType.CIRCLE);
		
		Color color1 = colorFactory.getColor(ColorType.RED);
		Color color2 = colorFactory.getColor(ColorType.GREEN);
		Color color3 = colorFactory.getColor(ColorType.BLUE);
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
		
		color1.fill();
		color2.fill();
		color3.fill();

	}

}
