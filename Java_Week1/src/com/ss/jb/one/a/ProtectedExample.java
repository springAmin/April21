/**
 * 
 */
package com.ss.jb.one.a;

import com.ss.jb.one.AccessMod;

/**
 * @author ppradhan
 *
 */
public class ProtectedExample extends AccessMod{
	
	public static void main(String[] args) {
		ProtectedExample protEx = new ProtectedExample();
		protEx.runPublicMethod();
//		accessMod.runPrivateMethod();
		protEx.runProtMethod();
//		protEx.runDefMethod();
	}
}
