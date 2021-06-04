package bgurler.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.SocialMedia;

@Service
public interface SocialMediaService {
	DataResult<List<SocialMedia>> getAll();
	Result add(SocialMedia socialMedia);
}
