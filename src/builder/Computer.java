package builder;

public class Computer {
	private CPU cpu;
	private Memory memory;
	private Screen screen;
	
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public Memory getMemory() {
		return memory;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	
	public void computerInfo()
	{
		this.cpu.type();
		this.memory.capcity();
		this.screen.size();
		
	}
}
