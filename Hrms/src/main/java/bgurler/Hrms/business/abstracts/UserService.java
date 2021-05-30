package bgurler.Hrms.business.abstracts;

import java.util.List;

import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.User;

public interface UserService {
	DataResult<List<User>> getAllUsers();
	Result add(User user);
	Result delete(User user);
}
