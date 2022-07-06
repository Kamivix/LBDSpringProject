package service;

import entity.employee.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.*;

@Profile("dev")
@Service
public class EmployeeServiceImpl implements IEmployeeService {
    Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
   public Map<Long, Employee> employeeMap= new HashMap<>();
    @Value("${project.prefix}")
    private String prefix;

    @Value("${project.suffix}")
    private String suffix;
    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public String getEmployeeNickname(String firstName, String lastName) {

        logger.info(lastName);
        logger.info(firstName);
        String valueToReturn=(suffix+firstName.substring(0,3)+lastName.substring(0,3)+prefix);
        logger.info(valueToReturn);
        return valueToReturn;

    }

    @Override
    public void save(Employee employee) {
        long i=0;
        while( employeeMap.containsKey(i)){
            ++i;
        }
long x=i;
        employeeMap.put(x,employee);
    }

    @Override
    public List<Employee>  findByName(String nameOrSurname) {
        List<Employee> employees = new ArrayList<>();
        for(Employee person:employeeMap.values()){
            if(person.toString().contains(nameOrSurname)){
                employees.add(person);
            }
        }
        return employees;


    }
}
