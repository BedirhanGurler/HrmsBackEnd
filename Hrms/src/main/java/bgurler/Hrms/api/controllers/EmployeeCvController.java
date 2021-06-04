package bgurler.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bgurler.Hrms.business.abstracts.EmployeeCvService;
import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.EmployeeCv;
import bgurler.Hrms.entities.concretes.EmployeeEducation;
import bgurler.Hrms.entities.concretes.EmployeeLanguage;
import bgurler.Hrms.entities.concretes.EmployeeSocialMedia;
import bgurler.Hrms.entities.concretes.EmployeeTechnology;
import bgurler.Hrms.entities.concretes.JobExperience;

@RestController
@RequestMapping("/api/employeecv")
public class EmployeeCvController {
	private EmployeeCvService employeeCvService;
	
	@Autowired
	public EmployeeCvController(EmployeeCvService employeeCvService) {
		super();
		this.employeeCvService = employeeCvService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<EmployeeCv>> getAll(){
		return this.employeeCvService.getAll();
	}
	
	@GetMapping("/getallexperiences")
	public DataResult<List<JobExperience>> getJobExperiences(){
		return this.employeeCvService.getJobExperiences();
	}
	
	@GetMapping("/getemployeeeducation")
	public DataResult<List<EmployeeEducation>> getEmployeeEducation(){
		return this.employeeCvService.getEmployeeEducation();
	}
	
	@GetMapping("/getalltechnologies")
	public DataResult<List<EmployeeTechnology>> getAllTechnologies(){
		return this.employeeCvService.getAllTechnologies();
	}
	
	@GetMapping("/getalllanguages")
	public DataResult<List<EmployeeLanguage>> getAllEmployeeLanguages(){
		return this.employeeCvService.getAllEmployeeLanguages();
	}
	
	@GetMapping("/getallsocialmedias")
	public DataResult<List<EmployeeSocialMedia>> getAllSocialMedias(){
		return this.employeeCvService.getAllSocialMedias();
	}
	
	@PostMapping("/addcv")
	public Result addCv(@RequestBody EmployeeCv employeeCv) {
		return this.employeeCvService.addCv(employeeCv);
	}
	
	@PostMapping("/addexperience")
	public Result addExperience(@RequestBody JobExperience jobExperience) {
		return this.employeeCvService.addExperience(jobExperience);
	}
	
	@PostMapping("/addeducation")
	public Result addEducation(@RequestBody EmployeeEducation employeeEducation) {
		return this.employeeCvService.addEducation(employeeEducation);
	}
	
	@PostMapping("/addtechnology")
	public Result addTechnology(@RequestBody EmployeeTechnology employeeTechnology) {
		return this.employeeCvService.addTechnology(employeeTechnology);
	}
	
	@PostMapping("/addlanguage")
	public Result addLanguage(@RequestBody EmployeeLanguage employeeLanguage) {
		return this.employeeCvService.addLanguage(employeeLanguage);
	}
	
	@PostMapping("/addsocialmedia")
	public Result addSocialMedia(@RequestBody EmployeeSocialMedia employeeSocialMedia) {
		return this.employeeCvService.addSocialMedia(employeeSocialMedia);
	}
}
