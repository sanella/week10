package com.bitcamp.lab.csv.base;

public class CSVreadWrite {
	private static String basePath = "./DataBase/";
	
	public static boolean saveToFile(String fileName, String entry){
		try{
			TextIO.writeFile(basePath + fileName + ".csv");
			TextIO.putln(entry);
		} catch(Exception e){
			return false;
		}
		return true;
	}
}
