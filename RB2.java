import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class RB2 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        //String s = new String(Files.readAllBytes(Paths.get("M:\\test.txt")));
        byte[] b = Files.readAllBytes(Paths.get("M:\\test.txt"));
        String abc = "";
        String res = "";
        byte[] b2 = new byte[b.length];
        FileOutputStream fout = new FileOutputStream("M:\\test2.txt");

        for(int i = 0; i < b.length; i++){
            //res += s[i];
            //System.out.print(b[i]);
            //if()
            if(abc.indexOf(b[i]) == -1)
                abc+=b[i];
        }
        int c = power2up(abc.length());
        int d = Integer.toBinaryString(c).length();
        int k =d*b.length%8;
        if(k != 0)
            k = 8 - k;

        String sl = Integer.toString(abc.length());
        char[] chl = sl.toCharArray();
        for(int y = 0; y<sl.length(); y++) fout.write(chl[y]);
        fout.write(abc.length());
        char[] f = abc.toCharArray();
        for(int y = 0; y<abc.length(); y++) fout.write(f[y]);
        String sk = Integer.toString(8-k);
        char[] chk = sk.toCharArray();
        for(int y = 0; y<sk.length(); y++) fout.write(chk[y]);
        fout.write(8-k);
        for(int i = 0; i < b.length; i++){
            //res += s[i];
            //System.out.print(b[i]);
            //if()
            String g = Integer.toBinaryString(abc.indexOf(b[i]));
            String so = Integer.toString(0);
            char[] cho = so.toCharArray();
            for(int j = d+1-g.length(); j> 0; j--) fout.write(cho[0]);
            char[] h = g.toCharArray();
            for(int y = 0; y<h.length; y++) fout.write(h[y]);
        }
        String so = Integer.toString(0);
        char[] cho = so.toCharArray();
        for(int j = k; j> 0; j--) fout.write(cho[0]);
    }
    public static int power2up(int x) {
        x--;
        for(int i = 1; i<32; i<<=1)
            x |= (x>>i);
        return ++x;
    }
}
