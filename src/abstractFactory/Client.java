package abstractFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerFactory hccf=new HighConfigComputerFactory();
		ComputerFactory lccf=new LowConfigComputerFactory();
		
		System.out.println("----------High configuration computer-----------------------------");
		hccf.createCPU().type();
		hccf.createMemory().capcity();
		hccf.createScreen().size();
		System.out.println("----------Low configuration computer-----------------------------");
		lccf.createCPU().type();
		lccf.createMemory().capcity();
		lccf.createScreen().size();
	}

}
