package decorator;

public class Car implements ICar {

	@Override
	public void move() {
		System.out.println("地上跑");
	}

}
