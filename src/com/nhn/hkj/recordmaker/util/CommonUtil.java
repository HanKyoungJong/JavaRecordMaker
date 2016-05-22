package com.nhn.hkj.recordmaker.util;

public class CommonUtil {
	//
	private static final String ZERO_STRING = "0";
	private static final int DIGIT_COUNT = 4;

	public static String getDigitNumber(int num) {
		String inStr = String.valueOf(num);
		String result = "";
		StringBuilder sb = new StringBuilder();
		int idx = DIGIT_COUNT - inStr.length();
		while (idx >= 0) {
			sb.insert(0, ZERO_STRING);
			idx--;
		}
		sb.append(inStr);

		if (sb.toString().length() == DIGIT_COUNT + 1) {
			result = sb.toString();
		} else {
			result = "invalid";
		}
		return result;
	}
}
