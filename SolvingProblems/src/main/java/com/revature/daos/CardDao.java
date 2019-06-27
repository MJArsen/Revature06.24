package com.revature.daos;

import com.revature.models.Card;

/**
 * DAO is a design pattern, it stands for Data Access Object It is the idea that
 * all logic associated with accessing the application data should be done in
 * the DAO.
 * 
 * @author btkru
 *
 */
public interface CardDao {

	CardDao currentImplementation = new CardDaoInMemory();

	void save(Card c);

	void remove(Card c);

	Card[] findAll();

	Card[] findByGame(String game);

	Card[] findByValue(double minimum, double maximum);

	Card[] findByNameContains(String name);
}
