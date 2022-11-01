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

public class Cod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		String s = in.nextLine();
		int l = s.length();
	    char a = s.charAt(0);
	    int k = 1;
	    int c = 1;
	    	while(c < l) {
	    		if(s.charAt(c) == a) {
	    				k++;
	    		}
	    		if(c < l-1) {
	    			if(s.charAt(c+1) != a) {
	    				String s2 = Character.toString(a);;
		    			System.out.print(k + s2);
		    			a = s.charAt(c+1);
		    			k = 0;
		    		}
	    		}else {
	    			String s2 = Character.toString(a);;
	    			System.out.print(k + s2);
	    		}
	    		c++;
	    	}
	}

}

class toCode1 {
	String s;
	toCode1(String s1){
		s = s1;
	}
	int l = s.length();
    char a = s.charAt(0);
    int k = 1;
    int c = 1;
    void doit() {
    	while(c < l) {
    		while(s.charAt(c) == a) {
    				k++;
    				c++;
    		}
    		if(s.charAt(c) != a) {
    			System.out.print(k + a);
    			a = s.charAt(c);
    			k = 1;
    		}
    	}
    }
}







