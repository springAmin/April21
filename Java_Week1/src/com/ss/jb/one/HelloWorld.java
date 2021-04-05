/**
 * Base package for java basics.
 */
package com.ss.jb.one;

/**
 * This is a demo HelloWorld class
 * @author ppradhan
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AccessMod accessMod = new AccessMod("John");
		accessMod.runPublicMethod();
//		accessMod.runPrivateMethod();
		accessMod.runProtMethod();
		
		StaticExample stmpl = new StaticExample();
		stmpl.printInstanceCount();
		StaticExample stmplTwo = new StaticExample();
		stmplTwo.printInstanceCount();
		StaticExample.tryStaticMethod();
		
	}

}
