package bgurler.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bgurler.Hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer>{
	
}
 