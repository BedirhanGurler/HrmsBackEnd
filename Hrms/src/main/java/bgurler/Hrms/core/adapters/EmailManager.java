package bgurler.Hrms.core.adapters;



import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.core.utilities.results.SuccessResult;
import bgurler.Hrms.entities.concretes.Employee;



public class EmailManager implements EmailService{

	@Override
	public Result sendMail(Employee employee) {
		return new SuccessResult("Kullanıcıya Mail Gönderildi.");
	}

}
