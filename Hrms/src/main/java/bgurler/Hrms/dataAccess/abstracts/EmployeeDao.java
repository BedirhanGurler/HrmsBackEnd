package bgurler.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import bgurler.Hrms.entities.concretes.Employee;


public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
 