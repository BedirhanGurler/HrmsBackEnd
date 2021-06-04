package bgurler.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bgurler.Hrms.business.abstracts.TechnologyService;
import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.Technology;

@RestController
@RequestMapping("/api/technologies")
public class TechnologyController {
	private TechnologyService technologyService;
	
	@Autowired
	public TechnologyController(TechnologyService technologyService) {
		super();
		this.technologyService = technologyService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Technology>> getAll(){
		return this.technologyService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Technology technology) {
		return this.technologyService.add(technology);
	}
}
