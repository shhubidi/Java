package Java1;

class Multithreading extends Thread {
	// child parent
	public void run() {// overriding the run() method
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		System.out.println("id: " + id + " name: " + name);
	}
}

public class MultithreadingDemo {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // creating 5 thread
			Multithreading thread1 = new Multithreading();
			thread1.start(); // will automatically executes the run()
			System.out.println("===========================");
		}

	}
}
