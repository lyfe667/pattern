package observer;

public class CConcreteObserver implements IObserver {
	private String name;
	
	
	
	public CConcreteObserver(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void update(int objectState)
	{
		System.out.println(this.name+"观察到目标对象状态更改为："+objectState);
	}
}
