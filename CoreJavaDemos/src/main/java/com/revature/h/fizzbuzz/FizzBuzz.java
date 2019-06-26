package com.revature.h.fizzbuzz;

import java.util.Arrays;

public class FizzBuzz {

	public static String[] solution(int[] input) {
		String[] result = new String[input.length];
		
		for (int i = 0; i < input.length; i++) {
			int currentValue = input[i];
			if(currentValue % 3 == 0) {
				if(currentValue % 5 == 0 ) {
					result[i] = "fizzbuzz";
				} else {
					result[i] = "fizz";
				}
			} else if(currentValue % 5 == 0) {
				result[i] = "buzz";
			} else {
				result[i] = currentValue + "";
			}
		}

		return result;
	}
	
	public static void main(String[] args) {
		String[] solved = solution(new int[] {1,2,3,4,5,10,15,23,21,97,99,2135});
		System.out.println(Arrays.toString(solved));
	}
}
