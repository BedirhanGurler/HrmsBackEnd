package bgurler.Hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAds"})
@Table(name = "jobads")
public class JobAds {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name = "employer_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name = "job_id")
	private JobPosition jobPosition;
	
	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City city;
	
	
	
	@Column(name = "job_description")
	private String jobDescription;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@Column(name = "open_positions")
	private int openPositions;
	
	@Column(name = "application_deadline")
	private String applicationDeadline;
	
	@Column(name = "isactive")
	private boolean isActive;
	
}
