package com.springboot;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springboot.pojos.Role;
import com.springboot.pojos.User;

public class Main {

	public static void main(String[] args) {
		BCryptPasswordEncoder encode = new BCryptPasswordEncoder(12);
		System.out.println(encode.encode("test"));
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.addAnnotatedClass(Role.class)
				.buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		User user = (User)session.get(User.class, 1);
		session.getTransaction().commit();
		
		System.out.println(user);
	}

}
