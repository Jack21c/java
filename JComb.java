import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import javax.imageio.*;
import java.io.*;
public class JComb {
    public static void main(String[] args) throws Exception{
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int k = 0;
        for(int i = 7; i>=0; i--) {
             System.out.print(bit(a, i));
        }
    }
    static int bit(int a, int k) {
        int c = 1<<k;
        int a2;
        a2 = a|c;
        if(a2 == a)
            return 1;
        else
            return 0;
    }
}