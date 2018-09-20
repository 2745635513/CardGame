package com.frs.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private int id;
	private String name;
	public List<Card> Spai=new ArrayList<Card>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Player() {
		super();
	}
	
	
}
