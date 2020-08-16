package com.springboot.services;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.pojos.Role;
import com.springboot.pojos.User;
import com.springboot.pojos.UserDetail;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private User user;
	
	private SessionFactory factory;
	private Session session;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		this.factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.addAnnotatedClass(Role.class)
				.buildSessionFactory();
		this.session = this.factory.getCurrentSession();
		this.session.beginTransaction();
		String HQL = "FROM User WHERE userName=?";
		Query query = this.session.createQuery(HQL);
		query.setParameter(0, username);
		this.user = (User)query.uniqueResult();
		this.session.getTransaction().commit();
		
		if(this.user==null) {
			throw new UsernameNotFoundException("Invalid User / Password");
		}
		return new UserDetail(this.user);
	}

}
