package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        context.registerShutdownHook();
        Employee employee = context.getBean("employee1",Employee.class);
        System.out.println(employee.toString());


        Student student = context.getBean("student1",Student.class);
        System.out.println(student.toString());



    }
}
