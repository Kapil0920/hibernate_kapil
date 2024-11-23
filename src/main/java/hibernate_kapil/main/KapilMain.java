package hibernate_kapil.main;

import org.hibernate.cfg.Configuration;

import hibernate_kapil.entity.Kapil_Employee;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class KapilMain {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kapil_Employee k = new Kapil_Employee("Kapil","Male",9000000);
//		Kapil_Employee k2 = new Kapil_Employee("Kapil22","Male",9000000);

		
//		****----- This is heavy weight code 
//		Configuration confi = new Configuration().configure();
//		
//		SessionFactory Sf = confi.buildSessionFactory();
//		Session s = Sf.openSession();
//		s.persist(k);
//		s.beginTransaction().commit();
		
//		----***
		
		
		// Light weight code is here
		
//		StandardServiceRegistry s =new StandardServiceRegistryBuilder().configure().build();
//		Metadata metaa = new MetadataSources(s).getMetadataBuilder().build();
//		SessionFactory sf = metaa.buildSessionFactory();
//		Session session = sf.openSession();
//		session.persist(k);
//		session.persist(k2);
//		session.beginTransaction().commit();
		
		
		
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure().build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sf = meta.buildSessionFactory();
		
		
		System.out.println("Please Enter Your Name ");
		String name = sc.nextLine();
		System.out.println("Please Enter Your Gender");
		String gender = sc.nextLine();
		System.out.println("Please Enter Your Salary");
		int salary = sc.nextInt();
		
		Kapil_Employee emp1 = new Kapil_Employee(name,gender,salary);
		
		StandardServiceRegistry stand = new StandardServiceRegistryBuilder().configure().build();
		Metadata data  = new MetadataSources(stand).getMetadataBuilder().build();
		
		SessionFactory factory = data.buildSessionFactory();
		Session ses=factory.openSession();
		ses.persist(emp1);
		ses.beginTransaction().commit();
		
		
		
		
		
	}

}
