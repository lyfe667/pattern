package bridge;

public class Computer implements IComputer {

	private IBrand brand;
	
	
	public Computer(IBrand brand) {
		super();
		this.brand = brand;
	}


	@Override
	public void showComputerInfo() {
		// TODO Auto-generated method stub
		this.brand.showBrand();
	}

}
