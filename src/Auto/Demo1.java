package Auto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo1 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("Sharad");
		al.add(202);
		al.add('S');
		al.add("Ghotekar");
		al.add('C');
		al.add(78.45f);
		al.add(400);
		al.add("Roshani");
		al.add(89.45f);
		al.add('o');
		al.add("Avadhut");
		al.add(null);
		al.add(null);
		al.add(101);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains("Roshani"));
		System.out.println(al.get(5));
		System.out.println(al);
		
		System.out.println("\n");
		al.add(5, "Dipti");
		System.out.println(al);
		
		System.out.println("\n");
		al.remove(5);
		System.out.println(al);
		
		System.out.println("\n");
		al.set(11, "Dipti");
		System.out.println(al);
		System.out.println("\n");
		
		System.out.println("----print by using iterator cursor-----");
		Iterator s1 = al.iterator();
		while(s1.hasNext())
		{
			System.out.println(s1.next());
		}
		
		System.out.println("\n");
		System.out.println("----print by using listiterator cursor-----");
		ListIterator s2 = al.listIterator();
		while(s2.hasNext())
		{
			System.out.println(s2.next());
		}
		
		System.out.println("\n");
		System.out.println("----print by using For lopp-----");
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("\n");
		System.out.println("----print by using each for loop-----");
		for(Object s3:al)
		{
			System.out.println(s3);
		}
		
	}
}
