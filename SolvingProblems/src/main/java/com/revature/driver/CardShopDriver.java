package com.revature.driver;

import com.revature.prompts.HomePrompt;
import com.revature.prompts.Prompt;

public class CardShopDriver {
	public static void main(String[] args) {
		Prompt currentPrompt = new HomePrompt();
		while(true) {
			currentPrompt = currentPrompt.run();
		}
	}
}
