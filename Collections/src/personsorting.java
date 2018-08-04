import java.util.TreeSet;

public class personsorting {

	public static void main(String[] args) {

//		personcomparator pc = new personcomparator();
	//TreeSet<person> persons = new TreeSet<>(pc);

		TreeSet<person> persons = new TreeSet<>((p1,p2) -> p1.getage() - p2.getage());
		
	//	TreeSet<person> persons=new TreeSet<>();
		
		persons.add(new person("polo", 21));
		persons.add(new person("lili", 19));
		persons.add(new person("mile", 20));

		persons.forEach(System.out::println);
	}

}
