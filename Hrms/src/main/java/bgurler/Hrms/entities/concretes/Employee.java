package bgurler.Hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@PrimaryKeyJoinColumn(name="user_id",referencedColumnName = "id")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@EqualsAndHashCode(callSuper = false)
@Table(name = "employees")
public class Employee extends User{
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@Column(name = "employee_surnmae")
	private String employeeSurName;
	
	@Column(name = "employee_tckn")
	private String employeeTckn;
	
	@Column(name = "employee_birthdate")
	private int employeeBirthDate;
}
