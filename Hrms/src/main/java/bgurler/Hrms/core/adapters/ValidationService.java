package bgurler.Hrms.core.adapters;

import org.springframework.stereotype.Service;

import bgurler.Hrms.entities.concretes.Employee;


public interface ValidationService {
	boolean checkIfRealPerson(Employee employee);
}
