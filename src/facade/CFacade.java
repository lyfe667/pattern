package facade;

public class CFacade {
	public void operation()
	{
		System.out.println("operation");
		new COne().operationOne();
		new CTwo().operationTwo();
		new CThree().operationThree();
	}
}
