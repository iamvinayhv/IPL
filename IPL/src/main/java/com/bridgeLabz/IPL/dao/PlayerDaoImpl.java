package com.bridgeLabz.IPL.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeLabz.IPL.model.Player;
import com.bridgeLabz.IPL.model.Teams;

public class PlayerDaoImpl implements PlayerDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean addPlayers(List players) {
		Session session = null;
		
		try {
			session = sessionFactory.openSession();
			
			for(int i=0 ; i<players.size() ; i++) {
				
				Transaction transaction = session.beginTransaction();
				session.save(players.get(i));
				transaction.commit();
				
			}
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		finally {
			session.close();
		}
		
		
	}


	@Override
	public boolean addTeams(List teams) {
		
		Session session = null;
		
		try{
			session = sessionFactory.openSession();
			
			for(int i=0 ; i<teams.size() ; i++) {
				
				Transaction transaction = session.beginTransaction();
				session.save(teams.get(i));
				transaction.commit();
			}
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		finally {
			session.close();
		}
		
	}


	@Override
	public List<Teams> listOfTeams() {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		String hql = "from Teams";
		
		Query query = session.createQuery(hql);
		List<Teams> teams = query.list();
		
		return teams;
	}


	@Override
	public Teams teamDetails(String teamName) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		String hql = "from Teams where team_name=:team";
		
		Query query = session.createQuery(hql);
		query.setParameter("team", teamName);
		Teams team = (Teams) query.uniqueResult();
		
		return team;
	}


	@Override
	public List listOfPlayers(String teamId) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		String hql = "select player_name from Player where team_id=:teamID";
		
		Query query = session.createQuery(hql);
		query.setParameter("teamID", teamId);
		List players = query.list();

		return players;
	}


	@Override
	public Player playerInfo(String playerName) {
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		String hql = "from Player where player_name=:name";
		
		Query query = session.createQuery(hql);
		query.setParameter("name", playerName);
		Player player = (Player) query.uniqueResult();
		
		return player; 
	}

}
