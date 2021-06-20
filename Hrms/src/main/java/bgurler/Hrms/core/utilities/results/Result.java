package bgurler.Hrms.core.utilities.results;

public class Result {
	private boolean success;
	private String message;
	
	public Result(boolean success2) {
		this.success = success2;
	}
	public Result(boolean success, String message) {
		this.message = message;
		this.success = success;
	}
	public boolean isSuccess() {
		return this.success;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	
	
}
