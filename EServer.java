import java.io.*;
import java.net.*;

public class EServer
{
 	public static void main(String[] args) throws IOException 
 	{

  		ServerSocket serverSocket = new ServerSocket(3000);

  		while(true)
  		{
  		try(Socket client = serverSocket.accept();

   			InputStream in = client.getInputStream();

   			DataInputStream dis = new DataInputStream(in))
   			{
   			String message;
			do{
			message=dis.readUTF();
			System.out.println(message);
			}while(!message.equals("BYE"));
			}catch(Exception e){}

  		}

 	}
}