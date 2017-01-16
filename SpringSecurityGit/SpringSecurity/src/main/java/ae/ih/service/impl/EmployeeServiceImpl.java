package ae.ih.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ae.ih.domain.Employee;
import ae.ih.repository.EmployeeRepository;
import ae.ih.service.EmployeeService;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	public Employee save(Employee employee){
		return employeeRepository.save(employee);
	}
}
