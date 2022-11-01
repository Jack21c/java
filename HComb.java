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
public class HComb {
    public static void main(String[] args) throws Exception{
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
        int k = in.nextInt();
        int c = 1<<k;
        int a1 = a;
        int a2 = a;
        for(int i = k; a>>i > 0; i++) {
            c = 1<<i;
            a = a|c;
            a = a^c;
        }
        System.out.print(a);
    }
}