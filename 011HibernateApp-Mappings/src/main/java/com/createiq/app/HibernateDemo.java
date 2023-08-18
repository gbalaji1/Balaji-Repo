package com.createiq.app;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.createiq.enity.Address;
import com.createiq.enity.Department;
import com.createiq.enity.Employee;
import com.createiq.enity.Project;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;



public class HibernateDemo {
	
	public static void main(String[] args) {
		 Configuration configuration = new Configuration();
		 configuration.configure();
		 System.out.println(configuration);
		 
		 SessionFactory sessionFactory = configuration.buildSessionFactory();
		 
		 Session session = sessionFactory.openSession();
		 
		 
//		 Project p1 = new Project();
//		 p1.setPname("SMS");
//		 
//		 Project p2 = new Project();
//		 p2.setPname("EMS");
//		 
//		 List<Project> projects = Arrays.asList(p1,p2);
//		 
//		 
//		 Employee e1 = new Employee();
//		 e1.setEname("Rehman");
//		 e1.setEsal(10000.00);
//		
//		 
//		 Address a1 = new Address();
//		 a1.setAloc("HYD");
//		 a1.setPincode("5300001");
//		 
//		 e1.setAddress(a1);
//		 e1.setProjects(projects);
//		 
//		 Employee e2 = new Employee();
//		 e2.setEname("Ram");
//		 e2.setEsal(10000.00);
//		 
//		 Address a2 = new Address();
//		 a2.setAloc("BAN");
//		 a2.setPincode("5300003");
//		 
//		 e2.setAddress(a2);
//		 e2.setProjects(projects);
//		 
//		 
//		 Employee e3 = new Employee();
//		 e3.setEname("Tom");
//		 e3.setEsal(10000.00);
//		 
//		 Address a3 = new Address();
//		 a3.setAloc("SKLM");
//		 a3.setPincode("5300002");
//		 
//		 e3.setAddress(a3);
//	     e3.setProjects(projects);
//		 
//		 
//		 Department department = new Department();
//		 
//		 List<Employee> employees =  Arrays.asList(e1,e2,e3);
//		 
//		 department.setDname("IT");
//		 department.setEmployees(employees);
//		 
//		 session.save(e1);
//		 session.save(e2);
//		 session.save(e3);
//		 
//		 session.save(department);
		 
		 
		 Department department = session.get(Department.class, 1);
		 
		 
		 session.beginTransaction().commit();
		 
	
		 
		 session.close();
	}

}
