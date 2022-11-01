import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import javax.imageio.*;
import java.io.*;

public class HeshB {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //FastScanner fs = new FastScanner(System.in);
			Scanner in =new Scanner(System.in);
			HashSet<String> hs = new HashSet<String>();
			//System.out.println(" ");
			//PrintWriter pw = new PrintWriter (System.out);
			while(true) {
				String g = in.next();
				if(g.equals("+")) {
					String s = in.next();
					hs.add(s);
				}
				if(g.equals("-")) {
					String s = in.next();
					hs.remove(s);
				}
				if(g.equals("?")) {
					String s = in.next();
					boolean bl = hs.contains(s);
					if(bl) System.out.println("YES");
					else System.out.println("NO");
				}
				if(g == "#")
					break;
			}
			 //PrintWriter printWriter = new PrintWriter ("file.txt");
			    //printWriter.println ("hello");
			    //pw.close();   
	}
}

class FastScanner {

    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
    }

    private String nextToken() throws Exception {
        while (tokenizer == null || !tokenizer.hasMoreElements()) {
            tokenizer = new StringTokenizer(reader.readLine());
        }
        return tokenizer.nextToken();
    }

    public String next() {
        try {
            return nextToken();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public int nextInt() {
        try {
            return Integer.parseInt(nextToken());
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public void close() {
        try {
            tokenizer = null;
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}