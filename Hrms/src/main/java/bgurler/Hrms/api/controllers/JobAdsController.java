package bgurler.Hrms.api.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bgurler.Hrms.business.abstracts.JobAdsService;
import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.JobAds;

@RestController
@RequestMapping("/api/jobAds")
@CrossOrigin
public class JobAdsController {
	private JobAdsService jobAdsService;
	
	@Autowired
	public JobAdsController(JobAdsService jobAdsService) {
		super();
		this.jobAdsService = jobAdsService;
	}
	
	@GetMapping("/getAllJobAds")
	public DataResult<List<JobAds>> getAllJobAds(){
		return this.jobAdsService.getAllJobAds();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAds jobAds){
		return this.jobAdsService.add(jobAds);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestBody JobAds jobAds){
		return this.jobAdsService.delete(jobAds);
	}
	
	@GetMapping("/getallbydate")
	public DataResult<List<JobAds>> getAllByDate(){
		return this.jobAdsService.getAllSortedByDate();
	}
	
	@GetMapping("/getallbyactive")
	public DataResult<List<JobAds>> getAllByActive(){
		return this.jobAdsService.getAllSortedByActive();
	}
	
	@GetMapping("/getById")
	public DataResult<List<JobAds>> getById(int id){
		return this.jobAdsService.getById(id);
	}

}
