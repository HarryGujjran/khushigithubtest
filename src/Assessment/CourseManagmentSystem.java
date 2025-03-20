package Assessment;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class CourseManagmentSystem {
	
	private LinkedList<Course> courses=new LinkedList<>();
	
	public void addCourse(Course course) {
		courses.add(course);
		
	}
	public void filterCoursesByDuration() {
		System.out.println("Courses with duration >4 weeks");
		courses.stream().filter(course->course.durationWeeks>4).forEach(System.out::println);
		
	}
	public void sortCoursesByFee() {
		Collections.sort(courses, new FeeComparator());
	}
	public void displayCourses() {
		for(Course course:courses) {
			System.out.println(course);
		}
		
	}
	public List<Course> getCourses(){
		return courses;
	}
	
	

}
