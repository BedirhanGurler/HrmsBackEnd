package bgurler.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bgurler.Hrms.entities.concretes.EmployeeEducation;

public interface EmployeeEducationDao extends JpaRepository<EmployeeEducation, Integer>{

}
