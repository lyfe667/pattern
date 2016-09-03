package simpleFactory;

public class Client {

	public static void main(String[] args) {
		Car c1= new Aodi();
		Car c2= new Byd();
		
		c1.run();
		c2.run();

	}

}
