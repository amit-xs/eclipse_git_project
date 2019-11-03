package com.lti.git_Ex;

import java.util.Scanner;

public class EmployeeDaoImpl implements EmployeeDao{
	
	int id[];
    String name[];
    double salary[];
	public void add() {
		int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
       int a[] = new int[n];
        id=new int[n];
        name=new String[n];
        salary=new double[n];
        
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {	System.out.println("Enter Id");
            id[i]=s.nextInt();
            System.out.println("Enter Name");
            name[i]=s.next();
            System.out.println("Enter Salary");
            salary[i]=s.nextDouble();
        }
        for(int i=0;i<n;i++) {
        System.out.println(id +" : "+name+" : "+salary);
    }
	}
	}
	


