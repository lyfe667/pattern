package composite;

public class Leaf implements INode {

	private String name;
	
	
	public Leaf(String name) {
		super();
		this.name = name;
	}

	@Override
	public void showNodeInfo() {
		System.out.println(name+" ");

	}

}
