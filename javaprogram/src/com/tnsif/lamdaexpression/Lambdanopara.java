package com.tnsif.lamdaexpression;

interface Sayble {
	public String say();
}

public class Lambdanopara {
	public static void main(String[] args) {
		Sayble s = () -> {
			return "i have nothing to say";
		};
		System.out.println(s.say());
	}
}