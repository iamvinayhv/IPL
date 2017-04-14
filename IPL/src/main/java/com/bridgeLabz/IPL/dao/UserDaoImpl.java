package com.bridgeLabz.IPL.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeLabz.IPL.model.User;

public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean register(User user) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(user);
		transaction.commit();
		session.close();
		return true;
		
	}

	@Override
	public User login(User user) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		String hql = "from User where email=:mail and password=:pwd";
		Query query = session.createQuery(hql);
		query.setParameter("mail", user.getEmail());
		query.setParameter("pwd", user.getPassword());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		user = (User) query.uniqueResult();
		transaction.commit();
		session.close();
		return user;
	}

	
}
