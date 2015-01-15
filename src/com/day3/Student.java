package com.day3;

public class Student {
	//atributi
	private int id;
	private String name;
	private Adress address;

	//konstruktor
	public Student(int id, String name, Adress address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public String toCsv() {
		CSVBuilder csv = new CSVBuilder();
		csv.append(id).append(name).append(address);
		return csv.toString();
	}
}