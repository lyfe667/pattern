package memento;

public class Client {

	public static void main(String[] args) {
		MementoManager mm=new MementoManager();
		Student s1=new Student("s1",1);
		s1.speak();
		mm.add("1", s1.memento());
		s1.setName("s2");
		s1.setID(2);
		s1.speak();
		mm.add("2", s1.memento());
		s1.recover(mm.get("1"));
		s1.speak();
		s1.recover(mm.get("2"));
		s1.speak();
	}

}
