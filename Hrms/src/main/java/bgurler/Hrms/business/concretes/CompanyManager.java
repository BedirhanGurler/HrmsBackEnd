package bgurler.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bgurler.Hrms.business.abstracts.CompanyService;
import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.core.utilities.results.SuccessDataResult;
import bgurler.Hrms.core.utilities.results.SuccessResult;
import bgurler.Hrms.dataAccess.abstracts.CompanyDao;
import bgurler.Hrms.entities.concretes.Company;

@Service
public class CompanyManager implements CompanyService{
	private CompanyDao companyDao;
	
	@Autowired
	public CompanyManager(CompanyDao companyDao) {
		super();
		this.companyDao = companyDao;
	}

	@Override
	public DataResult<List<Company>> getAllCompanies() {
		return new SuccessDataResult<List<Company>>(this.companyDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(Company company) {
		this.companyDao.save(company);
		return new SuccessResult("Kaydedildi.");
	}

	@Override
	public Result delete(Company company) {
		this.companyDao.delete(company);
		return new SuccessResult("Silindi.");
	}
	
}
