package simpleFactory;

public class Client2 {

	public static void main(String[] args) {
		Car c1 =new CarFactory().createCar("奥迪");
		Car c2 = new CarFactory().createCar("比亚迪");
		
		c1.run();
		c2.run();
	}

}
