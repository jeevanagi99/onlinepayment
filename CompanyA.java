package com.xworkz.DB.Dao;

public class CompanyA {
	public void connectDB(String user, String pass) {
		System.out.println("CompanyA connect Logic || DB Connected");
	}

	public void saveDBtDB(String name, String place) {
		System.out.println("CompanyA connect Logic || DB Saved");
	}

	public void deleteDB(String name) {
		System.out.println("CompanyA connect Logic || DB Deleted");
	}

	public void updateDB(String name, String place) {
		System.out.println("CompanyA connect Logic || DB Updated");

	}

}
