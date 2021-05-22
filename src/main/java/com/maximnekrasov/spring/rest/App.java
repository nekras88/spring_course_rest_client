package com.maximnekrasov.spring.rest;

import com.maximnekrasov.spring.rest.configuration.MyConfig;
import com.maximnekrasov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//List<Employee> allEmployees = communication.getAllEmployees();
//
//for (Employee e:allEmployees){
//    System.out.println(e);

//      Employee employee =  communication.getEmployee(1);
//        System.out.println(employee);

        Employee employee = new Employee("Nastya", "Nekrasova", "TB", 10_2_200);
        employee.setId(10);
        communication.deleteEmployee(10);


    }
}
