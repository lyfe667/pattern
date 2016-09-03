package bridge;

public class Client {

	public static void main(String[] args) {
		Computer c1=new Desktop(new Lenovo());
		Computer c2=new Desktop(new Dell());
		c1.showComputerInfo();
		c2.showComputerInfo();
		
		Computer c3=new Laptop(new Lenovo());
		Computer c4=new Laptop(new Dell());
		
		c3.showComputerInfo();
		c4.showComputerInfo();
		
		Computer c5=new Pad(new Lenovo());
		Computer c6=new Pad(new Dell());
		c5.showComputerInfo();
		c6.showComputerInfo();
		
	}

}
