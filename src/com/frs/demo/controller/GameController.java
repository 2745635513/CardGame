package com.frs.demo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.frs.demo.model.Card;
import com.frs.demo.model.Player;

public class GameController {

	public Scanner console = new Scanner(System.in);
	public List<Card> ls = new ArrayList<Card>();

	String[] nb = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

	String[] HS = { "方块", "梅花", "红桃", "黑桃" };

	public void Initial() {

		// 定义m是为了给每一张牌有从小到大的id,方便后面的比较大小

		int m = 0;

		for (int i = 0; i < 13; i++) {

			for (int j = 0; j < 4; j++) {

				ls.add(new Card(nb[i], HS[j],m++));

			}
		}

//		for (Card card : ls) {
//			System.out.println(card);
//		}
		System.out.println("start");
		Collections.shuffle(ls);
//		for (Card card : ls) {
//			System.out.println(card);
//		}

	}

	public void InitPlaysCards() {
		Player play1 = new Player();
		play1.setId((int) Math.random());
		play1.setName("f");
		Player play2 = new Player();
		play2.setId((int) Math.random());
		play2.setName("w");
		int index1 = 0;
		Random random = new Random();
		// 一人取1
		for (int i = 0; i < 1; i++) {
			index1 = random.nextInt(ls.size());
			if (!play1.Spai.contains(ls.get(index1))) {
				play1.Spai.add(ls.get(index1));
			}
		}
		
		int index2 = 0;
		// 一人取1
		for (int i = 0; i < 1; i++) {
			index2 = random.nextInt(ls.size());
			if (!play2.Spai.contains(ls.get(index2))) {
				play2.Spai.add(ls.get(index2));
			}
		}
		
		Collections.sort(play1.Spai);

		Collections.sort(play2.Spai);

		Card player1 = play1.Spai.get(0);

		Card player2=play2.Spai.get(0);
//
		if(player1.getId() >player2.getId()) {

		System.out.println("玩家:"+play1.getName()+"获胜"+",手牌为"+player1);

		}else {

		System.out.println("玩家:"+play2.getName()+"获胜"+",手牌为"+player2);

		}
	}
	
	public static void run() {
		int index = 0;
		final int count = 5;
		while(index<count) {
			index ++;
			GameController game = new GameController();
			game.Initial();
			game.InitPlaysCards();
		}
	}
	
	public static void main(String[] args) {
		run();
	}
}
