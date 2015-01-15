package com.bitcamp.lab.csv.base;

public class Test {
	public static void main(String[] args) {
		User u = new User("Sanela", "Grcic", 25, true);

		System.out.println(u.toCSVString(","));

		CSVreadWrite.saveToFile("user", u.toCSVString(", "));
	}
}
