package com.ezen.biz.dependency_test;

public class Car {
	private String company;
	private int door; //문의 갯수
	private String color;
	private Tire tire;
	public Car() {
	}
	
	public Car(String company,String color) {
		this.company =company;
		this.color= color;
	}
	
	@Override
	public String toString() {
		return "Car [company=" + company + ", door=" + door + ", color=" + color + ", tire=" + tire + "]";
	}

	public Car(Tire tire) {
		this.tire =tire ;
	}

		public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}


	
}
