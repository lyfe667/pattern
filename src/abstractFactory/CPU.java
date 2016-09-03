package abstractFactory;

public interface CPU {
	public void type();
}

class FastCPU implements CPU{

	@Override
	public void type() {
		// TODO Auto-generated method stub
		System.out.println("i7");
	}
	
	
}

class SlowCPU implements CPU{

	@Override
	public void type() {
		System.out.println("pentium");
	}
	
}