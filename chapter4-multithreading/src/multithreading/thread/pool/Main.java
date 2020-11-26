package multithreading.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import multithreading.critical.sections.QMatic;

public class Main {

	public static void main(String[] args) {
		
		 ExecutorService executor = Executors.newFixedThreadPool(15);
		
		 QMatic qmatic = new QMatic();
		 
		 for(int i=0; i < 100; i++) {
			 executor.execute(qmatic);
		 }
	}

}
