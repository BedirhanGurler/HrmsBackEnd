package bgurler.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.Company;

@Service
public interface CompanyService {
	DataResult<List<Company>> getAllCompanies();
	Result add(Company company);
	Result delete(Company company);
}
