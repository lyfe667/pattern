package composite;

public interface INotLeaf extends INode{
	public void add(INode node);
	public void remove(INode node);
}
