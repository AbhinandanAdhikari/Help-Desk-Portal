package io.abhinandan.ems.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.abhinandan.ems.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{

}
