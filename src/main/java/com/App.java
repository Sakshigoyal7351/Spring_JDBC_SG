package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        
        StudentDao sd = context.getBean("studentDao",StudentDao.class);
        
        //insert
//        Student s = new Student();
//        s.setId(105);
//        s.setName("Mmeli");
//        s.setCity("SA");
        
//        int r=sd.insert(s);
//        System.out.println("data inserted successfully!!");
        
        //update 
        
//        Student s= new Student(101,"sakshi2","delhi2");
//        int r=sd.update(s);
//        System.out.println("Student data updated succesfully !!");
//        
        //Delete
        
//        int r=sd.delete(101);
//        System.out.println("Data deleted successfully !!");
        
        
        //select one student info
        
//       Student student= sd.getStudent(103);
//       System.out.println(student);
        
        
        //list of student 
        
        List<Student> sts = sd.getAllStudent();
        for(Student s: sts)
        {
        	System.out.println(s);
        }
        
    }
}
