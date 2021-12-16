import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Google");
		list.add("oracle");
		list.add(2,"Microsoft");
		
		System.out.println("-- traversing over arraylist using for loop...");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
		System.out.println("---traversing over the arraylist using  iterator");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("---traversing over arraylist using for each loop");
		for(String s:list)
			System.out.println(s);
		
		LinkedList<String> link=new LinkedList<String>();
		link.add("Tesla");
		link.add("Apache");
		link.add("Apple");
		
		list.addAll(link);
		System.out.println("--traversing over updated arraylist using for each loop");
		for(String s:list)
			System.out.println(s);
		
		HashSet<String> set=new HashSet<String>(list);
		set.add("Alto");
		set.add("Kia");
		
		list.addAll(set);
		System.out.println("traversing over updated arraylist using for each loop");
		for(String s:list);
		System.out.println(set);
		
		
		
		
	}

}
