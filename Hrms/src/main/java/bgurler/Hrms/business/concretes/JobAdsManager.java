package bgurler.Hrms.business.concretes;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import bgurler.Hrms.business.abstracts.JobAdsService;
import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.ErrorResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.core.utilities.results.SuccessDataResult;
import bgurler.Hrms.core.utilities.results.SuccessResult;
import bgurler.Hrms.dataAccess.abstracts.JobAdsDao;
import bgurler.Hrms.entities.concretes.JobAds;

@Service
public class JobAdsManager implements JobAdsService{
	private JobAdsDao jobAdsDao;
	
	@Autowired
	public JobAdsManager(JobAdsDao jobAdsDao) {
		super();
		this.jobAdsDao = jobAdsDao;
	}

	@Override
	public DataResult<List<JobAds>> getAllJobAds() {
		return new SuccessDataResult<List<JobAds>>(this.jobAdsDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(JobAds jobads) {
		jobAdsDao.save(jobads);
		return new SuccessResult("İş İlanı Eklendi");
	}

	@Override
	public Result delete(JobAds jobads) {
		jobAdsDao.delete(jobads);
		return new SuccessResult("Başlıklı İş İlanı Silindi.");
	}

	@Override
	public DataResult<List<JobAds>> getAllSortedByActive() {
		return new SuccessDataResult<List<JobAds>>(this.jobAdsDao.getByIsActive());
	}

	@Override
	public DataResult<List<JobAds>> getAllSortedByDate() {
		Sort sort = Sort.by(Sort.Direction.ASC,"applicationDeadline");
		return new SuccessDataResult<List<JobAds>>(this.jobAdsDao.findAll(sort));
	}

	

}
