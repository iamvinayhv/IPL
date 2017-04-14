package com.bridgeLabz.IPL.dao;

import java.util.List;

import com.bridgeLabz.IPL.model.Player;
import com.bridgeLabz.IPL.model.Teams;

public interface PlayerDao {

	public boolean addPlayers(List players);

	public boolean addTeams(List teams);

	public List<Teams> listOfTeams();

	public Teams teamDetails(String teamName);

	public List listOfPlayers(String teamId);

	public Player playerInfo(String playerName);

}
