package com.day3;

public class StringBuilderRad {

	public static void main(String[] args) {
		
		
		String str = "";
		System.out.println("Prvi nacin");
		
		for (int i = 0; i <= 100; i++) {
			str += String.valueOf(i);
			str += ", ";
		}
		System.out.println(str);
		
		System.out.println("Drugi nacin");
		
		StringBuilder str2 = new StringBuilder();
		for (int i = 0; i <= 100; i++) {
			str2.append(i).append(", ");
		}
		System.out.println(str2);
		
		
		System.out.println("Treci nacin");
		String str3 = "";
		for (int i = 0; i <= 100; i++) {
			str3 = str3.concat(i + ", ");
		}
		System.out.println(str3);
	}
}
