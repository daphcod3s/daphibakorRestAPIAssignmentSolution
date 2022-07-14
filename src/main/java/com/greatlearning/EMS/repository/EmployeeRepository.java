package com.greatlearning.EMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.EMS.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
