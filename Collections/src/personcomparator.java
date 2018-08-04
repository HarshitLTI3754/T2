import java.util.*;

public class personcomparator implements Comparator<person> {

	@Override
	public int compare(person p1, person p2) {
		return p1.getage() - p2.getage();
	}

}
