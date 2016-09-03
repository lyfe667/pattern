package flyweight;

public class CChess implements IChess {
	private String color;
	
	public CChess(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void display(IPosition pos)
	{
		System.out.println("颜色："+this.color);
		pos.showPosition();
	}
	
}
