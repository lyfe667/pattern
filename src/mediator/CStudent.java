package mediator;

public class CStudent implements IStudent{
	
	public String name;
	public CQQGroup qqgroup;
	
	public CQQGroup getQqgroup() {
		return qqgroup;
	}


	public void setQqgroup(CQQGroup qqgroup) {
		this.qqgroup = qqgroup;
		this.qqgroup.add(name, this);
	}


	public CStudent(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void recieveNotification(String notification) {
		System.out.println(this.name+"收到消息："+notification);
	}


	@Override
	public void notifyAllColleagues(String notification) {
		
		this.qqgroup.notifyAllColleagues(notification);
	}


	@Override
	public void notifyColleague(String name, String notification) {
		this.qqgroup.notifyColleague(name, notification);
		
	}

}
