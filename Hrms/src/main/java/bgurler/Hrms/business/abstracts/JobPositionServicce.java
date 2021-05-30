package bgurler.Hrms.business.abstracts;

import java.util.List;

import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.JobPosition;

public interface JobPositionServicce {
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
	Result delete(JobPosition jobPosition);
}
