package com.Arrays;

public class Array_SingleDimensional {

	public static void main(String[] args) {
		
		int student_id[] = new int[10];
		
		student_id[0]=1234;
		student_id[1]=5678;
		student_id[2]=910;
		student_id[3]=1112;
		student_id[4]=1314;
		student_id[5]=1516;
		student_id[6]=1718;
		student_id[7]=1920;
		student_id[8]=2122;
		student_id[9]=2324;
		
		System.out.println("student id is " + student_id[5]);
		
		int totalstudents=student_id.length;
		System.out.println("count of students" + totalstudents);
		
		for(int i=0; i<totalstudents;i++){
			System.out.println("display list of students" + student_id[i]);
		}

	}

}
