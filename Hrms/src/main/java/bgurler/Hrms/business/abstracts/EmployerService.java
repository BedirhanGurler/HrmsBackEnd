package bgurler.Hrms.business.abstracts;

import java.util.List;

import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAllEmployers();
	Result add(Employer employer);
	Result delete(Employer employer);
}
