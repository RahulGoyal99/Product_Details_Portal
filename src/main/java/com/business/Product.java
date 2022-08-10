package com.business;

public class Product {
	private int Pid;
	private String Pname;
	private int P_qty;
	private int Price;
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public int getP_qty() {
		return P_qty;
	}
	public void setP_qty(int p_qty) {
		P_qty = p_qty;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}

}
