package bgurler.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bgurler.Hrms.entities.concretes.EmployeeCv;

public interface EmployeeCvDao extends JpaRepository<EmployeeCv, Integer>{

}
