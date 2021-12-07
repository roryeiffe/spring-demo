package com.revature;

import com.revature.beans.Employee;
import com.revature.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Employee employee = context.getBean("emp", Employee.class);
        System.out.println(employee.hashCode());

        Employee employee2 = context.getBean("emp",Employee.class);
        System.out.println(employee2.hashCode());

        Student student = context.getBean("student1",Student.class);
        System.out.println(student.hashCode());

        Student student1 = context.getBean("student1",Student.class);
        System.out.println(student1.hashCode());



    }
}
