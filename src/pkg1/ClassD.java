package pkg1;

import java.util.ListIterator;
import java.util.Vector;

public class ClassD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Vector 
		
		Vector vlist = new Vector();
		
		vlist.add('@');
		vlist.add('#');
		vlist.add('%');
		vlist.add('&');
		vlist.add('*');
		
		ListIterator lItr = vlist.listIterator();
		
		while(lItr.hasNext())
		{
			System.out.println(lItr.next());
		}
		System.out.println("========================");
		
		while(lItr.hasPrevious())
		{
			System.out.println(lItr.previous());
		}
		
		
		

	}

}
