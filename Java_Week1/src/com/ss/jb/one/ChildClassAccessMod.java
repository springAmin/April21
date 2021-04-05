package com.ss.jb.one;

public class ChildClassAccessMod extends AccessMod{

	public static void main(String[] args) {
		

	}
	
	public void test() {
		runPublicMethod();
	}
	
	public void runPublicMethod() {
		System.out.println("Running public method");
	}

}
