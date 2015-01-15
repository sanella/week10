package com.bitcamp.lab.csv.base;

public class User {

	private String name;
	private String surname;
	private int year;
	private boolean driversLicens;
	
	
	public User(String name, String surname, int year, boolean driversLicens){
		this.name = name;
		this.surname = surname;
		this.year = year;
		this.driversLicens = driversLicens;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public boolean isDriversLicens() {
		return driversLicens;
	}


	public void setDriversLicens(boolean driversLicens) {
		this.driversLicens = driversLicens;
	}
	
	



	public String toCSVString(String delimeter){
		String str  = name + ", " + surname + ", " + year + ", " + driversLicens;
		return str;
	}
}
