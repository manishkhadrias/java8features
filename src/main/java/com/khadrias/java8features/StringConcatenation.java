package com.khadrias.java8features;

/**
 * @author manishkhadria
 *
 */
public class StringConcatenation {

	public static void main(String[] args) {
		String st1 = "xyziuq";
		String st2 = "abc";
		boolean str1Greter = st1.length() > st2.length();

		String newStr = "";

		if (str1Greter) {
			int i = 0;
			for (; i < st2.length(); i++) {
				newStr += st1.substring(i, i + 1) + st2.substring(i, i + 1);
			}
			newStr += st1.substring(i);
		} else {
			int i = 0;
			for (; i < st1.length(); i++) {
				newStr += st1.substring(i, i + 1) + st2.substring(i, i + 1);
			}
			newStr += st2.substring(i);
		}

		System.out.println("New String :" + newStr);

		String newStr1 = st1 + st2;
		System.out.println("New String :" + newStr1);

	}

}
