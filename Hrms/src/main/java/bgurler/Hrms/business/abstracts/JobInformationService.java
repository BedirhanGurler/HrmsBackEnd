package bgurler.Hrms.business.abstracts;

import java.util.List;

import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.JobInformation;

public interface JobInformationService {
	DataResult<List<JobInformation>> getAllJobInformations();
	DataResult<List<JobInformation>> getById(int id);
	
	Result add(JobInformation jobInformation);
	Result delete(JobInformation jobInformation);
}
