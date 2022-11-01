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

public class Cod3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String s = in.nextLine();
		toCode3 tc = new toCode3(s);
		tc.doit();
	}

}

class toCode3 {
	String s;
	toCode3(String s1){
		s = s1;
	}
	int l = s.length();
    char a = s.charAt(0);
    byte kp = 1;
    byte k = 1;
    int c = 1;
    boolean b = false;
    void doit() {
    	while(c < l) {
    		if(s.charAt(c) == a && k < 255) {
    				k++;
    		}
    		if(c < l-1) {
        		if(s.charAt(c+1) != a && k == 1) {
    			if(kp == 1)
    				System.out.print(Character.toString(a));
    			else
    				System.out.print(k + Character.toString(a));
    			kp = k;
    			k = 0;
    			a = s.charAt(c+1);
    		}else {
    			if(s.charAt(c+1) != a || k == 255) {
        			System.out.println(k + Character.toString(a));
        			kp = k;
        			a = s.charAt(c+1);
        			k = 0;
        		}
    		}
    		}else {
    			if(kp == 1 && k != 1)
    				System.out.print(Character.toString(a));
    			else
    				System.out.print(k + Character.toString(a));
    		}
    		
			c++;
    	}
    }
}







