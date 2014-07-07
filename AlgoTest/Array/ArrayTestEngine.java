/**
 * 
 */
package Array;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import EvaluateReversePolishNotation.ReversePolishArray;

/**
 * @author lams
 *
 */
public class ArrayTestEngine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ReversePolishArray rpa = new ReversePolishArray(args);
		Animal animal = new Animal();
		animal.printKing();
		
		Book b1 = new Book("1234-4657");
		Book b2 = new Book("1234-4657");
		
		System.out.println(b1.equals(b2));		
		System.out.println(b1==b2);
		
		Phone phone = new Phone();
		
		Phone smartphone = new SmartPhone ();
		phone.call();
		
		Deque<Integer> deque = new ArrayDeque();
		deque.addAll(Arrays.asList(1,2,3,4,5));
		System.out.println("Delete "+ deque.remove()) ;
		
		List list = new ArrayList<>(Arrays.asList(1,"string",3.0));
	//	System.out.println(smartphone.key +""+ smartphone.play) ;
		
		List list2 = new LinkedList<>(Arrays.asList(new Integer(1), new Float(2.0F),new Double(3.0)));
		list = list2;
		for(Object obj:list){
			System.out.println (obj +"");
		}
		
		
	}

}

class Animal {
	public void printKing(){
		System.out.println("Lion");
	}
}

class Book{
	String ISBN ;
	Book (String val){
		ISBN =val;
		
	}
	
	public boolean equals(Object b){
		if (b instanceof Book){
			return ((Book)b).ISBN.equals(ISBN);
		}else{
			return false;
		}
	
	}
	
}

class Phone {
	String key = "abc";
	void call (){
		System.out.println ("call-phone");
	}
	
}

class SmartPhone extends Phone{
	boolean play = false;
	void call(){
		System.out.println ("call-samrtPhone");
	}

}


