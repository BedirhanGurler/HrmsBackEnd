package bgurler.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.Language;
import bgurler.Hrms.entities.concretes.Technology;

@Service
public interface LanguageService {
	DataResult<List<Language>> getAll();
	Result add(Language language);
}
