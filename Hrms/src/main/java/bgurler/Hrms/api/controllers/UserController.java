package bgurler.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bgurler.Hrms.business.abstracts.UserService;
import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@GetMapping("/getallusers")
	public DataResult<List<User>> getAllUsers(){
		return this.userService.getAllUsers();
	}
	@PostMapping("/add")
	public Result add(@RequestBody User user) {
		return this.userService.add(user);
		
	}
	@PostMapping("/delete")
	public Result delete(@RequestBody User user) {
		return this.userService.delete(user);
		
	}
}
