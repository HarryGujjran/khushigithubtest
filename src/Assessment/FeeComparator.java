package Assessment;

import java.util.Comparator;

public class FeeComparator implements Comparator<Course>{

	@Override
	public int compare(Course o1, Course o2) {
		// TODO Auto-generated method stub
		
		return Double.compare(o1.fee, o2.fee);
	}

}
