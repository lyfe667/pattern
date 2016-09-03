package chainOfResposibility;

public class Client {
	public static void main(String [] args)
	{
		GroupLeader gl1=new GroupLeader("张三");
		Director d1=new Director("李四");
		Manager m1=new Manager("王五");
		gl1.setNextLeader(d1);
		d1.setNextLeader(m1);
		LeaveRequest lr = new LeaveRequest(4,"生病","张小二");
		gl1.handleRequest(lr);
	}
}
