package com.bridgeLabz.IPL.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeLabz.IPL.model.Player;
import com.bridgeLabz.IPL.model.Teams;
import com.bridgeLabz.IPL.service.PlayerService;
import com.bridgeLabz.IPL.util.ReadJson;

@Controller
public class IPLCounroller {

	@Autowired
	private ReadJson json;
	
	@Autowired
	private PlayerService playerService;
	
	@RequestMapping(value="addplayer")
	public ModelAndView addPlayers() {
		
		List players = json.getDetails();
		boolean result = playerService.addPlayers(players);
		
		if(result){
			return new ModelAndView("added");
		}
		else {
			return new ModelAndView("notAdded");
		}
	}
	
	
	@RequestMapping(value="addteams")
	public ModelAndView teamList() {
		
		List teams = json.getTeams();
		
		System.out.println(teams.toString());
		
		boolean result = playerService.addTeams(teams);
		
		if(result) {
			return new ModelAndView("added");
		}
		else {
			return new ModelAndView("notAdded");
		}
	}
	
	
	@RequestMapping(value="teamlist")
	public ModelAndView listOfTeams() {
		
		List<Teams>  teams = playerService.listOfTeams();
		
		if(teams != null) {
			ModelAndView model = new ModelAndView("teamList");
			model.addObject("teams", teams);
			return model;
		}
		else {
			return new ModelAndView("noTeams");
		}
	}
	
	
	@RequestMapping("details")
	public ModelAndView teamDetails(@RequestParam("id") String teamName) {

		System.out.println(teamName);
		Teams team = playerService.teamDetails(teamName);
		
		if(team != null) {
			ModelAndView model = new ModelAndView("teamDetails");
			model.addObject("teamDetails", team);
			return model;
		}
		else {
			return new ModelAndView("noTeams");
		}
	}
	
	
	@RequestMapping(value="listOfPlayers")
	public ModelAndView listOfPlayers(@RequestParam("id") String teamId) {
		
		
		List players = playerService.listOfPlayers(teamId);
		
		if(players != null) {
			System.out.println(players.toString());
			ModelAndView model = new ModelAndView("listOfPlayers");
			model.addObject("players", players);
			
			return model;
  		}
		else {
			return new ModelAndView("noPlayers");
		}
	}
	
	
	@RequestMapping(value="playerInfo")
	public ModelAndView playerInfo(@RequestParam("id") String playerName) {
		
		Player player = playerService.playerInfo(playerName);
		
		if(player != null) {
			ModelAndView model = new ModelAndView("playerInfo");
			model.addObject("playerData", player);
			return model;
		}
		return new ModelAndView("noPlayer");
	}
	
	
	
}
