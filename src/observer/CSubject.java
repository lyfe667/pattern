package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class CSubject {
	protected List<IObserver> list=new ArrayList<IObserver>();
	public void add(IObserver obs)
	{
		this.list.add(obs);
	}
	public void remove(IObserver obs)
	{
		this.list.remove(obs);
	}
	public abstract void notifyAllObservers();
}
