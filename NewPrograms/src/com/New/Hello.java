package com.New;

public class Hello {
	Hello(){
		System.out.println(" default constructor");
	}
	Hello(int a){
		System.out.println("parameterized constructor");
	}
	void first() {
		System.out.println("welcome to java");
	}
	public static void main(String[] args) {
		Hello obj= new Hello();
		Hello obj1= new Hello(2);
		obj.first();
	}

}
