package bgurler.Hrms.core.utilities.results;

import java.util.List;

import bgurler.Hrms.entities.concretes.City;
import bgurler.Hrms.entities.concretes.EmployeeCv;

public class DataResult<T> extends Result{
	private T data;
	
	public DataResult( T data, boolean success, String message) {
		super(success,message);
		this.data = data;
	}
	public DataResult(T data, boolean success) {
		super(success);
		this.data = data;
	}
	public T getData() {
		return this.data;
	}
}
