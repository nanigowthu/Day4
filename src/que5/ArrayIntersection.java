package que5;
import java.util.Scanner;
public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size ;
		Scanner sc=new Scanner(System.in);
		size =sc.nextInt();
		int a[]=new int[20];
		for(int i=0;i<size;i++)
		{
			a[i]= sc.nextInt();
		}
		int pos =sc.nextInt();
		int ele = sc.nextInt();
		for( int i=a.length-1;i>pos-1;i--)
		{

			a[i]=a[i-1];
		}
		a[pos-1]=ele;
		for(int i=0;i<size;i++)
		{
			a[i]=a[i];
			System.out.println(a[i]);	
			}
	}

}
