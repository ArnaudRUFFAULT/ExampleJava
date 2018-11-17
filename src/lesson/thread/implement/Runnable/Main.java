package lesson.thread.implement.Runnable;

public class Main {

	public static void main(String[] args) {
		
		CompteEnBanque cb = new CompteEnBanque();
		
		Thread t = new Thread(new RunImpl(cb, "Arnaud"));
		Thread t2 = new Thread(new RunImpl(cb, "Ronan"));
		
		t.start();
		t2.start();
	}

}
