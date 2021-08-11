package com.at.example.basic;

import javax.sound.midi.SysexMessage;

public class Constructor {
	String demo="";
	Constructor(String str)
	{
		System.out.println("con called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c1=new Constructor("JAVA");
		System.out.println("string is"+c1.demo);

	}

}
