package ch26;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientRecvThread implements Runnable{

	Socket client;
	DataInputStream din;

	ClientRecvThread(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {

		try {
			din = new DataInputStream(client.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		String recv = null;
		while (true) {

			try {
				recv = din.readUTF();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if (recv.equals("q") || recv == null)
				System.exit(-1);
			System.out.println("[Client] " + recv);

		}
	}

}

