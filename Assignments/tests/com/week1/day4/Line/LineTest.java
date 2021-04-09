package com.week1.day4.Line;


import com.homework.week1.day4.Line;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LineTest {
	
	Line line = new Line(3.9,5.1,6.5,7.3);
	double slope = 0.846;
    double distance = 5.099;
    Line parallelLine = new Line (1, 0.846, 2, 1.692);

	@Test
	public void getSlopeTest() {
		double lineSlope = line.getSlope();
		double diff = slope - lineSlope;
		boolean isEqual = diff < 0.0009;
		assertEquals(isEqual, true);
	}
	
	@Test
	public void getDistanceTest() {
		double lineDistance = line.getDistance();
		double diff = distance - lineDistance;
		boolean isEqual = diff < 0.0009;
		assertEquals(isEqual, true);
	}
	
	@Test
	public void parallelToTest() {
		assertEquals(line.parallelTo(parallelLine), true);
	}

}
