package Practice_Questions;
import java.util.Scanner;

public class Que_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {100,200,300,400,500};
		
		System.out.println("Enter the index: ");
		int x = sc.nextInt();
		
		if(x>=0 && x<arr.length) {
			System.out.println("The value at index "+x+" is "+arr[x-1]);
		}
		else
		{
			System.err.println("The index is not within range.");
		}
		sc.close();
		
	}

}
