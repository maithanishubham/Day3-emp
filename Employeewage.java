package com.day3;

public class Employeewage {

	public static void main(String args[]) {

		System.out.println("Welcome to Employee Attendance");

		Employeewage Wage = new Employeewage();
		Wage.Employee();
	}

	public void Employee() {
		int noOfhourperday = 8;
		int Wageperhr = 20;
		int Attendance = 1;
		double randomCheck = (Math.floor(Math.random() * 10)) % 2;
		if (Attendance == randomCheck) {

			if (noOfhourperday == 8) {
				System.out.println("Employee is present");
				int totalWage = noOfhourperday * Wageperhr;
				System.out.println("wage per day is:" + totalWage);

			}
		}

		else {
			System.out.println(" Employee is Absent");
		}
	}

}