package Practice_Questions;

import java.util.Scanner;

public class Que_8 {

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
		
		int sum = 0;

		for(int i=0; i<size; i++)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("Sum: "+sum);
		
		sc.close();
	}

}
