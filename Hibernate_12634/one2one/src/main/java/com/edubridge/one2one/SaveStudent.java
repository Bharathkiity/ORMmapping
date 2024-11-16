package com.edubridge.one2one;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.edubridge.one2one.model.Course;
import com.edubridge.one2one.model.Student;
import com.edubridge.one2one.utils.HibernateUtils;


public class SaveStudent {

	 public static void main(String[] args) {
		Course course =new Course();
		course.setCourseName("jfs");
		course.setCourseDuration(250);
		course.setCourseFee(2000.00);
		 
		
		Student student =new Student();
		student.setStudentName("linga");
		student.setStudentEmail("linga@gmail.com");
		student.setStudentMobile(709131510L);
		student.setStudentCourse(course);
		
		Transaction tx=null;
		
		try(Session session = HibernateUtils.getSessionFactory().openSession()) {
            session.persist(student); // INSERT OPERATION
            tx=session.beginTransaction();
            tx.commit();
            
            System.out.println("New student is added");
        } catch (Exception e2) {
            tx.rollback();
            e2.printStackTrace();
        }
    }		 
}
