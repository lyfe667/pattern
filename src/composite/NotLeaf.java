package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class NotLeaf implements INotLeaf {

	private String name;
	private ArrayList<INode> list=new ArrayList<INode>();
	
	public NotLeaf(String name) {
		super();
		this.name = name;
	}
	@Override
	public void showNodeInfo() {
		System.out.println(this.name+" ");
		Iterator<INode> it=list.iterator();
		while(it.hasNext())
		{
			INode node=it.next();
			node.showNodeInfo();
		}
	}
	@Override
	public void add(INode node)
	{
		this.list.add(node);
	}
	@Override
	public void remove(INode nodeToRemove)
	{
		this.list.remove(nodeToRemove);
	}
}
