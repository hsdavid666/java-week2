package week2;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		int n;
		Scanner scan =new Scanner(System.in);
		n=scan.nextInt();
		scan.close();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");
			for(int w=1;w<=i;w++)
				System.out.print(" *");
			System.out.println("");
		}
	}

}
