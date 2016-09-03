package abstractFactory;

public interface ComputerFactory{
	public Memory createMemory();
	public CPU createCPU();
	public Screen createScreen();
}

class HighConfigComputerFactory implements ComputerFactory{

	@Override
	public Memory createMemory() {
		// TODO Auto-generated method stub
		return new LargeMemory();
	}

	@Override
	public CPU createCPU() {
		// TODO Auto-generated method stub
		return new FastCPU();
	}

	@Override
	public Screen createScreen() {
		// TODO Auto-generated method stub
		return new BigScreen();
	}
	
}

class LowConfigComputerFactory implements ComputerFactory{

	@Override
	public Memory createMemory() {
		// TODO Auto-generated method stub
		return new SmallMemory();
	}

	@Override
	public CPU createCPU() {
		// TODO Auto-generated method stub
		return new SlowCPU();
	}

	@Override
	public Screen createScreen() {
		// TODO Auto-generated method stub
		return new SmallScreen();
	}
	
}