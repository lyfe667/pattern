package flyweight;

public class Client {

	public static void main(String[] args) {
		CChessFactory cf=new CChessFactory();
		IChess c1=cf.getChess("黑色");
		CPosition pos=new CPosition(10,10);
		c1.display(pos);
		IChess c2=cf.getChess("黑色");
		c2.display(pos);
		System.out.println(c1+","+c2);
		IChess c3=cf.getChess("白色");
		c3.display(pos);
		System.out.println(c3);
	}

}
