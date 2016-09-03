package adapter;



public class Adapter implements Target {

	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	public Adaptee getAdaptee() {
		return adaptee;
	}

	public void setAdaptee(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void work() {
		System.out.println("adapter working");
		adaptee.work();
	}

}
