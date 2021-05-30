package bgurler.Hrms.business.abstracts;

import java.util.List;

import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.Job;

public interface JobService {
	DataResult<List<Job>> getAllJobs();
	Result add(Job job);
	Result Delete(Job job);
}
 