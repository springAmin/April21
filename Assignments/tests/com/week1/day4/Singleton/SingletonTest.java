package com.week1.day4.Singleton;

import com.homework.week1.day4.Singleton;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class SingletonTest {
	
	Singleton singleton = new Singleton();
	
	@Test
	public void getInstanceTest() {
		System.out.print(singleton.getInstance());
		assertNotEquals(singleton.getInstance(), null);
	}
	

}
