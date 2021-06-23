package bgurler.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jobinformation")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobinformation"})
public class JobInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "job_title")
	private String jobTitle;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "city_name")
	private String cityName;
	
	@Column(name = "job_status")
	private String jobStatus;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@Column(name = "about_company")
	private String aboutCompany;
	
	@Column(name = "job_description")
	private String jobDescription;
	
	@Column(name = "technologies")
	private String technologies;
	
	@Column(name = "things_to_know")
	private String thingsToKnow;
	
	@Column(name = "extra_features")
	private String extraFeatures;
}
