package chainOfResposibility;

public abstract class Leader {
	private String name;
	private Leader nextLeader;
	
	public Leader(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Leader getNextLeader() {
		return nextLeader;
	}
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	public abstract void handleRequest(LeaveRequest lr);
	
}
