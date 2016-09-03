package observer;

public class Client {

	public static void main(String[] args) {
		CConcreteSubject cs=new CConcreteSubject(1000);
		cs.add(new CConcreteObserver("观察者1"));
		cs.add(new CConcreteObserver("观察者2"));
		cs.add(new CConcreteObserver("观察者3"));
		
		cs.setState(3000);
		cs.setState(6000);
		cs.add(new CConcreteObserver("观察者4"));
		cs.setState(8000);
	}
 
}
