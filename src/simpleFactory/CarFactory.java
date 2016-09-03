package simpleFactory;

public class CarFactory {
	public Car createCar(String type)
	{
		if("奥迪".equals(type))
		{
			return new Aodi();
		}else if("比亚迪".equals(type))
		{
			return new Byd();
		}else
		{
			return null;
		}
			
	}
}
