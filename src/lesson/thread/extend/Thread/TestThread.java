package lesson.thread.extend.Thread;

public class TestThread extends Thread {

	Thread secondThread;

	public TestThread(String name) {
		super(name);
		System.out.println("statut du thread " + name + " = " + this.getState());
		this.start();
		System.out.println("statut du thread " + name + " = " + this.getState());
	}

	public TestThread(String name, Thread t) {
		super(name);
		this.secondThread = t;
		System.out.println("statut du thread " + name + " = " + this.getState());
		this.start();
		System.out.println("statut du thread " + name + " = " + this.getState());
	}

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.println("Statut " + this.getName() + " = " + this.getState());
			if (secondThread != null) {
				System.out.println("statut de " + secondThread.getName() + " pendant le thread " + this.getName()
						+ " = " + secondThread.getState());
			}

		}
	}

	public void setThread(Thread t) {
		this.secondThread = t;
	}
}
