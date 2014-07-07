/**
 * 
 */
package TestEngine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import ReverseWordsInAString.ReverseWords;
import TwoSum.TwoSum;

/**
 * @author lams
 * 
 */

public class TestDriver {

	public static long startTime;
	public static long endTime;

	/**
	 * 
	 */
	public TestDriver() {
		// TODO Auto-generated constructor stub

	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) {

		if (args == null) {
			System.out.println("null");
		}

		System.out.println("argument " + args.length);

		/*
		 * // TODO Auto-generated method stub startTime =
		 * Calendar.getInstance().getTimeInMillis(); ReverseWords reverseWords =
		 * new ReverseWords(); reverseWords.Solution("   a   b "); TwoSum ts =
		 * new TwoSum(); int[] arr = {2, 7, 11, 15}; int[] res =
		 * ts.Solution(arr, 9); if (res.length ==2) System.out.println
		 * ("index1 = " +res[0]+ " index2 = "+ res[1]); endTime =
		 * Calendar.getInstance().getTimeInMillis(); printRunningTime();
		 * 
		 * ArrayList<Integer> al = new ArrayList<>();
		 * System.out.println(al.contains("string")); al.add(111);
		 */
		/*
		 * TestDriver td = new TestDriver(); td.method(null);
		 */
		A ca = new A();
		B b = new B();

		ca = (A) b;
		A a = b;
		I i = a;

		System.out.println(i);
		System.out.println((B) a);
		System.out.println(ca);

		/*int a = 5, b = 7, k = 0;
		double d = 2.0;
		Integer m = null;

		k = new Integer(a) + new Integer(b);
		k = new Integer(a) + b; // 2        
		k = a + new Integer(b); // 3        
		m = new Integer(a) + new Integer(b); // 4
		System.out.println(a + d);
		TestDriver td = new TestDriver();

		td.probe(d);*/

	}

	/*
	 * public static void doStuff() throws Exception{
	 * System.out.println("Doing stuff..."); if(Math.random()>0.4){ throw new
	 * Exception("Too high!"); } System.out.println("Done stuff."); }
	 */

	void probe(Object x) {
		System.out.println("In Object");
	} // 3

	void probe(Number x) {
		System.out.println("In Number");
	} // 2

	void probe(Integer x) {
		System.out.println("In Integer");
	} // 2

	void probe(Long x) {
		System.out.println("In Long");
	} // 4

	public static void printRunningTime() {
		long timeExe = endTime - startTime;
		System.out.println("The program execution time is : " + timeExe + "");
	}

	public void method(Object o) {
		System.out.println("Object Version");
	}

	public void method(java.io.IOException s) {
		System.out.println("IOException Version");
	}

	public void method(java.io.FileNotFoundException s) {
		System.out.println("java.io.FileNotFoundException Version");
	}

}

interface I {
}

interface ConstTest {
	public int A = 1; // 1
	int B = 1; // 2
	static int C = 1; // 3
	final int D = 1; // 4
	public static int E = 1; // 5
	public final int F = 1; // 6
	static final int G = 1; // 7
	public static final int H = 1; // 8
}

class A implements I {
	public String toString() {
		return "in a ";
	}
}

class B extends A {
	public B() {

	}

	public String toString() {
		return super.toString() + "in b";
	}
}
