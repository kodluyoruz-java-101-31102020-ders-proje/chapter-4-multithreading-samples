package multithreading.basic;

import multithreading.basic.mathoperations.DivisionOperation;
import multithreading.basic.mathoperations.SubstractionOperation;
import multithreading.basic.mathoperations.SumOperation;

public class Main {

	public static void main(String[] args) {

		// runParallelMathOperations();
		
		// useThreadClassSamples();
		
		useRunnableSamples();
	}
	
	private static void runParallelMathOperations() {
		
		SumOperation sumOperationThread = new SumOperation(500l);
		sumOperationThread.start();
		
		SubstractionOperation substractionOperationThread = new SubstractionOperation(250l);
		substractionOperationThread.start();
		
		DivisionOperation divisionOperationThread = new DivisionOperation(100l);
		divisionOperationThread.start();
	}
	

	private static void useThreadClassSamples() {
		
		SimpleThread simpleThread = new SimpleThread();
		simpleThread.start();

		SimpleThread simpleThread2 = new SimpleThread();
		simpleThread2.start();
	}
	
	private static void useRunnableSamples() {

		// Runnable interface'den kalıtım almış olan "SimpleRunnable" sınıfından bir
		// nesne oluşturuyoruz.
		SimpleRunnable simpleRunnable = new SimpleRunnable();

		// Runnable tipindeki nesneyi Thread kurucusuna gönderiyoruz.
		Thread simpleThread3 = new Thread(simpleRunnable);

		// start fonksiyonunu çağırdığımızda "SimpleRunnable" sınıfı içindeki "run"
		// fonksiyonu işletilecektir.
		simpleThread3.start();

		Thread simpleThread4 = new Thread(simpleRunnable);
		simpleThread4.start();

		ThreadSleeper.sleep(20000);

		simpleRunnable.stop();
	}

}
