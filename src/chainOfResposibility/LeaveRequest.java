package chainOfResposibility;

public class LeaveRequest {
	private int dayoff;
	private String reason;
	private String name;
	
	
	public LeaveRequest(int dayoff, String reason, String name) {
		super();
		this.dayoff = dayoff;
		this.reason = reason;
		this.name = name;
	}
	
	public int getDayoff() {
		return dayoff;
	}
	public void setDayoff(int dayoff) {
		this.dayoff = dayoff;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
