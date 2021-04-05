/**
 * 
 */
package com.ss.jb.one;

/**
 * @author ppradhan
 *
 */
public class AccessMod {
	
	//default constructor
	public AccessMod() {
		System.out.println("Default constructor called");
	}

	//parameterized constructor
	public AccessMod(String name) {
		System.out.println("Parameterized constructor called"+name);
	}

	final public void runPublicMethod() {
		System.out.println("Running public method");
	}
	
	private void runPrivateMethod() {
		System.out.println("Running private method");
	}
	
	protected void runProtMethod() {
		System.out.println("Running prot method");
	}
	
	void runDefMethod() {
		System.out.println("Running default method");
	}

}
