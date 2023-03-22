package com.ezen.biz.dependency_test; //e

public class CarTest {  // sk

	public static void main(String[] args) { //j
		Car car = new Car(); // b
		car.setCompany("현대");//c
		car.setColor("흰색");//s
		
		Tire tire  =new Tire();//co
		car.setTire(tire); //Setter 이용해 Tire	 정보설정//tf
		car.getTire().setSize(19);//p
			System.out.println("car = " + car);//sp
			
			
			//또다른 Car//gu
			Car car1 = new Car(new Tire());//st
			car1.setCompany("기아");//bs
			car1.setColor("파란색");//jn
	System.out.println("car1="+car1);//jh
	}//hd

}//hsnr
