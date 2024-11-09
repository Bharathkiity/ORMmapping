package project6;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] arr1;
		int[] arr2;
		int[] arr3;//decalaration no size
		
		//array creation
		arr1 =new int[6];//size mention at creation
		arr2 =new int[2];
		arr3 =new int[6];
		//arr3 =new int[-10];//INVALID//re
	//	arr3 =new int[IntegerMaxVlaue];  //re runtime error

		arr1[0]=45;
		arr1[1]=05;
		arr1[3]=5;
		//arr1[4]=45;
		//arr1[6]=45;//re
		
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1)); //import java.util
		
		//decalaration creation and initilization in a single line
		int[] arr5=new int[] {10,20,30,40,50,60,70,80,90};	
		int[] arr6= {1,2};
		//System.out.println(arr5);
		System.out.println(Arrays.toString(arr5));
		//System.out.println(arr5);//address of array 
		System.out.println(Arrays.toString(arr6));//array to string 
		
		
		// methods access 
		System.out.println("array size:"+ arr5.length);
		System.out.println("array :"+arr5[5]);//array index
		System.out.println(arr5[arr5.length-1]);//last element in given array(access last element)
		
		
		//traversal of element
		// int[] subjectMarks={50,99,98,97};
		int[] subjectMarks=new int[] {10,20,30,40,50,60,70,80,90};
		
		System.out.println("using for loop:");
		for(int index=0;index<subjectMarks.length;index++) {
			System.out.println("subject "+(index+1)+" marks is "+subjectMarks[index]);
	
		}
		int i=0;
		System.out.println("using for While loop:");
		while(i<subjectMarks.length)
		{
		System.out.println("subject "+ (i+1)+ " marks is " + subjectMarks[i]);
		i++;
		}
		//for each loop or enhanced loop
		System.out.println(" using for for each loop:");
		for(int eachSubjectMarks:subjectMarks) {
			System.out.println(eachSubjectMarks); // direct iterate the elements and no condition chceking 
			
		}
		double[] salaries= {55000.00,45000.00,65000.000,75000.00,85000.00,95000.00};
		System.out.println(" using for loop:");
		for(int index=0;index<salaries.length;index++) {
			System.out.println("salary "+(index+1)+" is "+salaries[index]);
	
		}
		int d=0;
		System.out.println(" using for While loop:");
		while(d< salaries.length)
		{
		System.out.println(" salary of "+ (d+1)+" is "+ salaries[d]);
		d++;
		}
		
		System.out.println(" using for for each loop:");
		for(double eachsalaries:salaries) {
			System.out.println(eachsalaries); // direct iterate the elements and no condition chceking 
			
		}
		//find total salary 
		//find higest salary
		//find lowest salary
		
		
		//total salary
		double sum=0;
		for(int index=0;index<salaries.length;index++) {
			sum=sum+salaries[index];
		//	System.out.println("total salary of: "+sum);
	
		}
		System.out.println("total salary   : "+sum);
		
		//lowest and highest salary
		double lowestsalary=salaries[0];
		double highestsalary=salaries[0];
		for(int index=0;index<salaries.length;index++) {
			
			if(salaries[index]<lowestsalary) {
				lowestsalary=salaries[index];
			}
			//System.out.println(lowestsalary);
			if(salaries[index]>highestsalary) {
				highestsalary=salaries[index];
			}
		}
		System.out.println("lowest salary  :" + lowestsalary);
		System.out.println("highest salary :"+ highestsalary);	
		
	}
	
	 

	}
