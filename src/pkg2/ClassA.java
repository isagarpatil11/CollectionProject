package pkg2;

import java.util.ArrayList;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abbcccddddeeeee";
		
		ArrayList list =new ArrayList();
		
		for(int i=0; i<a.length(); i++)
		{
			int count = 0;
			if(!list.contains(a.charAt(i)))
			{
				for(int j=i+1; j<a.length(); j++)
				{
					if(a.charAt(i) == a.charAt(j))
					{
						count++;
						list.add(a.charAt(i));
						
					}
				}	
				System.out.println(a.charAt(i) + " repeated " + count);
			}
		}

	}

}
