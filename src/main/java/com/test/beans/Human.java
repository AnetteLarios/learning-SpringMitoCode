package com.test.beans;

public class Human {
	
	private int id;
	private String name;
	private String nickname;
	private Country country;

	
	/*public Human(int id, String name, String nickname) {
		this.id = id;
		this.name = name;
		this.nickname = nickname;
	}
	*/
	/*
	public Human(int id) {
		this.id = id;
	}
	
	public Human(String nickname) {
		this.nickname = nickname;
	}
	*/
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public Country getCountry() {
		return country;
	}
	
	public void setCountry(Country country) {
		this.country = country;
	}
}
