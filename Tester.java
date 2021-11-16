package com.xworkz.DB.Dao;

public class Tester {

	public static void main(String[] args) {
		CompanyB company = new CompanyB();
		company.connectDB("arpita", "arpita");
		company.save("arpita", "gulberga");
		company.delete("arpita");
		company.update("anu", "bangalore");

	}

}
