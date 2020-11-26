package multithreading.critical.sections;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		QMatic qmatic = new QMatic();
		
		for(int i=0; i < 10; i++) {
			Thread thread = new Thread(qmatic);
			thread.start();
		}
	}

}
