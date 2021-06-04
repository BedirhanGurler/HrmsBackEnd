package bgurler.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bgurler.Hrms.entities.concretes.SchoolDegree;

public interface SchoolDegreeDao extends JpaRepository<SchoolDegree, Integer>{

}
