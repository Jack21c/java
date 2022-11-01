import java.net.ServerSocket;
import java.net.Socket;

public class Client2 {
	public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
		
		ServerSocket ss = new ServerSocket(1234);
		//Socket socket = new Socket("localhost", 1234);
		Socket s = ss.accept();
		Player player = new Player(s, 2);
		player.play();
		//Socket socket = ss.accept();
		//InputStream in = socket.getInputStream();
		//Scanner scanner = new Scanner (in);
		//Print print = new Print(ss);
		//new Thread(print).start();
		
    }

}
