package Collections;

import java.util.*;

import org.testng.annotations.Test;

public class LinkedListEx{
	
	@Test
	public static void main()
	{
		List<Integer> list=new ArrayList<>();
		
		for(int i=1;i<10000;i++)
		{
			list.add(i);
		}
		System.out.println(list.get(5000));
		
		Scanner s=new Scanner(System.in);
		
		String input = s.nextLine();
		
		System.out.println("scanned input is "+input);
	}

}
