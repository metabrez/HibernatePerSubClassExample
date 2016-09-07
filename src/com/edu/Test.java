package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		  Configuration cfg = new Configuration();
		  cfg.configure();
		  SessionFactory factory = cfg.buildSessionFactory();
		  Session session = factory.openSession();
		  Person p = new Person();
		  p.setPersonId(2017);
		  p.setPersonFirsrtName("Tabrez");
		  p.setPersonLastName("Alam");
		   
		  Teacher teacher = new Teacher();
		  teacher.setPersonId(10015);
		  teacher.setPersonFirsrtName("Pratibha");
		  teacher.setPersonLastName("Reddy");
		  teacher.setDepartment("Unix");
		  teacher.setSubject("Java");
		   
		  Student student = new Student();
		  student.setPersonId(10011);
		  student.setPersonFirsrtName("Srikanth");
		  student.setPersonLastName("Reddy");
		  student.setBranch("OS");
		  student.setStudentClass(2);
		   
		   
		  session.save(p);
		  session.save(student);
		  session.save(teacher);
		   
		   
		  Transaction tx = session.beginTransaction();
		 //session.save(s);
		  tx.commit();
		  session.close();
		  factory.close();
		  System.out.println("successfully inserted");
		   
		   
		 
		 }
		 
		
	

}
