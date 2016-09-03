package decorator;

public class AICar implements ICar {

	private ICar car;
	
	
	public AICar(ICar car) {
		super();
		this.car = car;
	}


	@Override
	public void move() {
		car.move();
		System.out.println("自动驾驶");
	}

}
