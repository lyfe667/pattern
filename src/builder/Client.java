package builder;

public class Client {

	public static void main(String[] args) {
		Computer hcc=new ComputerDirector(new HighConfigComputerBuilder()).directComputer();
		System.out.println("---------high config computer--------------------------");
		hcc.computerInfo();
		Computer lcc=new ComputerDirector(new LowConfigComputerBuilder()).directComputer();
		System.out.println("---------low config computer----------------------------");
		lcc.computerInfo();
	}

}
