/**
 * 
 */
package be.cardinalmercier.tp15_Exo6;

/**
 * @author Macka
 *
 */
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MonServeurTCP extends ServerSocket {
	public MonServeurTCP()throws IOException{
		super(Param.NUMPORT);
	}
	public static void main (String []args){
		try{
			MonServeurTCP serveurTCP =new MonServeurTCP();
			while(!serveurTCP.isClosed()){
				Socket client = serveurTCP.accept();
				System.out.println("Un nouveau client est connecté");
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}