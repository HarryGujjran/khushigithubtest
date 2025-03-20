package JavaBasics;

public class ConditionalExercise {

	public static void main(String[] args) {
		double r =1.5;//rating
		double salary= 5000;
		if (r>=2&&r<3.5)
		{
			salary= salary+(0.05*salary);
		}
		else if (r>=3.5&&r<4.5)
		{
			salary= salary+(0.08*salary);
		}
		else if (r>=4.5&&r<=5)
		{
			salary= salary+(0.1*salary);
		}
		else if (r>=1&&r<2)
		{
		}
		else {
			System.out.println("invalid rating");
		}
		System.out.println(salary);
	}
}
