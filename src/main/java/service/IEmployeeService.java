package service;

import entity.employee.Employee;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public interface IEmployeeService {
    List<?> findAll();

   String getEmployeeNickname(String firstName, String lastName);
List<Employee> findByName(String nameOrSurname);

void save(Employee employee);
}
