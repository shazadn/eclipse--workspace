package com.qa.optionals;

import java.util.Optional;

public class App {
	public static void main(String[]args) {
		String x = "fefe";
		Optional<String> myOptional = Optional.ofNullable(x);
		System.out.println(myOptional.orElse("oh no"));
	}
	
}
