package strategy;

public class Client {

	public static void main(String[] args) {
		CPerson p1=new CPerson("张三");
		p1.setVehicle(new CTrain());
		p1.travel();
		p1.setVehicle(new CPlane());
		p1.travel();
		p1.setVehicle(new CShip());
		p1.travel();
	}

}
