import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Tre {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        //String s = new String(Files.readAllBytes(Paths.get("M:\\test.txt")));
        byte[] b = Files.readAllBytes(Paths.get("M:\\test.txt"));
        String abc = "";
        String res = "3";
        byte[] b2 = new byte[b.length];
        FileOutputStream fout = new FileOutputStream("M:\\test3.txt");

		for(int i = 0; i < b.length; i++){
			//res += s[i];
			//System.out.print(b[i]);
			//if()
			if(abc.indexOf(b[i]) == -1)
				abc+=b[i];
		}/*
		int c = power2up(abc.length());
        int d = Integer.toBinaryString(c).length();
        int k =d*b.length%8;
        if(k != 0)
			k = 8 - k;*/
        String sl = Integer.toString(abc.length());
        char[] chl = sl.toCharArray();
        for(int y = 0; y<sl.length(); y++) fout.write(chl[y]);
        System.out.println(abc.length());
        System.out.println(abc);
        String sf = Integer.toString(3);
        char[] chf = sl.toCharArray();
        for(int y = 0; y<sf.length(); y++) fout.write(chf[y]);
        System.out.print(3);
        byte bi = 3;
        //fout.write(3);
        //fout.write(bi);
        //fout.write((char)abc.length());
        //char ch2 = (char) abc.length();
        //int intt = 3;
        //res = Integer.toString(intt);
        //byte l = Byte.toByte(intt);
        //System.out.print(ch2);
        //System.out.print("intt");
        //System.out.print(abc.length());
        //fout.write(intt);
        //char[] f = res.toCharArray();
        //(int y = 0; y<res.length(); y++) fout.write(f[y]);
		/*fout.write(8-k);
		for(int i = 0; i < b.length; i++){
			//res += s[i];
			//System.out.print(b[i]);
			//if()
			String g = Integer.toBinaryString(abc.indexOf(b[i]));
            for(int j = d+1-g.length(); j> 0; j--) fout.write(0);
			char[] h = g.toCharArray();
			for(int y = 0; y<h.length; y++) fout.write(h[y]);
		}
		for(int j = k; j> 0; j--) fout.write(0);*/
    }
    public static int power2up(int x) {
        x--;
        for(int i = 1; i<32; i<<=1)
            x |= (x>>i);
        return ++x;
    }

}
