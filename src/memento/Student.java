package memento;

public class Student {
	private String name;
	private int ID;
	
	public Student(String name, int iD) {
		super();
		this.name = name;
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public StudentMemento memento()
	{
		return new StudentMemento(this);
	}
	
	public void recover(StudentMemento sm)
	{
		this.name=sm.getName();
		this.ID=sm.getID();
	}
	public void speak()
	{
		System.out.println("我是"+this.name+"，学号是"+this.ID);
	}
	
}
