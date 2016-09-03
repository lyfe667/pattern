package memento;

public class StudentMemento {
	private String name;
	private int ID;
	
	public StudentMemento(Student s) {
		super();
		this.name=s.getName();
		this.ID=s.getID();
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
	
	
	
	
}
