package Auto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("Roshani");
		al.add(101);
		al.add('A');
		al.add(30.4f);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains("Roshani"));
		System.out.println(al.get(4));
		System.out.println(al);
		
		al.add(2, "Sharad");
		System.out.println(al);
		
		al.remove(2);
		System.out.println(al);
		
		al.set(4, "Sharad");
		System.out.println(al);
		System.out.println("\n");
		
		System.out.println("----print by using iterator cursor-----");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\n");
		System.out.println("----print by using listiterator cursor-----");
		ListIterator litr = al.listIterator();	
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("\n");
		System.out.println("----print by using for loop-----");
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("\n");
		System.out.println("----print by using for each loop-----");
		for(Object s1:al)
		{
			System.out.println(s1);
		}
		
		
		
	
	
	}
}
