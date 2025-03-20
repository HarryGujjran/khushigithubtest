package Assessment;

public abstract class Course {
	int courseId;
	String courseName;
	String instructor;
	int durationWeeks;
	double fee;
	public Course(int courseId, String courseName, String instructor, int durationWeeks, double fee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructor = instructor;
		this.durationWeeks = durationWeeks;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", instructor=" + instructor
				+ ", durationWeeks=" + durationWeeks + ", fee=" + fee + "]";
	}
	
	public abstract double calculateDiscount();

}
