package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("choose a positive integer greater than 2");
		int n = in.nextInt();
		
		boolean[] primeset = new boolean[n+1];
		
		for (int i=2; i<=n; i++)
		{
			primeset[i]= true;
		}
		
		for (int i=2; i<=n; i++)
		{
			if (primeset[i]==true)
			{
				for (int j=i*i;j<=n;j=j+i)
				{	
				primeset[j]=false;
				}
			}	
		}

		for (int i=0; i<=n; i++)
		{
			if (primeset[i]==true)
			{
				System.out.println(i);
			}
				
		}
	}

}
