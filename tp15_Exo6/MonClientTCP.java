package be.cardinalmercier.tp15_Exo6;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MonClientTCP extends Socket {
	public MonClientTCP() throws UnknownHostException, IOException{
		super("127.0.0.1",Param.NUMPORT);
	}
	public static void main(String[] args) throws IOException{
		try {
			MonClientTCP client = new MonClientTCP();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

