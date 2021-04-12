package com.homework.week1.day4;

public class Deadlock {

	public static void main(String[] args) {
		Line line = new Line(1,2,4,5);
		Line parallelLine = new Line (1, 0.846, 2, 1.692);
		Line diffLine = new Line(1,2,4,4);


		Runnable lockWizard = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized (parallelLine) {
						Thread.sleep(100);
						synchronized (line) {
							synchronized (diffLine) {
								System.out.println("lockWizzard needs locks for all three lines");
							}
						}
					}
				} catch (Exception e) {
					System.out.println("Exception");
				}
			}
		};

		Runnable lineWizard = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized (line) {
						Thread.sleep(100);
						synchronized (parallelLine) {
							System.out.println("lineWizzard needs line and parallelLine locks");
						}
					}
				} catch (Exception e) {
					System.out.println("Exception");
				}

			}
		};

		Thread lineThread = new Thread(lineWizard);
		Thread lockThread = new Thread(lockWizard);
		lineThread.start();
		lockThread.start();

	}
}
