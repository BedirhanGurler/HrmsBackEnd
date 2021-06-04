package bgurler.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bgurler.Hrms.business.abstracts.SocialMediaService;
import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.core.utilities.results.SuccessDataResult;
import bgurler.Hrms.core.utilities.results.SuccessResult;
import bgurler.Hrms.dataAccess.abstracts.SocialMediaDao;
import bgurler.Hrms.entities.concretes.SocialMedia;

@Service
public class SocialMediaManager implements SocialMediaService{
	private SocialMediaDao socialMediaDao;
	
	@Autowired
	public SocialMediaManager(SocialMediaDao socialMediaDao) {
		super();
		this.socialMediaDao = socialMediaDao;
	}

	@Override
	public DataResult<List<SocialMedia>> getAll() {
		return new SuccessDataResult<List<SocialMedia>>(this.socialMediaDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(SocialMedia socialMedia) {
		this.socialMediaDao.save(socialMedia);
		return new SuccessResult("Sosyal Medya Kullanıcı Adı Eklendi.");
	}
	
}
