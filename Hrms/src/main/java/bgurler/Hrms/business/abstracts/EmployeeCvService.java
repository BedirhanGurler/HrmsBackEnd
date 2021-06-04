package bgurler.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;

import bgurler.Hrms.entities.concretes.EmployeeCv;
import bgurler.Hrms.entities.concretes.EmployeeEducation;
import bgurler.Hrms.entities.concretes.EmployeeLanguage;
import bgurler.Hrms.entities.concretes.EmployeeSocialMedia;
import bgurler.Hrms.entities.concretes.EmployeeTechnology;
import bgurler.Hrms.entities.concretes.JobExperience;
import bgurler.Hrms.entities.concretes.SocialMedia;

@Service
public interface EmployeeCvService {
	DataResult<List<EmployeeCv>> getAll();
	DataResult<List<JobExperience>> getJobExperiences();
	DataResult<List<EmployeeEducation>> getEmployeeEducation();
	DataResult<List<EmployeeTechnology>> getAllTechnologies();
	DataResult<List<EmployeeLanguage>> getAllEmployeeLanguages();
	DataResult<List<EmployeeSocialMedia>> getAllSocialMedias();
	DataResult<List<EmployeeCv>> getById();
	
	Result addCv(EmployeeCv employeeCv);
	Result addExperience(JobExperience jobExperience);
	Result addEducation(EmployeeEducation employeeEducation);
	Result addTechnology(EmployeeTechnology employeeTechnology);
	Result addLanguage(EmployeeLanguage employeeLanguage);
	Result addSocialMedia(EmployeeSocialMedia employeeSocialMedia);
}
