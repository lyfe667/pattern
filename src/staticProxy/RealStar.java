package staticProxy;

public class RealStar implements Star {

	@Override
	public void sing() {
		System.out.println("我在唱歌...");
	}

}
