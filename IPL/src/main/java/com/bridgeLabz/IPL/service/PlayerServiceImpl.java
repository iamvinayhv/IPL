package com.bridgeLabz.IPL.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bridgeLabz.IPL.dao.PlayerDao;
import com.bridgeLabz.IPL.model.Player;
import com.bridgeLabz.IPL.model.Teams;

public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private PlayerDao playerDao;
	
	@Override
	public boolean addPlayers(List players) {
		
		return playerDao.addPlayers(players);
	}

	@Override
	public boolean addTeams(List teams) {
		
		return playerDao.addTeams(teams);
	}

	@Override
	public List<Teams> listOfTeams() {
		
		return playerDao.listOfTeams();
	}

	@Override
	public Teams teamDetails(String teamName) {
		
		return playerDao.teamDetails(teamName);
	}

	@Override
	public List listOfPlayers(String teamId) {
		
		return playerDao.listOfPlayers(teamId);
	}

	@Override
	public Player playerInfo(String playerName) {
		
		return playerDao.playerInfo(playerName);
	}

	

}
