package com.day3;

public class Employeewage {

	public static final int Part_time = 1;
	public static final int Full_time = 2;
	public static final int Emp_rate_per_Hrs = 20;
	public static final int Num_of_days_working = 5;

	public static void main(String[] args) {

		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;

		for (int day = 0; day < Num_of_days_working; day++) {
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
			empWage = empHrs * Emp_rate_per_Hrs;
			totalEmpWage += empWage;
			System.out.println("Emp wage" + empWage);
		}
		System.out.println("totalEmpwage:" + totalEmpWage);
	}
}
