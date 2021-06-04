package bgurler.Hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bgurler.Hrms.business.abstracts.LanguageService;
import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.core.utilities.results.SuccessDataResult;
import bgurler.Hrms.core.utilities.results.SuccessResult;
import bgurler.Hrms.dataAccess.abstracts.LanguageDao;
import bgurler.Hrms.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	private LanguageDao languageDao;
	
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}

	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccessDataResult<List<Language>>(this.languageDao.findAll(),"Dil Bilgileri Listlendi.");
	}

	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult("Dil Bilgisi Eklendi.");
	}

}
