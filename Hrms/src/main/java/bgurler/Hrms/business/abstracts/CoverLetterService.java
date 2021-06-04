package bgurler.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.CoverLetter;

@Service
public interface CoverLetterService {
	DataResult<List<CoverLetter>> getAll();
	Result add(CoverLetter coverLetter);
	Result delete(CoverLetter coverLetter);
}
