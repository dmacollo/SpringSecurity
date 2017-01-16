package ae.ih.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ae.ih.domain.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long>{
}
