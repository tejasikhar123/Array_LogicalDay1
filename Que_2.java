package Practice_Questions;

import java.util.Scanner;

public class Que_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements:");
		for(int i = 0;i<size;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.print("Array elements are: ");
		for(int i=0;i<size;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
