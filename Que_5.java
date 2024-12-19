package Practice_Questions;
import java.util.Scanner;

public class Que_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		if(size%2==0)
		{
			System.out.println("The middle elements of array are: ");
			System.out.print(arr[(size/2)-1]+","+arr[size/2]);
		}
		else
		{
			System.out.println("The middle element of array is: ");
			System.out.print(arr[size/2]);
		}
		sc.close();
	}
}
