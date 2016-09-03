package staticProxy;

public class Client {

	public static void main(String[] args) {
		StarHandler sh=new StarHandler(new RealStar());
		sh.sing();
	}

}
