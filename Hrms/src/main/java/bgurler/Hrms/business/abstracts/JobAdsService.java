package bgurler.Hrms.business.abstracts;

import java.util.Date;
import java.util.List;

import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.JobAds;

public interface JobAdsService {
	DataResult<List<JobAds>> getAllJobAds();
	Result add(JobAds jobads);
	Result delete(JobAds jobads);
	
	DataResult<List<JobAds>> getAllSortedByActive();
	DataResult<List<JobAds>> getAllSortedByDate();
}
