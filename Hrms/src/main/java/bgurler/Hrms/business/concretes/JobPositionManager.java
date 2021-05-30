package bgurler.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bgurler.Hrms.business.abstracts.JobPositionServicce;
import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.core.utilities.results.SuccessDataResult;
import bgurler.Hrms.core.utilities.results.SuccessResult;
import bgurler.Hrms.dataAccess.abstracts.JobPositionDao;
import bgurler.Hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionServicce{
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Veriler Listlendi");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		jobPositionDao.save(jobPosition);
		return new SuccessResult("İş Pozisyonu Eklendi.");
	}

	@Override
	public Result delete(JobPosition jobPosition) {
		jobPositionDao.delete(jobPosition);
		return new SuccessResult("İş Pozisyonu Silindi.");
	}

}
