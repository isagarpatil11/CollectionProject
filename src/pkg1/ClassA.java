package pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<>();  //generic
		
		list.add(10);
		list.add(85);
		list.add(96);
		list.add(50);
		list.add(245);
		
		System.out.println(list.get(3));          //Data retrival operation
		
		//get size pf list
		System.out.println(list.size());
		
		//using set method
		list.set(2, 100);
		System.out.println(list);
		
		//list in reverse
		Collections.reverse(list);
		System.out.println(list);
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Bike");
		list1.add("Car");
		list1.add("Truck");
		list1.add("Plain");
		list1.add("Bus");
				Collections.sort(list1);
				System.out.println(list1);
				
				
	}

}
