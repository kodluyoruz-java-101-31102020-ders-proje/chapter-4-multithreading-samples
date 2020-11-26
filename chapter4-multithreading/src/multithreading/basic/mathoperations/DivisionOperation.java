package multithreading.basic.mathoperations;

import multithreading.basic.ThreadSleeper;

public class DivisionOperation extends Thread {

	private long sleepTime;

	public DivisionOperation(long sleepTime) {
		this.sleepTime = sleepTime;
	}

	@Override
	public void run() {

		// o an çalışan Thread'in ismini alıyoruz.
		String threadName = Thread.currentThread().getName();

		System.out.println("My summation " + threadName + " is started!");

		double total = 1;
		for (int i = 1; i <= 100; i++) {
			total /= (double)i;
			System.out.println("Division - Pre process result: " + total);
			ThreadSleeper.sleep(sleepTime);
		}

		System.out.println("Total: " + total);

	}
}
