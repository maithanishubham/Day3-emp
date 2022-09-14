package com.day3;

public class Employeewage {

	public static final int Part_time = 1;
	public static final int Full_time = 2;
	public static final int Emp_rate_per_Hrs = 20;

	public static void main(String[] args) {

		int empHrs = 0;
		int empwage = 0;
		
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case Part_time:
			empHrs = 4;
			break;
		case Full_time:
			empHrs = 8;
			break;
		default:
			empHrs = 0;
		}
		empwage = empHrs * Emp_rate_per_Hrs;
		System.out.println("Employee wage:" + empwage);

	}
}
