package decorator;

public class Client {

	public static void main(String[] args) {
		
		ICar car = new AICar(new WaterCar(new FlyCar(new Car())));
		car.move(); 
	}

}
