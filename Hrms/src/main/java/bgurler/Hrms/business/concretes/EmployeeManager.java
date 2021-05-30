package bgurler.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bgurler.Hrms.business.abstracts.EmployeeService;
import bgurler.Hrms.core.adapters.ValidationService;
import bgurler.Hrms.core.utilities.results.DataResult;
import bgurler.Hrms.core.utilities.results.ErrorResult;
import bgurler.Hrms.core.utilities.results.Result;
import bgurler.Hrms.core.utilities.results.SuccessDataResult;
import bgurler.Hrms.core.utilities.results.SuccessResult;
import bgurler.Hrms.dataAccess.abstracts.EmployeeDao;
import bgurler.Hrms.entities.concretes.Employee;


@Service
public class EmployeeManager implements EmployeeService{
	private EmployeeDao employeeDao;
	private ValidationService validationService;
	
	
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao,ValidationService validationService) {
		super();
		this.employeeDao = employeeDao;
		this.validationService = validationService;
		
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(),"Veriler Listelendi.");
	}

	@Override
	public Result add(Employee employee) {
		var EmployeeControll = employeeControll(employee);
		if(!validationService.checkIfRealPerson(employee)) {
			return new ErrorResult("Doğrulama Başarısız!");
		}
		if(!EmployeeControll.isSuccess()) return new ErrorResult(EmployeeControll.getMessage());
		this.employeeDao.save(employee);
		return new SuccessResult(EmployeeControll.getMessage());
	}
	private Result employeeControll(Employee employee) {
		for (Employee employees : employeeDao.findAll()) {
			if(employee.getEmail().equals(employees.getEmail()) || employee.getEmployeeTckn().equals(employees.getEmployeeTckn())) {
				return new ErrorResult("Email veya TCKN Zaten Mevcut!");
			}
		}
		return new SuccessResult("Yeni İş Arayan Kişi Eklendi.");
	}

	@Override
	public Result delete(Employee employee) {
		employeeDao.delete(employee);
		return new SuccessResult(employee.getEmployeeName() + " " + employee.getEmployeeSurName() + " Adlı Kişi Silindi.");
	}

}
