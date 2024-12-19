package Practice_Questions;
import java.util.Scanner;

public class Que_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The sum of first and last element is: "+(arr[0]+arr[size-1]));
		sc.close();
	}
}
