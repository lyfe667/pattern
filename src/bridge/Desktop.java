package bridge;

public class Desktop extends Computer {

	public Desktop(IBrand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showComputerInfo() {
		// TODO Auto-generated method stub
		super.showComputerInfo();
		System.out.println("台式机");
	}

}
