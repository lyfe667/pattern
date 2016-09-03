package mediator;

public interface IStudent {
	public void recieveNotification(String notification);
	public void notifyAllColleagues(String notification);
	public void notifyColleague(String name,String notification);
}
