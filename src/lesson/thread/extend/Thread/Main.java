package lesson.thread.extend.Thread;

public class Main {

	public static void main(String[] args) {
		System.out.println("Le nom du tread principal est " + Thread.currentThread().getName());

		TestThread t1 = new TestThread("A");
		TestThread t2 = new TestThread(" B", t1);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("statut du thread " + t1.getName() + " = " + t1.getState());
		System.out.println("statut du thread " + t2.getName() + " = " + t2.getState());

	}

}
