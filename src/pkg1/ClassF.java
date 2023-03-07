package pkg1;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ClassF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //HashMap
		
		HashMap<Object,Object> map = new HashMap<>();
		
		map.put(1, "Mumbai");
		map.put("City1", "Kolkata");
		map.put(5,"Delhi");
		map.put("City2","Goa");
		map.put(4, "Pune");
		
		System.out.println(map);
		
		for(Map.Entry<Object,Object> k : map.entrySet())
           {
	             System.out.println(k.getKey() + "-->" + k.getValue());
           }
		Set mapSet = map.entrySet();
		
		Iterator it = mapSet.iterator();
	    
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
	
	//Hashtable
		Hashtable<Object,Object> map1 = new Hashtable<>();
		map1.put(1, "Mumbai");
		map1.put("City1", "Kolkata");
		map1.put(5,"Delhi");
		map1.put("City2","Goa");
		map1.put(4, "Pune");
		
		System.out.println(map1);
		
		
		
		
		
		
		
		
		
		
	}

}
