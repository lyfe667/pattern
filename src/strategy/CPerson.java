package strategy;

public class CPerson {
	private IVehicle vehicle;
	private String name;
	

	
	public CPerson(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IVehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(IVehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void travel()
	{
		System.out.println(this.name+"选择"+this.getVehicle().type()+"旅行");
	}
	
}
