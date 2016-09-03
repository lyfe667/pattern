package decorator;

public class FlyCar implements ICar {

	private ICar car;
	
	
	public FlyCar(ICar car) {
		super();
		this.car = car;
	}


	@Override
	public void move() {
		this.car.move();
		System.out.println("天上飞");
	}

}
