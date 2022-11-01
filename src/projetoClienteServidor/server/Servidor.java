package projetoClienteServidor.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) {
		try {
			try (ServerSocket servidor = new ServerSocket(7000)) {
				System.out.println("Servidor iniciado!");
				Thread.sleep(3000);

				while (true) {
					new AtendeCliente(servidor.accept()).start();
//					Socket cliente = servidor.accept();
//					System.out.println(
//							"Cliente conectado na porta: " + cliente.getPort() + ", com o IP: " + cliente.getInetAddress());
//					InputStreamReader fluxoDeDados = new InputStreamReader(cliente.getInputStream());
//					BufferedReader dado = new BufferedReader(fluxoDeDados);
//
//					System.out.println(dado.readLine());
//					cliente.close();
				}
			}
		} catch (Exception e) {
			System.out.println("Ocorreu o erro durante a conexão!");
		}
	}
}