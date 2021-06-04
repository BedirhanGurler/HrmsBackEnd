package bgurler.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import bgurler.Hrms.entities.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer>{

}
