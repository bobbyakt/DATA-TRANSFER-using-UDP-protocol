import java.io.*;
import java.net.*;
import java.util.*;

public class EClient
{
 	public static void main(String[] args) throws IOException
 	{
  		Socket client = new Socket("localhost",3000);
  		BufferedReader buff = new BufferedReader(new InputStreamReader (System.in));
  		String message ="";
  		

  		OutputStream out;

  		DataOutputStream dos;
  		
  		out=client.getOutputStream();
  		dos=new DataOutputStream(out);
  		
  		while(!message.equals("BYE"))
  		{
  		message=buff.readLine();
  		
  		dos.writeUTF("Ankit as Localhost Say :: " + message);
  		
  		dos.flush();
  		}
  		System.out.println("connection terminate");

  		client.close();
 	}
}