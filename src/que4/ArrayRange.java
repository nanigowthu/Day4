package que4;
import java.util.Scanner;
public class ArrayRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,range;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The No.Of.Elements");
		n = sc.nextInt();
		
		int arr [] = new int [n];
		for (i=0;i<n;i++) {
			arr [i] = sc.nextInt();
		}
		int min = arr[0];
		int max = arr[0];
		
		for (i=0;i<n;i++) {
			
			if (arr[i]>max) {
				max=arr[i];
			}
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		range = max-min;
		System.out.printf("The Range Of Array is "+range);
	}

}
