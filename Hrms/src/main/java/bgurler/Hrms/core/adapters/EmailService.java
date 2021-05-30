package bgurler.Hrms.core.adapters;

import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.Employee;


public interface EmailService {
	Result sendMail(Employee employee);
}
