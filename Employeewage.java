package com.day3;

public class Employeewage {

	public static void main(String[] args) {
		System.out.println("Welcome to Attendence");

		int Attendance = 1;
		double randomCheck = (Math.floor(Math.random() * 10)) % 2;
		int check = 0;
		if (check == Attendance) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is Absent");
		}
	}
}
