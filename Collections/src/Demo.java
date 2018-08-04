import java.awt.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();
		v.add("Oracle");
		v.add("Microsoft");
		v.add("Apple");
		v.add("IBM");

		System.out.println(" --- Iterating over vector using for each");
		for (String elem : v)
			System.out.println(elem);

		System.out.println(" --- Iterating over vector using iteartor");
		Iterator<String> itr = v.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		LinkedList<String> lst = new LinkedList<>();
		lst.add("Tesle");
		lst.add("Apache");
		lst.add("Apple");

		v.addAll(lst);
		System.out.println(" --- Iterating over updated vector using for each");
		for (String elem : v)
			System.out.println(elem);

		v.addAll(lst);

		HashSet<String> set = new HashSet<>(v);
		System.out.println(" --- Iterating over Hashset using for each");
		for (String elem : set)
			System.out.println(elem);

		// converting set to treeset

		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println(" --- Iterating over Treeset using for each");
		for (String elem : tree)

			System.out.println(elem);

		TreeSet<String> treedesc = new TreeSet<>(set);
		System.out.println(" --- Iterating over Treeset using for each");
		for (String elem : treedesc.descendingSet())

			System.out.println(elem);
		

		System.out.println(" --- Iterating over Treeset using JAVA 8 for each");	
		//new way to iterate from JAva 8
			tree.forEach(System.out::println);
			
			
			String[]  week= {"Sun","Mon","Tue","Wed","Thurs","Fri","Sat"};
			List<String> days=Arrays.asList(week);
			days.forEach(System.out::println);
			
			


	}
}
