public class TaskThreadDemo {
	
	public static void main(String[] args) {
		// Create tasks (code to the interface; not the implementation!)
		Runnable jr = new StockCar(88);
		Runnable gordon = new StockCar(24);
		Runnable jjohnson = new StockCar(48);

		// Create threads
		Thread thread1 = new Thread(jr);
		Thread thread2 = new Thread(gordon);
		Thread thread3 = new Thread(jjohnson);

		// Start threads
		thread3.start();
		//thread1.start();
		//thread2.start();
		
	}
}
