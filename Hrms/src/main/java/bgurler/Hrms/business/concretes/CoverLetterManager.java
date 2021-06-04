package bgurler.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bgurler.Hrms.business.abstracts.CoverLetterService;
import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.core.utilities.results.SuccessDataResult;
import bgurler.Hrms.core.utilities.results.SuccessResult;
import bgurler.Hrms.dataAccess.abstracts.CoverLetterDao;
import bgurler.Hrms.entities.concretes.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService{
	private CoverLetterDao coverLetterDao;
	
	@Autowired
	public CoverLetterManager(CoverLetterDao coverLetterDao) {
		super();
		this.coverLetterDao = coverLetterDao;
	}

	@Override
	public DataResult<List<CoverLetter>> getAll() {
		return new SuccessDataResult(this.coverLetterDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(CoverLetter coverLetter) {
		this.coverLetterDao.save(coverLetter);
		return new SuccessResult("Ön Yazı Eklendi.");
	}

	@Override
	public Result delete(CoverLetter coverLetter) {
		this.coverLetterDao.delete(coverLetter);
		return new SuccessResult("Ön Yazı Silindi.");
	}

}
