package que3;
import java.util.Scanner;
public class DiagonalMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag =1 ;
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		
		int a[][] = new int [n][n];
		
		for (int i =0;i<n; i++) {
			for (int j=0;j<n;j++) {
				a[i][j] =Sc.nextInt();
				
				}
			}
		for (int i=0; i<n;i++) {
			for(int j=0;j<n;j++) {
				if (i!=j) {
					if (a[i][j]==0) {
						flag =0 ;
					}
					else {
						break;
					}
				}
			}
		}
		if (flag ==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
