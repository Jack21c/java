import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class RB1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//String s = new String(Files.readAllBytes(Paths.get("M:\\test.txt")));
		byte[] b = Files.readAllBytes(Paths.get("M:\\test.txt"));
		
		String res = "";
		
		FileOutputStream fout = new FileOutputStream("M:\\test2.txt");
		
		for(int i = 1; i < b.length; i+=2){
			//res += s[i];
			//System.out.print(b[i]);
			fout.write(b[i]);
		}
	}

}
