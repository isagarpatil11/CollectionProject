package pkg1;

import java.util.ArrayList;

public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Q.Sum all integers from the given method stub
		
		ArrayList<Object> list = new ArrayList<>();
		
		list.add(10);
		list.add("velocity");
		list.add("%");
		list.add(50);
		list.add("Classes");
		list.add("63");
		list.add('#');
		list.add(78);
		
		int sum = 0;
		
		for(Object k:list)
		{
			try
			{
				sum = sum + Integer.parseInt(k.toString());
			}catch(Exception ee)
			{ 
				System.out.println(ee);
			}
		}
		System.out.println(sum);
		
	}

}
