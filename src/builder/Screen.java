package builder;

public interface Screen {
	public void size();
}

class BigScreen implements Screen{

	@Override
	public void size() {
		System.out.println("17 cun");
	}
	
}

class SmallScreen implements Screen{

	@Override
	public void size() {
		System.out.println("12 cun");
	}
	
}