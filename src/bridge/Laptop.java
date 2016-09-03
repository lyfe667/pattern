package bridge;

public class Laptop extends Computer {

	public Laptop(IBrand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showComputerInfo() {
		// TODO Auto-generated method stub
		super.showComputerInfo();
		System.out.println("笔记本");
	}
	

}
