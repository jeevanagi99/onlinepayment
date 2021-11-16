package com.xworkz.DB.Dao;

public interface OnlinePayment {
	public void Recharge(long phnumber,int amount);
	public void Electricity(int id,int amount);
	public void CreditcardBill(long cardno,long mobileno);

}
