package com.service;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.model.Batch;
import com.model.Course;
import com.model.Fauculty;
import com.model.Student;
public class Operation {

	List<Course>courselist = new ArrayList<>();
	List<Fauculty>faucultylist = new ArrayList<>();
	List<Batch>batchlist = new ArrayList<>();
	List<Student>studentlist = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void AddCourse(){
		System.out.println("How many course u want to add ?");
		int tot = sc.nextInt();
		System.out.println(tot);
		for(int i=0; i<tot; i++){
			Course c = new Course();
			System.out.println("Enter course id:-");
			c.setCid(sc.nextInt());
			System.out.println("Enter course name:-");
			c.setCname(sc.next());
			courselist.add(c);
		}
	}
	public void ViewCourse(){
		Iterator<Course> itr = courselist.iterator();
		while(itr.hasNext()){
			Course c = itr.next();
			System.out.println("Course Id:- "+c.getCid());
			System.out.println("Course Name:- "+c.getCname()+"\n");
		}
	}
	
	public void AddFauculty(){
		System.out.println("How many fauculty u want to add:-");
		int tot = sc.nextInt();
		for(int i=0; i<tot; i++){
			Fauculty f = new Fauculty();
			System.out.println("Enter fauculty id:-");
			f.setFid(sc.nextInt());
			System.out.println("Enter fauculty name:-");
			f.setFname(sc.next());
			
			Iterator<Course> itr = courselist.iterator();
			System.out.println("Enter course id:-");
			int Cid = sc.nextInt();
			while(itr.hasNext()){
				Course c = itr.next();
				if(Cid==c.getCid()){
					f.setCourse(c);
				}
			}
			faucultylist.add(f);
		}
	}
		public void ViewFauculty(){
			Iterator<Fauculty> itr = faucultylist.iterator();
			while(itr.hasNext()){
				Fauculty f = itr.next();
				System.out.println("Fauculty Id:- "+f.getFid());
				System.out.println("Fauculty Name:- "+f.getFname());
				System.out.println("Course Id asigned:- "+f.getCourse().getCid());
				System.out.println("Course asigned:- "+f.getCourse().getCname()+"\n");
			}
			
		}
		
		public void AddBatch(){
			System.out.println("How many batch u want to add:-");
			int tot = sc.nextInt();
			for(int i=0; i<tot; i++){
				Batch b = new Batch();
				System.out.println("Enter the batch id:-");
				b.setBid(sc.nextInt());
				System.out.println("Enter the batch name:-");
				b.setBname(sc.next());
				System.out.println("Fid for batch:-");
				int fid = sc.nextInt();
				Iterator<Fauculty> itr = faucultylist.iterator();
				while(itr.hasNext()){
					Fauculty f = itr.next();
					
					if(fid==f.getFid()){
						b.setFauculty(f);
					}
				}
				batchlist.add(b);
				
			}
		}
	
		public void ViewBatch(){
			
			Iterator<Batch> itr = batchlist.iterator();
			while(itr.hasNext()){
				Batch b = (Batch)itr.next();
				System.out.println("Batch Id:- "+b.getBid());
				System.out.println("Batch Name:- "+b.getBname());
				System.out.println("Fauculty assigned to batch:- "+b.getFauculty().getFname());
				System.out.println("Batch Course:- "+b.getFauculty().getCourse().getCname()+"\n");
				
			}
		}
		public void AddStudent(){
			
			System.out.println("How many student u wanr to add:-");
			//Scanner sc = new Scanner(System.in);
			int tot = sc.nextInt();
			for(int i=0; i<tot; i++){
				Student stu = new Student();
				System.out.println("Enter the student id:-");
				stu.setSid(sc.nextInt());
				System.out.println("Enter the student name:-");
				stu.setSname(sc.next());
				System.out.println("Enter batch id for student");
				int bid = sc.nextInt();
				Iterator<Batch> itr = batchlist.iterator();
				while(itr.hasNext())
				{
					Batch b = itr.next();
					
					if(bid==b.getBid())
					{
						//System.out.println("batch id:-"+b.getBid());

						stu.setBatch(b);
					}
				}
				studentlist.add(stu);
			}


		}
		
		//@SuppressWarnings("rawtypes")
		public void ViewStudent(){
			
			Iterator<Student> itr = studentlist.iterator();
			while(itr.hasNext()){
				Student stu = (Student)itr.next();
				System.out.println("Student Id:- "+stu.getSid());
				System.out.println("Student Name:- "+stu.getSname());
				System.out.println("Student Bacth:- "+stu.getBatch().getBname());
				System.out.println("Fauculty assigned to Student:- "+stu.getBatch().getFauculty().getFname());
				System.out.println("Course opt by Student:- "+stu.getBatch().getFauculty().getCourse().getCname()+"\n");
				
			}
		}
		
		
}

