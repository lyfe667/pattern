package mediator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CQQGroup {
	private Map<String,IStudent> studentMap=new HashMap<String,IStudent>();
	
	public void add(String name,IStudent stu)
	{
		this.studentMap.put(name, stu);
	}
	
	public void remove(String name)
	{
		this.studentMap.remove(name);
	}
	
	void notifyAllColleagues(String notification)
	{
		Iterator<Map.Entry<String,IStudent>> it=this.studentMap.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<String, IStudent> entry=it.next();
			entry.getValue().recieveNotification(notification);
		}
	}
	
	public void notifyColleague(String name,String notification)
	{
		if(this.studentMap.containsKey(name))
		{
			this.studentMap.get(name).recieveNotification(notification);
		}
	}
	
	
	
}
