package com.day3;

public class Employeewage {

	public static final int Part_time = 1;
	public static final int Full_time = 2;
	public static final int Emp_rate_per_Hrs = 20;
	public static final int Num_of_days_working = 5;
	public static final int Max_Hrs_In_Month = 10;
	private static final int Num_of_Working_Days = 0;

	public static void main(String[] args) {

		System.out.println("Welcome to Employee wage computation program");

		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalworkingDays = 0;

		while (totalEmpHrs <= Max_Hrs_In_Month && totalworkingDays < Num_of_Working_Days) {
			totalworkingDays++;
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
			totalEmpHrs += empHrs;
			System.out.println("Day#:" + totalworkingDays + "Emp Hr: " + empHrs);
		}
		int totalEmpwage = totalEmpHrs * Emp_rate_per_Hrs;
		System.out.println("Total Emp wage:" + totalEmpwage);
	}
}