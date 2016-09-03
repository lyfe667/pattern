package prototype;

import java.util.Date;

public class Sheep implements Cloneable{
	private String name;
	private Date date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	void showInfo()
	{
		System.out.println(name+","+date);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj=super.clone();
		((Sheep)obj).date=(Date) this.date.clone();
		return obj;
	}
	
	
	
	
}
