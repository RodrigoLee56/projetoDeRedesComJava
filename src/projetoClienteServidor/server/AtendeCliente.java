package projetoClienteServidor.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class AtendeCliente extends Thread {
	private Socket cliente;

	public AtendeCliente(Socket cliente) {
		this.cliente = cliente;
	}

	public Socket getCliente() {
		return cliente;
	}

	public void setCliente(Socket cliente) {
		this.cliente = cliente;
	}
	
	@Override
	public void run() {
		InputStreamReader fluxoDeDados;
		try {
			System.out.println(
					"Cliente conectado na porta: " + cliente.getPort() + ", com o IP: " + cliente.getInetAddress());
				fluxoDeDados = new InputStreamReader(cliente.getInputStream());
			BufferedReader dado = new BufferedReader(fluxoDeDados);

			System.out.println(dado.readLine());
			cliente.close();
		}catch (IOException e) {
			e.printStackTrace();
		}	
		
	}

}
