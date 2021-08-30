package que2;
import java.util.Scanner;
public class MaxElementInEachColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rows,cols;
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		cols = sc.nextInt();
		n=sc.nextInt();
		int a[][]=new int [n][n];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}int max=0;
		for(int i=0;i<rows;i++)
		{

			int j=0;


				if(max<a[i][j])
				{
					max=a[i][j];
				}

		}System.out.println("the largest  no in column1 is:"+max);
		int max1 =0;
		for(int i=0;i<rows;i++)
		{
			int j=1;
			if(max1<a[i][j])
			{
				max1=a[i][j];
			}
		}System.out.println("the largest  no in column2  is:"+max1);
	}

}
