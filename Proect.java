import java.util.Scanner;


public class Proect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
		int number = in.nextInt();
		if(number == 1)
		{
			Server server = new Server();
		}
		else
		{
			Client client = new Client();
		}
	}

}
