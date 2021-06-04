package bgurler.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_languages")
public class EmployeeLanguage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@OneToOne
	@JoinColumn(name = "language_id")
	private Language language;
	
	@Column(name = "language_level")
	private String languageLevel; // Örneğin A1 seviyesindeyse bunu rahatlıkla yazabilsin diye String verdim.
}
