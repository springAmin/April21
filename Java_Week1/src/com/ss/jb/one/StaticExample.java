/**
 * 
 */
package com.ss.jb.one;

/**
 * @author ppradhan
 *
 */
public class StaticExample {

	public static Integer instanceCount = 0; //static/class level variable.
	public Integer someOtherCount = 0; //global variable
	final String NAME = "John";

	public StaticExample() {
		instanceCount++;
	}

	public void printInstanceCount() {
		Integer localCount = 0; //local variable.
		System.out.println("# of instances created: " + instanceCount);
	}
	
	public static void tryStaticMethod() {
		System.out.println("Printing static method");
	}
}
