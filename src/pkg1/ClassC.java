package pkg1;

import java.util.Iterator;
import java.util.LinkedList;

public class ClassC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList list = new LinkedList();
				
		list.add(10);
		list.add(50);
		list.add(245);
		list.add(50);
		list.add(75);
		list.add(63);
		
		
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		list.add(3, 750);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		System.out.println(list.get(3));       //data retrival operation
	}

}
