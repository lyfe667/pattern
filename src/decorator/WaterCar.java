package decorator;

public class WaterCar implements ICar {

	private ICar car;
	
	public WaterCar(ICar car) {
		super();
		this.car = car;
	}

	@Override
	public void move() {
		this.car.move();
		System.out.println("水中游");
	}

}
