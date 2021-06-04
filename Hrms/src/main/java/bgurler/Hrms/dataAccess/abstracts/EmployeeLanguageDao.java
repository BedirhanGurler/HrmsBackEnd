package bgurler.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bgurler.Hrms.entities.concretes.EmployeeLanguage;

public interface EmployeeLanguageDao extends JpaRepository<EmployeeLanguage, Integer>{

}
