package service;

import entity.employee.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
@Profile("prod")
@Service

public class EmployeeServiceImpl2 implements IEmployeeService {
    @Value("${project.prefix}")
    private String prefix;

    @Value("${project.suffix}")
    private String suffix;
    @Override
    public List findAll() {
        return null;
    }

    @Override
    public String getEmployeeNickname(String firstName, String lastName) {
       return (prefix+firstName.substring(0,3)+lastName.substring(0,3)+suffix);
    }

    @Override
    public List<Employee> findByName(String nameOrSurname) {
        return null;
    }

    @Override
    public void save(Employee employee) {

    }
}
