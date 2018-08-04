
public class person implements Comparable<person>{
	private String name;
	private int age;

	public person() {

	}

	public person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\tAge: " + age;
	}

	public int getage() {
		return age;

	}

	public int compareTo(person p) {
		return name.compareTo(p.name);

	}

}
