package prototype;

import java.sql.Date;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date date=new Date(12345678);
		Sheep s0=new Sheep();
		s0.setName("多利");
		s0.setDate(date);
		s0.showInfo();
		Sheep s1=(Sheep)s0.clone();
		s1.setName("少利");
		date.setDate(222222);
		s0.showInfo();
		s1.showInfo();
	}

}
