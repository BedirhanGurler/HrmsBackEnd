package bgurler.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bgurler.Hrms.business.abstracts.EmployeeCvService;
import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.core.utilities.results.SuccessDataResult;
import bgurler.Hrms.core.utilities.results.SuccessResult;
import bgurler.Hrms.dataAccess.abstracts.EmployeeCvDao;
import bgurler.Hrms.dataAccess.abstracts.EmployeeEducationDao;
import bgurler.Hrms.dataAccess.abstracts.EmployeeLanguageDao;
import bgurler.Hrms.dataAccess.abstracts.EmployeeSocialMediaDao;
import bgurler.Hrms.dataAccess.abstracts.EmployeeTechnologyDao;
import bgurler.Hrms.dataAccess.abstracts.JobExperienceDao;
import bgurler.Hrms.entities.concretes.EmployeeCv;
import bgurler.Hrms.entities.concretes.EmployeeEducation;
import bgurler.Hrms.entities.concretes.EmployeeLanguage;
import bgurler.Hrms.entities.concretes.EmployeeSocialMedia;
import bgurler.Hrms.entities.concretes.EmployeeTechnology;
import bgurler.Hrms.entities.concretes.JobExperience;
import bgurler.Hrms.entities.concretes.SocialMedia;

@Service
public class EmployeeCvManager implements EmployeeCvService{
	private EmployeeCvDao employeeCvDao;
	private JobExperienceDao jobExperienceDao;
	private EmployeeEducationDao employeeEducationDao;
	private EmployeeTechnologyDao employeeTechnologyDao;
	private EmployeeLanguageDao employeeLanguageDao;
	private EmployeeSocialMediaDao employeeSocialMediaDao;
	
	@Autowired
	public EmployeeCvManager(EmployeeCvDao employeeCvDao, JobExperienceDao jobExperienceDao,
			EmployeeEducationDao employeeEducationDao, EmployeeTechnologyDao employeeTechnologyDao,
			EmployeeLanguageDao employeeLanguageDao, EmployeeSocialMediaDao employeeSocialMediaDao) {
		super();
		this.employeeCvDao = employeeCvDao;
		this.jobExperienceDao = jobExperienceDao;
		this.employeeEducationDao = employeeEducationDao;
		this.employeeTechnologyDao = employeeTechnologyDao;
		this.employeeLanguageDao = employeeLanguageDao;
		this.employeeSocialMediaDao = employeeSocialMediaDao;
	}

	@Override
	public DataResult<List<EmployeeCv>> getAll() {
		return new SuccessDataResult<List<EmployeeCv>>(this.employeeCvDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public DataResult<List<JobExperience>> getJobExperiences() {
		return new SuccessDataResult<List<JobExperience>>(this.jobExperienceDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public DataResult<List<EmployeeEducation>> getEmployeeEducation() {
		return new SuccessDataResult<List<EmployeeEducation>>(this.employeeEducationDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public DataResult<List<EmployeeTechnology>> getAllTechnologies() {
		return new SuccessDataResult<List<EmployeeTechnology>>(this.employeeTechnologyDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public DataResult<List<EmployeeLanguage>> getAllEmployeeLanguages() {
		return new SuccessDataResult<List<EmployeeLanguage>>(this.employeeLanguageDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public DataResult<List<EmployeeSocialMedia>> getAllSocialMedias() {
		return new SuccessDataResult<List<EmployeeSocialMedia>>(this.employeeSocialMediaDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public DataResult<List<EmployeeCv>> getById() {
		return new SuccessDataResult<List<EmployeeCv>>(this.employeeCvDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result addCv(EmployeeCv employeeCv) {
		this.employeeCvDao.save(employeeCv);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result addExperience(JobExperience jobExperience) {
		this.jobExperienceDao.save(jobExperience);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result addEducation(EmployeeEducation employeeEducation) {
		this.employeeEducationDao.save(employeeEducation);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result addTechnology(EmployeeTechnology employeeTechnology) {
		this.employeeTechnologyDao.save(employeeTechnology);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result addLanguage(EmployeeLanguage employeeLanguage) {
		this.employeeLanguageDao.save(employeeLanguage);
		return new SuccessResult("Eklendi.");
	}

	@Override
	public Result addSocialMedia(EmployeeSocialMedia employeeSocialMedia) {
		this.employeeSocialMediaDao.save(employeeSocialMedia);
		return new SuccessResult("Eklendi.");
	}
}
