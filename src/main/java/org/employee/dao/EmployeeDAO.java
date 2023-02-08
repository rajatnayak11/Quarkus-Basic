package org.employee.dao;
import javax.enterprise.context.ApplicationScoped;
import org.employee.entity.Employee;
import io.quarkus.hibernate.orm.panache.PanacheRepository;


@ApplicationScoped
public class EmployeeDAO implements PanacheRepository<Employee>{

	
}
