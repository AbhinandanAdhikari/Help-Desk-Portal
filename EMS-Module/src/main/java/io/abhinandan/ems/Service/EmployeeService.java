package io.abhinandan.ems.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import io.abhinandan.ems.Model.Employee;
import io.abhinandan.ems.Repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }


    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll(Sort.by(Sort.Direction.DESC, "id"));
    }


    public Employee updateEmployee(int id, Employee employee) {
        Employee employeeToUpdate = employeeRepository.findById(id).orElseThrow();
        employeeToUpdate.setFirstName(employee.getFirstName());
        employeeToUpdate.setLastName(employee.getLastName());
        employeeToUpdate.setEmail(employee.getEmail());
        return employeeRepository.save(employeeToUpdate);
    }


    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
