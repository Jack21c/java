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

public class BComb {
	public static void main(String[] args) throws Exception{
		Scanner in =new Scanner(System.in);
		int k = in.nextInt();
		int n = in.nextInt();
		int d = 1<<k;
		int c = 1<<n;
		int a = d|c;
		System.out.print(a);
		
	}
}
