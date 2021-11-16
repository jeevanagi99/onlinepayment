package com.xworkz.DB.Dao;

public class CompanyB implements DBOperationDao  {

	@Override
	public void connectDB(String user, String pass) {
		System.out.println("CompanyB connect Logic || DB Connected");
		
	}

	@Override
	public void save(String name, String place) {
		System.out.println("CompanyB connect Logic || DB Saved");
		
	}

	@Override
	public void delete(String name) {
		System.out.println("CompanyB connect Logic || DB Deleted");
		
	}

	@Override
	public void update(String name, String place) {
		System.out.println("CompanyB connect Logic || DB Updated");
		
	}
	
}
