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

public class A {
	public static void main(String[] args) throws Exception{
		Scanner in =new Scanner(System.in);
		String s0 = in.next();
		char[] ch = s0.toCharArray();
		//int a = in.nextInt();
		String s = to2(ch);
		System.out.println(s);
		
	}
	static String to2(char[] ch) {  
		String s = "";
		if(ch[0] == '1') {
			s += "1";
		}
		if(ch[0] == '2') {
			s += "10";
		}
		if(ch[0] == '3') {
			s += "11";
		}
		if(ch[0] == '4') {
			s += "100";
		}
		if(ch[0] == '5') {
			s += "101";
		}
		if(ch[0] == '6') {
			s += "110";
		}
		if(ch[0] == '7') {
			s += "111";
		}
		if(ch[0] == '8') {
			s += "1000";
		}
		if(ch[0] == '9') {
			s += "1001";
		}
		if(ch[0] == 'A') {
			s += "1010";
		}
		if(ch[0] == 'B') {
			s += "1011";
		}
		if(ch[0] == 'C') {
			s += "1100";
		}
		if(ch[0] == 'D') {
			s += "1101";
		}
		if(ch[0] == 'E') {
			s += "1110";
		}
		if(ch[0] == 'F') {
			s += "1111";
		}
		for(int i = 1; i < ch.length; i++) {
			if(ch[i] == '0') {
				s += "0000";
			}
			if(ch[i] == '1') {
				s += "0001";
			}
			if(ch[i] == '2') {
				s += "0010";
			}
			if(ch[i] == '3') {
				s += "0011";
			}
			if(ch[i] == '4') {
				s += "0100";
			}
			if(ch[i] == '5') {
				s += "0101";
			}
			if(ch[i] == '6') {
				s += "0110";
			}
			if(ch[i] == '7') {
				s += "0111";
			}
			if(ch[i] == '8') {
				s += "1000";
			}
			if(ch[i] == '9') {
				s += "1001";
			}
			if(ch[i] == 'A') {
				s += "1010";
			}
			if(ch[i] == 'B') {
				s += "1011";
			}
			if(ch[i] == 'C') {
				s += "1100";
			}
			if(ch[i] == 'D') {
				s += "1101";
			}
			if(ch[i] == 'E') {
				s += "1110";
			}
			if(ch[i] == 'F') {
				s += "1111";
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
	static String B1toTen(int a, int b1) {  
		BigInteger bi= new BigInteger("" + a, b1);
		String s2=bi.toString(10);
		BigInteger bi2= new BigInteger(s2, 10);
		return s2;
        
    }
	
	static String TentoB2(int a, int b2) {  
		BigInteger bi= new BigInteger("" + a, 10);
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