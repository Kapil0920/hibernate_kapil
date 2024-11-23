package hibernate_kapil.main;


import hibernate.configuration.Hibernate_Configuration;
import hibernate_kapil.entity.Kapil_Employee;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class KapilMain {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Kapil_Employee kapil = new Kapil_Employee("DS", "Male", 8000);
		
		SessionFactory sf = Hibernate_Configuration.getSessionFactory();
		Session s = sf.openSession();
		s.persist(kapil);
		s.beginTransaction().commit();
		
		
		
	}

}
