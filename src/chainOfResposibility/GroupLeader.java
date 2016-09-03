package chainOfResposibility;

public class GroupLeader extends Leader {

	public GroupLeader(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest lr) {
		if(lr.getDayoff()<3)
		{
			System.out.println(lr.getName()+"请假"+lr.getDayoff()+"天");
			System.out.println("理由："+lr.getReason());
			System.out.println("组长"+this.getName()+"，同意");
		}
		else
		{
			this.getNextLeader().handleRequest(lr);
		}
	}

}
