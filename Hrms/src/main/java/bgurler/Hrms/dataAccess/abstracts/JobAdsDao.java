package bgurler.Hrms.dataAccess.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import bgurler.Hrms.entities.concretes.JobAds;

@Service
public interface JobAdsDao extends JpaRepository<JobAds, Integer>{
	@Query("From JobAds where isActive=true")
	List<JobAds> getByIsActive();
	List<JobAds> findById(int id);
	
	
}
