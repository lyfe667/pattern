package memento;

import java.util.HashMap;
import java.util.Map;

public class MementoManager {
	private Map<String,StudentMemento> map=new HashMap<String,StudentMemento>();
	
	
	public void add(String name,StudentMemento sm)
	{
		this.map.put(name, sm);
	}
	
	public void remove(String name)
	{
		this.map.remove(name);
	}
	
	public StudentMemento get(String name)
	{
		return this.map.get(name);
	}
	
}
