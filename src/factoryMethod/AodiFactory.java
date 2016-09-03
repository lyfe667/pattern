package factoryMethod;

public class AodiFactory implements CarFactory {

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new Aodi();
	}

}
