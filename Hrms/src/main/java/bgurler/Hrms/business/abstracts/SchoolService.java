package bgurler.Hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.entities.concretes.EmployeeSchoolDepartment;
import bgurler.Hrms.entities.concretes.School;
import bgurler.Hrms.entities.concretes.SchoolDegree;
import bgurler.Hrms.entities.concretes.SchoolDepartment;

@Service
public interface SchoolService {
	DataResult<List<School>> getAll();
	DataResult<List<SchoolDepartment>> getAllDepartments();
	DataResult<List<EmployeeSchoolDepartment>> getAllEmployeeSchoolDepartment();
	DataResult<List<SchoolDegree>> getAllSchoolDegrees();
	
	Result add(School school);
	Result addSchoolDepartment(SchoolDepartment schoolDepartment);
	Result addEmployeeSchoolDepartment(EmployeeSchoolDepartment employeeSchoolDepartment);
	Result addSchoolDegree(SchoolDegree schoolDegree);
	
}
