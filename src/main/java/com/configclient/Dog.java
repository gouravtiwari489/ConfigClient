package com.configclient;

public class Dog {

	private String wow;
	private String very;
	private String such;
	public String getWo() {
		return wow;
	}
	public void setWo(String wo) {
		this.wow = wo;
	}
	public String getVery() {
		return very;
	}
	public void setVery(String very) {
		this.very = very;
	}
	public String getSuch() {
		return such;
	}
	public void setSuch(String such) {
		this.such = such;
	}
	public Dog() {
		
	}
	public Dog(String wo, String very, String such) {
		super();
		this.wow = wo;
		this.very = very;
		this.such = such;
	}
	@Override
	public String toString() {
		return "Dog [wow=" + wow + ", very=" + very + ", such=" + such + "]";
	}
	
	
}
