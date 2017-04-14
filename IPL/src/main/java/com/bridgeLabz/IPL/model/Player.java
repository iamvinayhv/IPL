package com.bridgeLabz.IPL.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Player_Info")
public class Player implements Serializable {

	@Id
	@GenericGenerator(name="gen", strategy="increment")
	@GeneratedValue(generator="gen")
	private int player_id;
	private String player_name;
	private String player_img_url;
	private String player_role;
	private String player_batting_style;
	private String player_bowling_style;
	private String player_nationality;
	private String player_dob;
	private String team_id;
	
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public String getPlayer_img_url() {
		return player_img_url;
	}
	public void setPlayer_img_url(String player_img_url) {
		this.player_img_url = player_img_url;
	}
	public String getPlayer_role() {
		return player_role;
	}
	public void setPlayer_role(String player_role) {
		this.player_role = player_role;
	}
	public String getPlayer_batting_style() {
		return player_batting_style;
	}
	public void setPlayer_batting_style(String player_batting_style) {
		this.player_batting_style = player_batting_style;
	}
	public String getPlayer_bowling_style() {
		return player_bowling_style;
	}
	public void setPlayer_bowling_style(String player_bowling_style) {
		this.player_bowling_style = player_bowling_style;
	}
	public String getPlayer_nationality() {
		return player_nationality;
	}
	public void setPlayer_nationality(String player_nationality) {
		this.player_nationality = player_nationality;
	}
	public String getPlayer_dob() {
		return player_dob;
	}
	public void setPlayer_dob(String player_dob) {
		this.player_dob = player_dob;
	}
	public String getTeam_id() {
		return team_id;
	}
	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}
	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", player_name=" + player_name + ", player_img_url=" + player_img_url
				+ ", player_role=" + player_role + ", player_batting_style=" + player_batting_style
				+ ", player_bowling_style=" + player_bowling_style + ", player_nationality=" + player_nationality
				+ ", player_dob=" + player_dob + ", team_id=" + team_id + "]";
	}
	
	
}
