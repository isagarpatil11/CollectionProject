package pkg1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ClassE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet
		HashSet hs = new HashSet();
		hs.add("Mumbai");
		hs.add("Agra");
		hs.add("Kolkata");
		hs.add("Delhi");
		hs.add("Hyderabad");
		
		System.out.println(hs);         //order of insertion is Random
		
		//LinkedHashSet
		LinkedHashSet ln = new LinkedHashSet();
		ln.add("Mumbai");
		ln.add("Agra");
		ln.add("Kolkata");
		ln.add("Delhi");
		ln.add("Hyderabad");
		
		System.out.println(ln);         //Order of insertion is Sequential
		
		//TreeSet
		TreeSet ts = new TreeSet();
		ts.add("Mumbai");
		ts.add("Agra");
		ts.add("Kolkata");
		ts.add("Delhi");
		ts.add("Hyderabad");
			
		System.out.println(ts);
	}

}
