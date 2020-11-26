package multithreading.basic;

public class SimpleRunnable implements Runnable {

	private boolean live = true;
	
	@Override
	public void run() {
		
		// o an çalışan Thread'in ismini alıyoruz.
		String threadName = Thread.currentThread().getName();
		
		System.out.println("My summation " + threadName + " is started!");
		
		int total = 0;
		while(live) 
		{
			boolean oddNumber = (total % 2 != 0);
			
			if(oddNumber) {
				System.out.println(threadName + "-" + total);
			}
			
			total += 1;
			
			// yarım saniye bekletiyoruz.
			ThreadSleeper.sleep(100);
		}
		
		//System.out.println("Total: " + total);
	}
	
	public void stop() {
		this.live = false;
	}

}
