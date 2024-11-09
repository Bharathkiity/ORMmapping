package com.edubridge.Elite.service;
import com.edubridge.Elite.model.Student;
public class StudentService {
		Student[] students;
		public StudentService() {
			students =new Student[] {
					new Student(1001,"BHAragv",70951346l),
					new Student(1001,"BHARATH",70951346l),
					new Student(1002,"LINGA",7095131l),
					new Student(1003,"SANDEEP",955555555l),
			};
			
		}
		public Student[] getAllstudents() {
			return students;
		}
}
