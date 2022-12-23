package java;

import java.util.ArrayList;
import java.util.Collections;
public class FruitBasket {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		list1.add("apple");
		list1.add("mango");
		list1.add("banana");
		System.out.println(list1);
		System.out.println("----------------------------------------------------------");
		
		ArrayList<String> list2=new ArrayList<>();
		list2.add("grapes");
		list2.add("orange");
		list2.add("banana");
		System.out.println(list2);
		System.out.println("----------------------------------------------------------");
		//a.add all the fruits from first basket to second..
		list1.addAll(list2);
		System.out.println(list1);
		System.out.println("----------------------------------------------------------");
		//b.ckeck whether the basket is empty..
		System.out.println("whether the basket is empty or not" +list1.isEmpty());
		System.out.println("----------------------------------------------------------");
		//c. arrange all in the first basket fruits is ascending order
		Collections.sort(list1);
		System.out.println(list1);
		System.out.println("----------------------------------------------------------");
		//d. arrange all in the second basket fruits is descending order
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list2);
		System.out.println("----------------------------------------------------------");
		//e.remove the fruits from specific position
		list1.removeAll(list2);
		System.out.println(list1);
		
		
	}

}