package bgurler.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import bgurler.Hrms.entities.concretes.JobPosition;

@Service
public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}
