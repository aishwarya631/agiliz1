package com.at.example.basic;

 class Studconstructor1 {
	String name="abs";
	int id,ph_num;
	Studconstructor1()
	{
		System.out.println("student details");
	}
	Studconstructor1(String s1)
	{
	   System.out.println("student name");
	}
	Studconstructor1(String name,int i,int ph){
		name=name;
		id=i;
		ph_num=ph;
		System.out.println("stud details"+name+id);
				
		
	}
}
	
public class Studconstructor
{
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studconstructor1 st=new Studconstructor1();
		Studconstructor1 st1=new Studconstructor1("abc");
		Studconstructor1 st2=new Studconstructor1("abc",2,5);
		
		

	}

}
