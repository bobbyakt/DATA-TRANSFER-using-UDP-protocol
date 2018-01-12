import java.io.*;
import java.net.*;

public class EServerMWorker extends Thread
{
	Socket client;
    int n;
	public EServerMWorker(Socket client, int n) {
		this.client = client;
		this.n=n;
	}

 	public void run() 
 	{
		System.out.println("Starting thread");
		
		try{

			InputStream in = client.getInputStream();

			DataInputStream dis = new DataInputStream(in);
            String message;
			message = dis.readUTF();
		do{
            System.out.println("client"+n+"\n"+message);
            message=dis.readUTF();
            }while(!message.equals("NULL"));
	   		client.close();

		} catch (IOException ex) {
	
			

		} finally {
	
			System.out.println("Ending thread");
		}
		
 	}
}