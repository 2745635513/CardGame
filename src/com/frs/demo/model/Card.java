package com.frs.demo.model;


public class Card implements Comparable<Card> {
	
	private String color;
	private String num;
	private int id;
	
	

	
	



	public Card(String color, String num, int id) {
		super();
		this.color = color;
		this.num = num;
		this.setId(id);
	}



	@Override
	public String toString() {
		return "Card [color=" + color + ", num=" + num + "]";
	}





	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		return o.getId() -this.getId();
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
