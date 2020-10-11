package com.Arrays;

public class Array_MultiDimensionalOR2D {

	public static void main(String[] args) {
		
		String student_name[][]=new String[2][2];
		
		student_name[0][0]="kumar";
		student_name[0][1]="hello";
		student_name[1][0]="hi";
		student_name[1][1]="bye";
		
		int totalnames= student_name.length;
		System.out.println("count of student names" + totalnames);
		
		for(int i=0; i<totalnames;i++){
			for(int j=0; j<totalnames; j++){
				System.out.println(student_name[i][j]);
			}
			
		}
		

	}

}
