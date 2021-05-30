package bgurler.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bgurler.Hrms.business.abstracts.UserService;
import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.core.utilities.results.SuccessDataResult;
import bgurler.Hrms.core.utilities.results.SuccessResult;
import bgurler.Hrms.dataAccess.abstracts.UserDao;
import bgurler.Hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public DataResult<List<User>> getAllUsers() {
		return new SuccessDataResult<List<User>>(userDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(User user) {
		userDao.save(user);
		return new SuccessResult("Kullanıcı Eklendi");
	}

	@Override
	public Result delete(User user) {
		userDao.delete(user);
		return new SuccessResult("Kişi Silindi.");
	}

}
