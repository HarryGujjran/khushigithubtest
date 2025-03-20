package JavaBasics;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {{1,2,3},{3,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.print("\n");
		}
		System.out.println("enhanced for loop");
		for(int[] row:arr) {
			for(int num:row) {
				System.out.print(num);
			}
			System.out.println();
	}
		//Assignment
		
		
	}
	

}
