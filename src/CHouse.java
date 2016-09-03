
public abstract class CHouse {
	public void purchaseMaterial()
	{
		System.out.println("购买1吨水泥，2吨沙子");
	}
	public abstract void buildHouse();
	public void liveHouse()
	{
		System.out.println("入住房子");
	}
	
	public final void newHouse()
	{
		this.purchaseMaterial();
		this.buildHouse();
		this.liveHouse();
	}
}
