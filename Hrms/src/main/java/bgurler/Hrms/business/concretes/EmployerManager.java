package bgurler.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bgurler.Hrms.business.abstracts.EmployerService;
import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.ErrorResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.core.utilities.results.SuccessDataResult;
import bgurler.Hrms.core.utilities.results.SuccessResult;
import bgurler.Hrms.dataAccess.abstracts.EmployerDao;
import bgurler.Hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAllEmployers() {
		return new SuccessDataResult<List<Employer>>(employerDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(Employer employer) {
		var EmployerControll = employerControll(employer);
		if(!EmployerControll.isSuccess()) return new ErrorResult(EmployerControll.getMessage());
		employerDao.save(employer);
		return new SuccessResult(EmployerControll.getMessage());
	}
	private Result employerControll(Employer employer) {
		for (Employer employers : employerDao.findAll()) {
			if(employer.getWebsite().equals(employers.getWebsite())) {
				return new ErrorResult("Bu Email Zaten Mevcut!");
			}
		}
		return new SuccessResult("İş Veren Eklendi.");
	}

	@Override
	public Result delete(Employer employer) {
		employerDao.delete(employer);
		return new SuccessResult("İş Veren Silindi");
	}

}
