package bgurler.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bgurler.Hrms.business.abstracts.JobPositionServicce;
import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.Job;
import bgurler.Hrms.entities.concretes.JobPosition;
import bgurler.Hrms.entities.concretes.SystemPersonnel;

@RestController
@RequestMapping("/api/jobpositions")
public class JobPositionController {
	private JobPositionServicce jobPositionServicce;
	
	@Autowired
	public JobPositionController(JobPositionServicce jobPositionServicce) {
		super();
		this.jobPositionServicce = jobPositionServicce;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		return this.jobPositionServicce.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition) {
		return this.jobPositionServicce.add(jobPosition);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody JobPosition jobPosition) {
		return this.jobPositionServicce.delete(jobPosition);
	}
}
