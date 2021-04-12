package com.week1.day4.JUTestSuite;

import com.week1.day4.ProducerConsumer.ProducerConsumerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.week1.day4.Line.LineTest;
import com.week1.day4.Singleton.SingletonTest;

@RunWith(Suite.class)
@SuiteClasses({LineTest.class, SingletonTest.class, ProducerConsumerTest.class})
public class JUTestSuite {
	

}
