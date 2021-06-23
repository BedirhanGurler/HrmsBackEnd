package bgurler.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import bgurler.Hrms.entities.concretes.JobInformation;

@Service
public interface JobInformationDao extends JpaRepository<JobInformation, Integer> {
	List<JobInformation> findById(int id);

}
