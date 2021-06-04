package bgurler.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bgurler.Hrms.entities.concretes.EmployeeTechnology;

public interface EmployeeTechnologyDao extends JpaRepository<EmployeeTechnology, Integer>{

}
