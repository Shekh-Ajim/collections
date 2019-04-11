package com.model;

import com.model.Fauculty;

public class Course {
	
	private int Cid;
	private String Cname;
	private Fauculty fauculty;
	public int getCid() {
		return Cid;
	}
	public Fauculty getFauculty() {
		return fauculty;
	}
	public void setFauculty(Fauculty fauculty) {
		this.fauculty = fauculty;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	
	
	
	
	
}
