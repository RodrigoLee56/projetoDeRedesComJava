package projetoClienteServidor.server;

import java.io.PrintStream;
import java.net.Socket;

public class Cliente {
	public static void main(String[] args) {
		try {
			Socket cliente = new Socket("127.0.0.1", 7000);
			PrintStream ps = new PrintStream(cliente.getOutputStream());
			
			ps.print("Rodrigo aqui desse lado!");
			cliente.close();
			
		} catch (Exception e) {
			System.out.println("Ocorreu o erro durante a conexão!");
		}
	}
}
