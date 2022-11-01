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

public class SortB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Collega> c = new ArrayList<>();
		ArrayList<Taxi> t = new ArrayList<>();
		//Collega[] c = new Collega[n];
		//Taxi[] t = new Taxi[n];
		for (int j = 0; j < n; j++) {
			int r = in.nextInt();
			c.add(new Collega(j + 1, r));
			//c[j] = new Collega(j + 1, r);
		}
		for (int j = 0; j < n; j++) {
			int r = in.nextInt();
			t.add(new Taxi(j + 1, r));
			//t[j] = new Taxi(j + 1, r);
		}
		// Couple[] d = new Couple[n];
		Collections.sort(c, new CompStudentI2());
		Collections.sort(t, new CompStudentI2_());
		//Arrays.sort(c, new CompStudentI2());
		//Arrays.sort(t, new CompStudentI2_());
		ArrayList<Num> num = new ArrayList<>();
		//Num[] num = new Num[n];
		for (int j = 0; j < n; j++){
			num.add(new Num(c.get(j).i1, t.get(j).i1));
			//num[j] = new Num(c[j].i1, t[j].i1);
		}
		Collections.sort(num, new CompStudentI1_());
		//Arrays.sort(num, new CompStudentI1_());
		for (int j = 0; j < n; j++)
			num.get(j).print2();
	}
}

class Student {
	public int i1, i2;

	public Student(int i, int cr1) {
		i1 = i;
		i2 = cr1;
	}

	public Student() {
	}

	public void print() {
		// System.out.println(inumber + " " + point);
	}

	public void print2() {
		System.out.print(i2 + " ");
	}

	public void print1() {
		System.out.print(i1 + " ");
	}
}

class Collega extends Student {
	public Collega(int i, int cr1) {
		super(i, cr1);
	}

	public Collega() {
		super();
	}

	public void print() {
		// System.out.println(inumber + " " + point);
	}
}

class CompStudentI1 implements Comparator<Student> {
	public int compare(Student a, Student b) {
		if (a.i1 < b.i1)
			return 1;
		else
			return -1;
	}
}

class CompStudentI1_ implements Comparator<Student> {
	public int compare(Student a, Student b) {
		if (a.i1 < b.i1)
			return -1;
		else
			return 1;
	}
}

class CompStudentI2 implements Comparator<Student> {
	public int compare(Student a, Student b) {
		if (a.i2 < b.i2)
			return 1;
		else
			return-1;
	}
}

class CompStudentI2_ implements Comparator<Student> {
	public int compare(Student a, Student b) {
		if (a.i2 < b.i2)
			return -1;
		else
			return 1;
	}
}

class Taxi extends Student {
	public Taxi(int i, int t) {
		super(i, t);
	}

	public Taxi() {
	}

	public void print() {
		// System.out.println(inumber + " " + point);
	}
}

class Num extends Student {
	public Num(int ic, int it) {
		super(ic, it);
	}

	public Num() {
	}

}

class Couple {
	public int i, r, t, ti;
	public Collega clg;
	public Taxi car;

	public Couple(Collega c1, Taxi c2) {
		clg = c1;
		car = c2;
		i = c1.i1;
		r = c1.i2;
		t = c2.i1;
		ti = c2.i2;
	}

	public Couple(int i1, int r1, int t1, int ti1) {
		i = i1;
		r = r1;
		t = t1;
		ti = ti1;
	}

	// public Couple(int i1, int r1) {i = i1; r = r1;}
	// public Couple(int t1, int ti1) {t = t1; ti = ti1;}
	public Couple() {
	}
}
