package que1;
import java.util.Scanner;
public class MaxElementInTheMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ,max=0,rows,cols; 

		Scanner sc=new Scanner(System.in);
	      n=sc.nextInt();
		System.out.println(" enter no. of rows");
		rows=sc.nextInt();
		System.out.println("enter no.of cols");
		cols=sc.nextInt();
		int []a[]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
				{
				 if (max<a[i][j])
				 {
					 max=a[i][j];
				 }
				}


		}System.out.println("the maximum  element in matrix is:"+max);

	}

}
