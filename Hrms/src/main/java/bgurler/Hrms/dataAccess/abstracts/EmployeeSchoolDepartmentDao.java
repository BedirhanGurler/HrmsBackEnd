package bgurler.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bgurler.Hrms.entities.concretes.EmployeeSchoolDepartment;

public interface EmployeeSchoolDepartmentDao extends JpaRepository<EmployeeSchoolDepartment, Integer>{

}
