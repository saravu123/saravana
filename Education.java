package org.edu;
public class Education {
	public void education(String name) {
		System.out.println("enter the ug dept ");
		System.out.println("depT NAme is " + name);
	}
	public void education(String surName,int deptId ) {
		System.out.println("surName is "+surName);
		System.out.println("deptId is "+ deptId);
		}
	public static void main(String[] args) {
		Education e = new Education();
		e.education("Arts");
		e.education("MS", 123456);
	}
	

}
