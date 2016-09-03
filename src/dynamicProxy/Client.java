package dynamicProxy;

public class Client {

	public static void main(String[] args) {
		Star star=(Star)(new StarHandler(new RealStar()).getProxy());
		star.sing();
	}

}
