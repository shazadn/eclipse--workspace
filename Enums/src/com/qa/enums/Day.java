package com.qa.enums;

public enum Day {
 MONDAY("not great"),
 TUESDAY("medicore"),
 WEDNESDAY ("dead");
 
private String feeling;
	Day(String feeling){
		this.feeling = feeling;
	}
	
	public String getFeeling() {
		return feeling;
	}

}
