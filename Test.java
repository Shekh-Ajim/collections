package com.admin;

import java.util.Scanner;

import com.service.Operation;

public class Test {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Operation op = new Operation();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("\n"+"Enter your choice");
			System.out.println("1.Add Course");
			System.out.println("2.View Course");
			System.out.println("3.Add Fauculty");
			System.out.println("4.View Fauculty");
			System.out.println("5.Add Batch");
			System.out.println("6.View Batch");
			System.out.println("7.Add Student");
			System.out.println("8.View Student"+"\n");
			int ch = sc.nextInt();
			//System.out.println(ch);
			switch(ch){
			
			case 1:
				op.AddCourse();
				break;
			case 2:
				op.ViewCourse();
				break;
			case 3:
				op.AddFauculty();
				break;
			case 4:
				op.ViewFauculty();
				break;
			case 5:
				op.AddBatch();
				break;
			case 6:
				op.ViewBatch();
				break;
			case 7:
				op.AddStudent();
				break ;
			case 8:
				op.ViewStudent();
				break ;
				
			case 9:
				System.exit(0);
				break;
			}
			
		}
		
		
	}
	
}
