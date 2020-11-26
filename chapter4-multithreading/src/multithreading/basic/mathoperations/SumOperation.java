package multithreading.basic.mathoperations;

import multithreading.basic.ThreadSleeper;

public class SumOperation extends Thread {

	private long sleepTime;

	public SumOperation(long sleepTime) {
		this.sleepTime = sleepTime;
	}

	@Override
	public void run() {

		// o an çalışan Thread'in ismini alıyoruz.
		String threadName = Thread.currentThread().getName();

		System.out.println("My summation " + threadName + " is started!");

		int total = 0;
		for (int i = 0; i < 100; i++) {
			total += i;
			System.out.println("Sum - Pre process result: " + total);
			ThreadSleeper.sleep(sleepTime);
		}

		System.out.println("Total: " + total);

	}
}
