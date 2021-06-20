package bgurler.Hrms.core.utilities.results;

import java.util.List;

import bgurler.Hrms.entities.concretes.City;
import bgurler.Hrms.entities.concretes.EmployeeCv;
import bgurler.Hrms.entities.concretes.JobAds;

public class SuccessDataResult<T> extends DataResult<T>{

	public SuccessDataResult(T data, String message) {
		super(data, true, message);
	}
	public SuccessDataResult(T data) {
		super(data,true);
	}
	public SuccessDataResult(String message) {
		super(null,true,message);
	}
	public SuccessDataResult() {
		super(null,true);
	}
	
}
