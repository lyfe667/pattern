package builder;

public interface Memory {
	public void capcity();
}

class LargeMemory implements Memory
{

	@Override
	public void capcity() {
		System.out.println("16G");
		
	}
	
}

class SmallMemory implements Memory
{

	@Override
	public void capcity() {
		System.out.println("4G");
	}
	
}
