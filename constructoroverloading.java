package com.at.example.basic;
class box{
	double width,height,depth,
	sum1;
	box(){
		System.out.println("no args called");
	}
	box(double len)
	{
		System.out.println("cons 1arg is called");
	}
	box(double w,double h,double d)
	{
		System.out.println("parameterised con called");
		width=w;
		height=h;
		depth=d;
	}
	void sum()
	{
		//int width=3,height=3,depth=1;
		sum1=width+height+depth;
		System.out.println("sum is"+sum1);
		
	}
}

public class constructoroverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       box box1=new box();
       
       box box2=new box(12);
    		   box box3=new box(1,2,3);
    		   box3.sum();
    		   
       
	}

}
