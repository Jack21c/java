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

public class HeshAFS {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastScanner fs = new FastScanner(System.in);
		//Scanner in =new Scanner(System.in);
		HashSet<String> hs = new HashSet<String>();
		//System.out.println(" ");
		PrintWriter pw = new PrintWriter (System.out);
		while(true) {
			String g = fs.next();
			if(g == "+") {
				String s = fs.next();
				hs.add(s);
			}
			if(g == "?") {
				String s = fs.next();
				boolean bl = hs.contains(s);
				if(bl) pw.println("YES");
				else pw.println("NO");
			}
			if(g == "#")
				break;
		}
		 //PrintWriter printWriter = new PrintWriter ("file.txt");
		    //printWriter.println ("hello");
		    pw.close();   
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