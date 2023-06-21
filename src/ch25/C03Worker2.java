package ch25;

public class C03Worker2 implements Runnable {
	C01GUI gui;

	C03Worker2(C01GUI gui) {
		this.gui = gui;
	}

	@Override
	public void run() {
		while (true) {
			try {
				gui.area2.append("Thread2....\n");
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				System.out.println(e1);
//				e1.printStackTrace();
			}
		}

	}

}