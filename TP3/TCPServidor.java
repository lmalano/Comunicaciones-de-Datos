
import java.io.*;
import java.net.*;

class TCPServidor{
	public static void main(String argv[])throws Exception{
		System.out.println("Bienvenido al Socket Servidor");
		String fraseCliente;
		String fraseMayusculas;
		ServerSocket socketAcogida = new ServerSocket(8000);
		while(true){
			Socket socketConexion = socketAcogida.accept();
			BufferedReader entradaDesdeCliente = new BufferedReader(new InputStreamReader(socketConexion.getInputStream()));
			
			DataOutputStream salidaACliente = new DataOutputStream(socketConexion.getOutputStream());
			fraseCliente = entradaDesdeCliente.readLine();
			fraseMayusculas = fraseCliente.toUpperCase()+"\n";
			salidaACliente.writeBytes(fraseMayusculas);
			System.out.println("Mensaje del Cliente :  "+ fraseCliente );
		}
		
	}

}
