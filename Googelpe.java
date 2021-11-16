package com.xworkz.DB.Dao;

public class Googelpe implements OnlinePayment {

	@Override
	public void Recharge(long phnumber, int amount) {
		System.out.println("GooglePe Recharge Logic ||  reacharged");
	}

	@Override
	public void Electricity(int id, int amount) {
		System.out.println(" googlePe Electricity  Logic ||  electricitybill payed");
		
	}

	@Override
	public void CreditcardBill(long cardno, long mobileno) {
		System.out.println("googlePe creditcardBill Logic ||  creditbill payed");
		
	}

}
