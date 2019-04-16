import java.io.*;
import java.net.*;

class TCPCliente{
	public static void main(String argv[]) throws Exception{
		String frase;
		String fraseModificada;
		BufferedReader entradaDesdeUsuario = new BufferedReader(new InputStreamReader(System.in));
		//String condicion;
		Socket socketCliente = new Socket("192.150.1.100",8000);
		

		DataOutputStream salidaAServidor = new  DataOutputStream(socketCliente.getOutputStream());
		
		System.out.println("Ingrese el texto a enviar al Servidor");
		BufferedReader entradaDesdeServidor = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
		
		frase = entradaDesdeUsuario.readLine();
		salidaAServidor.writeBytes(frase+"\n");
		fraseModificada = entradaDesdeServidor.readLine();
		System.out.println("El Servidor :"+ fraseModificada);
		socketCliente.close(); 
	}

}
