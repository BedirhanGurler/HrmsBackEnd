package bgurler.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bgurler.Hrms.entities.concretes.EmployeeSocialMedia;

public interface EmployeeSocialMediaDao extends JpaRepository<EmployeeSocialMedia, Integer>{

}
