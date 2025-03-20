package Assessment; 
import java.util.Scanner; 
public class CourseManagementApp { 
	public static void main(String[] args) 
	{ Scanner scanner = new Scanner(System.in); 
	CourseManagmentSystem cms = new CourseManagmentSystem(); 
	System.out.print("Enter number of courses: "); 
	int n = scanner.nextInt(); 
	scanner.nextLine();
	for (int i = 0; i < n; i++) 
	{ 
		try {
		System.out.println("\nEnter course details:"); 
		System.out.print("Course ID: ");
		int courseId = scanner.nextInt(); 
		scanner.nextLine();
		System.out.print("Course Name: "); 
		String courseName = scanner.nextLine(); 
		System.out.print("Instructor Name: "); 
		String instructor = scanner.nextLine();
		System.out.print("Duration (weeks, must be > 0): "); 
		int durationWeeks = scanner.nextInt(); 
		if (durationWeeks <= 0) { 
			throw new IllegalArgumentException("Duration must be greater than 0."); 
			}
		System.out.print("Fee (must be > 0): "); 
			double fee = scanner.nextDouble(); 
			if (fee <= 0) { 
				throw new IllegalArgumentException("Fee must be greater than 0."); 
				} 
			scanner.nextLine();
	
				System.out.print("Type (Technical/Non-Technical): ");
				String type = scanner.nextLine(); 
				Course course; 
				if (type.equalsIgnoreCase("Technical")) 
				{ course = new TechnicalCourse(courseId, courseName, instructor, durationWeeks, fee); 
				} 
				else if (type.equalsIgnoreCase("Non-Technical")) 
				{ course = new NonTechnicalCourse(courseId, courseName, instructor, durationWeeks, fee); }
				else { 
					throw new IllegalArgumentException("Invalid course type."); 
					} 
				cms.addCourse(course);
				} 
		catch (IllegalArgumentException e) 
		{
			System.out.println("Error: " + e.getMessage());
		i--;
		scanner.nextLine(); 
		} 
		}
	System.out.println("\nCourses before sorting:");
	cms.displayCourses();
	cms.sortCoursesByFee(); 
	System.out.println("\nCourses after sorting by fee:"); 
	cms.displayCourses(); 
	cms.filterCoursesByDuration(); 
	} 
	}
	
