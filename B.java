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

public class B {
	public static void main(String[] args) throws Exception{
		Scanner in =new Scanner(System.in);
		String s0 = in.next();
		if(s0.length()%4 == 1) {
			s0 = "000" + s0;
		}
		if(s0.length()%4 == 2) {
			s0 = "00" + s0;
		}
		if(s0.length()%4 == 3) {
			s0 = "0" + s0;
		}
		char[] ch = s0.toCharArray();
		//int a = in.nextInt();
		String s = to16(ch);
		System.out.println(s);
		
	}
	static String to16(char[] ch) {  
		String s = "";
		if(ch[0] == '0' & ch[1] == '0' & ch[2] == '0' & ch[3] == '1') {
			s += "1";
		}
		if(ch[0] == '0' & ch[1] == '0' & ch[2] == '1' & ch[3] == '0') {
			s += "2";
		}
		if(ch[0] == '0' & ch[1] == '0' & ch[2] == '1' & ch[3] == '1') {
			s += "3";
		}
		if(ch[0] == '0' & ch[1] == '1' & ch[2] == '0' & ch[3] == '0') {
			s += "4";
		}
		if(ch[0] == '0' & ch[1] == '1' & ch[2] == '0' & ch[3] == '1') {
			s += "5";
		}
		if(ch[0] == '0' & ch[1] == '1' & ch[2] == '1' & ch[3] == '0') {
			s += "6";
		}
		if(ch[0] == '0' & ch[1] == '1' & ch[2] == '1' & ch[3] == '1') {
			s += "7";
		}
		if(ch[0] == '1' & ch[1] == '0' & ch[2] == '0' & ch[3] == '0') {
			s += "8";
		}
		if(ch[0] == '1' & ch[1] == '0' & ch[2] == '0' & ch[3] == '1') {
			s += "9";
		}
		if(ch[0] == '1' & ch[1] == '0' & ch[2] == '1' & ch[3] == '0') {
			s += "A";
		}
		if(ch[0] == '1' & ch[1] == '0' & ch[2] == '1' & ch[3] == '1') {
			s += "B";
		}
		if(ch[0] == '1' & ch[1] == '1' & ch[2] == '0' & ch[3] == '0') {
			s += "C";
		}
		if(ch[0] == '1' & ch[1] == '1' & ch[2] == '0' & ch[3] == '1') {
			s += "D";
		}
		if(ch[0] == '1' & ch[1] == '1' & ch[2] == '1' & ch[3] == '0') {
			s += "E";
		}
		if(ch[0] == '1' & ch[1] == '1' & ch[2] == '1' & ch[3] == '1') {
			s += "F";
		}
		for(int i = 1; i < ch.length/4; i++) {
			if(ch[i*4] == '0' & ch[i*4 + 1] == '0' & ch[i+4 + 2] == '0' & ch[i*4 + 3] == '1') {
				s += "1";
			}
			if(ch[i*4] == '0' & ch[i*4 + 1] == '0' & ch[i*4+2] == '1' & ch[i*4+3] == '0') {
				s += "2";
			}
			if(ch[i*4] == '0' & ch[i*4+1] == '0' & ch[i*4+2] == '1' & ch[i*4+3] == '1') {
				s += "3";
			}
			if(ch[i*4] == '0' & ch[i*4+1] == '1' & ch[i*4+2] == '0' & ch[i*4+3] == '0') {
				s += "4";
			}
			if(ch[i*4] == '0' & ch[i*4+1] == '1' & ch[i*4+2] == '0' & ch[i*4+3] == '1') {
				s += "5";
			}
			if(ch[i*4+0] == '0' & ch[i*4+1] == '1' & ch[i*4+2] == '1' & ch[i*4+3] == '0') {
				s += "6";
			}
			if(ch[i*4+0] == '0' & ch[i*4+1] == '1' & ch[i*4+2] == '1' & ch[i*4+3] == '1') {
				s += "7";
			}
			if(ch[i*4+0] == '1' & ch[i*4+1] == '0' & ch[i*4+2] == '0' & ch[i*4+3] == '0') {
				s += "8";
			}
			if(ch[i*4+0] == '1' & ch[i*4+1] == '0' & ch[i*4+2] == '0' & ch[i*4+3] == '1') {
				s += "9";
			}
			if(ch[i*4+0] == '1' & ch[i*4+1] == '0' & ch[i*4+2] == '1' & ch[i*4+3] == '0') {
				s += "A";
			}
			if(ch[i*4+0] == '1' & ch[i*4+1] == '0' & ch[i*4+2] == '1' & ch[i*4+3] == '1') {
				s += "B";
			}
			if(ch[i*4+0] == '1' & ch[i*4+1] == '1' & ch[i*4+2] == '0' & ch[i*4+3] == '0') {
				s += "C";
			}
			if(ch[i*4+0] == '1' & ch[i*4+1] == '1' & ch[i*4+2] == '0' & ch[i*4+3] == '1') {
				s += "D";
			}
			if(ch[i*4+0] == '1' & ch[i*4+1] == '1' & ch[i*4+2] == '1' & ch[i*4+3] == '0') {
				s += "E";
			}
			if(ch[i*4+0] == '1' & ch[i*4+1] == '1' & ch[i*4+2] == '1' & ch[i*4+3] == '1') {
				s += "F";
			}
			
			
		}
		return s;
        
    }
	 
	static int tobin(int a) {  
        int b = 0; 
        int c = a;
        while(c !=0 ) {  
        	if(c == a) {
        		b = c%2;
        	}else {
        		b *= 10*b + c%2;
        	}
            b = c%2;  
            c = c/2;  
        } 
        return b;
        //System.out.println(b);  
    }
	static String to16(int a) {  
		BigInteger bi= new BigInteger("" + a);
		String s2=bi.toString(16);
		BigInteger b2= new BigInteger(s2,16);
		return s2;
        
    }
	static String B1toB2(int a, int b1, int b2) {  
		BigInteger bi= new BigInteger("" + a, b1);
		String s2=bi.toString(b2);
		BigInteger bi2= new BigInteger(s2, b2);
		return s2;
        
    }
	static String to7(int a) {  
		BigInteger bi= new BigInteger("" + a);
		String s2=bi.toString(7);
		BigInteger b2= new BigInteger(s2,7);
		return s2;
        
    }
	static String to2(int a) {  
		BigInteger bi= new BigInteger("" + a);
		String s2=bi.toString(2);
		BigInteger b2= new BigInteger(s2,2);
		return s2;
        
    }
}