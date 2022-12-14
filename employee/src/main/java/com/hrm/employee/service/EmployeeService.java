package com.hrm.employee.service;

import java.util.List;

import com.hrm.employee.model.Employee;
import org.springframework.data.domain.Page;

public interface EmployeeService {
    List<Employee> getAllEmployees(String keyword);
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    Page< Employee > findPaginated(int pageNo, int pageSize);
    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
