package com.week1.project;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.week1.project.FunctionalTests;
import com.week1.project.LambdaTest;
import com.week1.project.RecursionTest;


@RunWith(Suite.class)
@SuiteClasses({FunctionalTests.class, LambdaTest.class, RecursionTest.class})
public class JUTestSuite {


}
