package igor.cert.abstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(FactoryType factoryType){
		AbstractFactory result = null;
		
		switch (factoryType) {
		case SHAPE:
			result = new ShapeFactory();
			break;
		case COLOR:
			result = new ColorFactory();
			break;
		}
		return result;
	}
}
