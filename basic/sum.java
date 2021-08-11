package com.at.example.basic;

public class sum {

	
		 public int sum(int n1,int n2)
		 {
			 return (n1+n2);
		 }
		 public int  sum(int n1,int n2,int n3) {
			return(n1+n2+n3);
		 }
		 public double sum(double d1,double d2)
		 {
			 return (d1+d2);
		 }
		 public static void main(String[] args) {
			 sum s=new sum();
			 System.out.println(s.sum(1,3));
			 System.out.println(s.sum(3, 5, 7));
			 System.out.println(s.sum(1.2,3.2));
			 
		}

	

}
