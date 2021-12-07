package com.revature;

import com.revature.beans.Employee;
import com.revature.beans.Student;
import com.revature.beans.User;
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
        System.out.println(employee);

        Student student = context.getBean("student", Student.class);
        System.out.println(student);

        // no bean named user available
        User user = context.getBean("user",User.class);
        System.out.println(user);




    }
}
