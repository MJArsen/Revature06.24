package com.revature.daos;

import com.revature.models.Card;

public class CardDaoInMemory implements CardDao {

	private Card[] cards;

	public CardDaoInMemory() {
		cards = new Card[4];
		cards[0] = new Card("Blue Eyes White Dragon", 10, "Yugioh", "Dragon with blue eyes", "Mint");
		cards[1] = new Card("Island", 0.15, "MTG", "Land", "Used");
		cards[2] = new Card("Pikachu", 0.50, "Pokemon", "Monster", "Mint");
		cards[3] = new Card("Charmander", 0.8, "Pokemon", "Fire Monster", "Used");
	}

	@Override
	public void save(Card c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Card c) {
		// TODO Auto-generated method stub

	}

	@Override
	public Card[] findAll() {
		return cards;
	}

	@Override
	public Card[] findByGame(String game) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card[] findByValue(double minimum, double maximum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card[] findByNameContains(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
