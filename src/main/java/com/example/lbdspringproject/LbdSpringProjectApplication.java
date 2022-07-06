package com.example.lbdspringproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.IEmployeeService;
import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication(scanBasePackages = "service")
public class LbdSpringProjectApplication {
@Autowired
IEmployeeService iEmployeeService;
@PostConstruct
private List postList(){
    return iEmployeeService.findAll();
}
    public static void main(String[] args) {


        SpringApplication.run(LbdSpringProjectApplication.class, args);

    }

}
