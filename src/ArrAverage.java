/**
 * 
 * @author Joshua Gonsalves
 * Array Average and Sort Class
 *
 */
public class ArrAverage {

	public static void main(String[] args) 
	{
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++)
		arr[i] = (int)(Math.random()*20) + 1;
		int sum = 0;
		int index = 0;
		int leastGreat;
		
		for (int num : arr) 
		{
			sum = sum + arr[index];
			index++;
		}
		
		double ave = (double)sum/arr.length;
		System.out.print("The elements in the array are: { ");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("}");
		System.out.println("The sum of these elements is " + sum + ".");
		System.out.println("The average of these elements is " + ave + ".");
		

	}
}
	

