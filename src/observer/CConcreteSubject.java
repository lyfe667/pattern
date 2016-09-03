package observer;

import java.util.Iterator;

public class CConcreteSubject extends CSubject {

	private int state;
	
	
	
	public CConcreteSubject(int state) {
		super();
		this.state = state;
	}



	public int getState() {
		return state;
	}



	public void setState(int state) {
		this.state = state;
		this.notifyAllObservers();
	}



	@Override
	public void notifyAllObservers() {
		Iterator<IObserver> it = super.list.iterator();
		while(it.hasNext())
		{
			CConcreteObserver co=(CConcreteObserver)it.next();
			co.update(this.state);
		}
	}

}
