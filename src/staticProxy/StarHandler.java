package staticProxy;

public class StarHandler implements Star {

	private Star s1;
	
	public StarHandler(Star s1) {
		super();
		this.s1 = s1;
	}

	@Override
	public void sing() {
		this.beforeSing();
		s1.sing();
		this.afterSing();
	}
	private void beforeSing()
	{
		System.out.println("安排场地...");
	}
	private void afterSing()
	{
		System.out.println("收拾场地...");
	}
}
