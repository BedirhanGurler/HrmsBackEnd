package bgurler.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bgurler.Hrms.business.abstracts.SchoolService;
import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.core.utilities.results.SuccessDataResult;
import bgurler.Hrms.core.utilities.results.SuccessResult;
import bgurler.Hrms.dataAccess.abstracts.EmployeeSchoolDepartmentDao;
import bgurler.Hrms.dataAccess.abstracts.SchoolDao;
import bgurler.Hrms.dataAccess.abstracts.SchoolDegreeDao;
import bgurler.Hrms.dataAccess.abstracts.SchoolDepartmentDao;
import bgurler.Hrms.entities.concretes.EmployeeSchoolDepartment;
import bgurler.Hrms.entities.concretes.School;
import bgurler.Hrms.entities.concretes.SchoolDegree;
import bgurler.Hrms.entities.concretes.SchoolDepartment;

@Service
public class SchoolManager implements SchoolService{
	private SchoolDao schoolDao;
	private EmployeeSchoolDepartmentDao employeeSchoolDepartment;
	private SchoolDepartmentDao schoolDepartmentDao;
	private SchoolDegreeDao schoolDegreeDao;
	
	
	@Autowired
	public SchoolManager(SchoolDao schoolDao, EmployeeSchoolDepartmentDao employeeSchoolDepartment,
			SchoolDepartmentDao schoolDepartmentDao, SchoolDegreeDao schoolDegreeDao) {
		super();
		this.schoolDao = schoolDao;
		this.employeeSchoolDepartment = employeeSchoolDepartment;
		this.schoolDepartmentDao = schoolDepartmentDao;
		this.schoolDegreeDao = schoolDegreeDao;
	}

	@Override
	public DataResult<List<School>> getAll() {
		return new SuccessDataResult<List<School>>(this.schoolDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(School school) {
		this.schoolDao.save(school);
		return new SuccessResult("Okul Bilgisi Eklendi.");
	}

	@Override
	public DataResult<List<SchoolDepartment>> getAllDepartments() {
		return new SuccessDataResult<List<SchoolDepartment>>(this.schoolDepartmentDao.findAll(),"Veriler Listelendi");
	}

	@Override
	public DataResult<List<EmployeeSchoolDepartment>> getAllEmployeeSchoolDepartment() {
		return new SuccessDataResult<List<EmployeeSchoolDepartment>>(this.employeeSchoolDepartment.findAll(),"Veriler Listelendi");
	}

	@Override
	public DataResult<List<SchoolDegree>> getAllSchoolDegrees() {
		return new SuccessDataResult<List<SchoolDegree>>(this.schoolDegreeDao.findAll(),"Veriler Listelendi");
	}

	@Override
	public Result addSchoolDepartment(SchoolDepartment schoolDepartment) {
		this.schoolDepartmentDao.save(schoolDepartment);
		return new SuccessResult("Okul Bölümü Eklendi.");
	}

	@Override
	public Result addEmployeeSchoolDepartment(EmployeeSchoolDepartment employeeSchoolDepartment) {
		this.employeeSchoolDepartment.save(employeeSchoolDepartment);
		return new SuccessResult("Okul Bölümü Eklendi.");
	}

	@Override
	public Result addSchoolDegree(SchoolDegree schoolDegree) {
		this.schoolDegreeDao.save(schoolDegree);
		return new SuccessResult("Okul Derecesi Eklendi.");
	}

}
