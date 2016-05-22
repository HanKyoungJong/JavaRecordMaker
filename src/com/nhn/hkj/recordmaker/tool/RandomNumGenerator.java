package com.nhn.hkj.recordmaker.tool;

import java.util.Random;

public class RandomNumGenerator {
	private Random random;

	public RandomNumGenerator() {
		random = new Random();
	}

	public int getRandomNum(int size) {
		return random.nextInt(size);
	}

}
