package factoryMethod;

public class Client {

	public static void main(String[] args) {
		Car c1=new AodiFactory().createCar();
		Car c2=new BydFactory().createCar();
		
		c1.run();
		c2.run();
	}

}
