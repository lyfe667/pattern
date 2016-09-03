package builder;

public class ComputerDirector {
	private ComputerBuilder computerBuilder;
	
	
	
	public ComputerDirector(ComputerBuilder computerBuilder) {
		
		this.computerBuilder = computerBuilder;
	}



	public Computer directComputer()
	{
		CPU cpu=computerBuilder.buildCPU();
		Memory memory=computerBuilder.buildMemory();
		Screen screen=computerBuilder.buildScreen();
		Computer computer=new Computer();
		computer.setCpu(cpu);
		computer.setMemory(memory);
		computer.setScreen(screen);
		return computer;
	}
}
