package com.bridgeLabz.IPL.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Team_Info")
public class Teams implements Serializable {

	@Id
	@GenericGenerator(name="gen" , strategy="increment")
	@GeneratedValue(generator="gen")
	private int team_id;
	private String team_name;
	private String team_img_url;
	private String team_coach;
	private String team_captain;
	private String team_home_venue;
	private String team_owener;
	
	
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public String getTeam_img_url() {
		return team_img_url;
	}
	public void setTeam_img_url(String team_img_url) {
		this.team_img_url = team_img_url;
	}
	public String getTeam_coach() {
		return team_coach;
	}
	public void setTeam_coach(String team_coach) {
		this.team_coach = team_coach;
	}
	public String getTeam_captain() {
		return team_captain;
	}
	public void setTeam_captain(String team_captain) {
		this.team_captain = team_captain;
	}
	public String getTeam_home_venue() {
		return team_home_venue;
	}
	public void setTeam_home_venue(String team_home_venue) {
		this.team_home_venue = team_home_venue;
	}
	public String getTeam_owener() {
		return team_owener;
	}
	public void setTeam_owener(String team_owener) {
		this.team_owener = team_owener;
	}
	
	
}
