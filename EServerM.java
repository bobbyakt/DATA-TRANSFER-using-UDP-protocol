import java.io.*;
import java.net.*;

public class EServerM
{
 	public static void main(String[] args) throws IOException 
 	{

  		ServerSocket serverSocket = new ServerSocket(3000);
		int count = 0;

  		while(true)
  		{
   			Socket socket = serverSocket.accept();

			EServerMWorker worker = new EServerMWorker(socket, count++);
		
			worker.start();

  		}

 	}
}
