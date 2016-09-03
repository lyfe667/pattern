package chainOfResposibility;

public class Manager extends Leader {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if(lr.getDayoff()<30)
		{
			System.out.println(lr.getName()+"请假"+lr.getDayoff()+"天");
			System.out.println("理由："+lr.getReason());
			System.out.println("经理"+this.getName()+"，同意");
		}
		else
		{
			System.out.println("请假时间过长，不被批准");
		}

	}

}
