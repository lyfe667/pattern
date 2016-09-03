package chainOfResposibility;

public class Director extends Leader {

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if(lr.getDayoff()<10)
		{
			System.out.println(lr.getName()+"请假"+lr.getDayoff()+"天");
			System.out.println("理由："+lr.getReason());
			System.out.println("主任"+this.getName()+"，同意");
		}
		else
		{
			this.getNextLeader().handleRequest(lr);
		}
	}
}
