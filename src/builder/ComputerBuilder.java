package builder;

public interface ComputerBuilder {
	public CPU buildCPU();
	public Memory buildMemory();
	public Screen buildScreen();
}

class HighConfigComputerBuilder implements ComputerBuilder {

	@Override
	public CPU buildCPU() {
		
		return new FastCPU();
	}

	@Override
	public Memory buildMemory() {
		
		return new LargeMemory();
	}

	@Override
	public Screen buildScreen() {
		
		return new BigScreen();
	}

}
class LowConfigComputerBuilder implements ComputerBuilder{

	@Override
	public CPU buildCPU() {
		
		return new SlowCPU();
	}

	@Override
	public Memory buildMemory() {
		
		return new SmallMemory();
	}

	@Override
	public Screen buildScreen() {
		
		return new SmallScreen();
	}
	
}

