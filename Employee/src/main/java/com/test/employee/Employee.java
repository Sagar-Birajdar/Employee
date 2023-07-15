package com.test.employee;

public class Employee {

	static int eId = 10;
	static String name = "Suresh";
	static String email = "suresh5847@gmail.com";
	static long contact = 7897845215l;
	
//	Employee(int eId, String name, String email, long contact){
//		this.eId=eId;
//		this.email=email;
//		this.name=name;
//		this.contact=contact;
//	}
	
	public static void main(String[] args) {
		System.out.println("Employee Id:" + eId);
		System.out.println("Employee name:" +name);
		System.out.println("Employee email:" +email);
		System.out.println("Employee contact:" +contact);
	}

}
