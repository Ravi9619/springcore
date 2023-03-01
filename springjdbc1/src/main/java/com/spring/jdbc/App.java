package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started!" );
        
        //spring jdbc => jdbcTemplate
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
//        Student student = new Student();
//        student.setId(1);
//        student.setName("abc");
//        student.setCity("Lucknow");
//        
//        int result = studentDao.insert(student);
//        System.out.println("Student added "+result);
        
//        Student student = new Student();
//        student.setId(1);
//        student.setName("xyz");
//        student.setCity("delhi");
//        
//        int result = studentDao.change(student);
//        System.out.println("Student updated "+result);
        
        //Delete 
//        int result = studentDao.delete(1);
//        System.out.println("Student Deleted "+result);
        
        //Get Single Student
//        Student student = studentDao.getStudent(1);
//        System.out.println(student);
        
        //Get All Student
        List<Student> students = studentDao.getAllStudents();
        for(Student s: students) {
        	
        	System.out.println(s);
        }
    }
}
