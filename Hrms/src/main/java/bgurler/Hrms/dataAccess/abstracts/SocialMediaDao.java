package bgurler.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bgurler.Hrms.entities.concretes.SocialMedia;

public interface SocialMediaDao extends JpaRepository<SocialMedia, Integer>{

}
