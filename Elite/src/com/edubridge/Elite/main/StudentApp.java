package com.edubridge.Elite.main;
import com.edubridge.Elite.service.StudentService;
import com.edubridge.Elite.model.Student;


public class StudentApp {

	public static void main(String[] args) {
		StudentService service= new StudentService();
		Student[] students=service.getAllstudents();
		for (Student student: students) {
			System.out.println(student);
		}
	}
}
