package com.model;

import com.model.Fauculty;
public class Batch {
	
	private int Bid;
	private String Bname;
	private Fauculty fauculty;
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public Fauculty getFauculty() {
		return fauculty;
	}
	public void setFauculty(Fauculty fauculty) {
		this.fauculty = fauculty;
	}
	

}
