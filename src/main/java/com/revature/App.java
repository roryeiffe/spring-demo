package com.revature;

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
//        Student student = (Student)context.getBean("student1");
//        System.out.println(student.toString());
//
//        Student student2 = (Student)context.getBean("student2");
//        System.out.println(student2.toString());
//
//        Student student3 = (Student)context.getBean("student3");
//        System.out.println(student3.toString());
//
//        Employee employee = context.getBean("employee1", Employee.class);
//        System.out.println(employee.toString());
//
//        Customer customer = context.getBean("customer1",Customer.class);
//        System.out.println(customer.toString());
//
//        User user = context.getBean("user1",User.class);
//        System.out.println(user.toString());
//
//        Product product = context.getBean("product1",Product.class);
//        System.out.println(product.toString());

        Calculator calculator = context.getBean("calculator1",Calculator.class);
        calculator.sum();




    }
}
