package com.bridgeLabz.IPL.util;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgeLabz.IPL.model.Player;
import com.bridgeLabz.IPL.model.Teams;

public class ReadJson {

	public List getDetails() {
		
		List list = new ArrayList<Player>();
		
		FileReader fileReader = null;
		JSONParser jsonParser = new JSONParser();
		
		try {
			fileReader = new FileReader("/home/bridgeit/Desktop/newPlayerInfo.json");
			Object o = jsonParser.parse(fileReader);
			JSONObject jsonObject = (JSONObject) o;
			JSONArray array = (JSONArray) jsonObject.get("Playersinfo");
			
			for(int i=0;i<array.size();i++) {
				
				Player player = new Player();
				
				JSONObject innerObject = (JSONObject) array.get(i);
				
				Object nameOb = innerObject.get("player_name");
				String name = (String) nameOb;
				player.setPlayer_name(name);
				
				
				Object urlOb = innerObject.get("player_img_url");
				String url = (String) urlOb;
				player.setPlayer_img_url(url);
				
				Object roleOb = innerObject.get("player_role");
				String role = (String) roleOb;
				player.setPlayer_role(role);
				
				Object batOb = innerObject.get("player_batting_style");
				String bat = (String) batOb;
				player.setPlayer_batting_style(bat);
				
				Object bowlOb = innerObject.get("player_bowling_style");
				String bowl = (String) bowlOb;
				player.setPlayer_bowling_style(bowl);
				
				Object natiOb = innerObject.get("player_nationality");
				String nation = (String) natiOb;
				player.setPlayer_nationality(nation);
				
				Object dobOb = innerObject.get("player_dob");
				String dob = (String) dobOb;
				player.setPlayer_dob(dob);
				
				Object teamOb = innerObject.get("team_id");
				String teamid = (String) teamOb;
				player.setTeam_id(teamid);
				
				
				list.add(player);
			}
			
		}
		catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		return list;
	}

	public List getTeams() {
		
		List list = new ArrayList<Teams>();
		
		FileReader fileReader = null;
		JSONParser jsonParser = new JSONParser();
		
		try {
			fileReader = new FileReader("/home/bridgeit/Desktop/TeamEntry.json");
			Object o = jsonParser.parse(fileReader);
			JSONObject jsonObject = (JSONObject) o;
			JSONArray array = (JSONArray) jsonObject.get("teaminfo");
		
			for(int i=0;i<array.size();i++) {
				
				Teams team = new Teams();
				
				JSONObject innerObject = (JSONObject) array.get(i);
				
				Object teamNameOb =  innerObject.get("team_name");
				String teamName = (String) teamNameOb;
				team.setTeam_name(teamName);
				
				
				Object teamimagOb =  innerObject.get("team_img_url");
				String teamimag = (String) teamimagOb;
				team.setTeam_img_url(teamimag);
				
				Object teamCoachOb =  innerObject.get("team_coach");
				String teamCoach = (String) teamCoachOb;
				team.setTeam_coach(teamCoach);
				

				Object teamCapOb =  innerObject.get("team_captain");
				String teamCap = (String) teamCapOb;
				team.setTeam_captain(teamCap);
				
				Object teamhomeOb =  innerObject.get("team_home_venue");
				String teamhome = (String) teamhomeOb;
				team.setTeam_home_venue(teamhome);
				
				Object teamOnrOb =  innerObject.get("team_owner");
				String teamOnr = (String) teamOnrOb;
				team.setTeam_owener(teamOnr);
				
				list.add(team);
			}
		}
		catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
