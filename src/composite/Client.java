package composite;

public class Client {
	public static void main(String [] args)
	{
		Leaf l1,l2,l3,l4,l5;
		NotLeaf nl1,nl2,nl3;
		l1=new Leaf("l1");
		l2=new Leaf("l2");
		l3=new Leaf("l3");
		l4=new Leaf("l4");
		l5=new Leaf("l5");
		
		nl1=new NotLeaf("nl1");
		nl2=new NotLeaf("nl2");
		nl3=new NotLeaf("nl3");
		
		nl1.add(nl2);
		nl1.add(nl3);
		nl1.add(l5);
		
		nl2.add(l1);
		nl2.add(l2);
		nl3.add(l3);
		nl3.add(l4);
		
		//nl1.showNodeInfo();
		nl2.showNodeInfo();
	}
}
