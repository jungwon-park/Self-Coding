package basic1;

public class Action {
	String  msg;
	int     count;
	double  avg;
	boolean state;
	public Action() {
		
	}
	public Action(String msg, int count, double avg) {
		this.msg = msg;
		this.count = count;
		this.avg = avg;
	}
	
	

	public Action(String msg, int count, double avg, boolean state) {
		super();
		this.msg = msg;
		this.count = count;
		this.avg = avg;
		this.state = state;
	}
	
	
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
	
	

}
