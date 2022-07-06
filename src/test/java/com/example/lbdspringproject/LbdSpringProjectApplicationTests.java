package com.example.lbdspringproject;

import entity.employee.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import service.EmployeeServiceImpl;
import service.IEmployeeService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class LbdSpringProjectApplicationTests {
List<Employee> list = new ArrayList<>();
    @Autowired
    IEmployeeService iEmployeeService;


    @Test
    void   checkName(){

        iEmployeeService.getEmployeeNickname("Kamil","Partyka");

    }

    @Test

    public void isItWork(){
iEmployeeService.save(new Employee(1,"Kamil","Partyka","98021108133","83506","515920402"));
list.addAll(iEmployeeService.findByName("Partyka"));
        System.out.println(list.get(0));
    }


}
