package Assessment;

public class TechnicalCourse extends Course{

	public TechnicalCourse(int courseId, String courseName, String instructor, int durationWeeks, double fee) {
		super(courseId, courseName, instructor, durationWeeks, fee);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateDiscount() {
		return (fee>2000)?fee*0.90:fee;
	}
	

}
