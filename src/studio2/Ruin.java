package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Start amount?");
		double startAmount= in.nextDouble() ;
		
		System.out.println ("Win chance (between 0 and 1)?");
		double winChance = in.nextDouble();
		
		System.out.println ("Win limit?");
		double winLimit = in.nextDouble() ;
		
		System.out.println ("Total simulations?");
		double totalSimulations = in.nextDouble();
		
		for (int i=0; i<=totalSimulations; i++)
		{
		
		while (startAmount>0 && startAmount<winLimit)
		{
			
			if (Math.random()<winChance)
			{
				startAmount++;
				System.out.println("success: " + startAmount);
			}
			else
			{
				startAmount--;
				System.out.println("ruin: " + startAmount);
			}
		}
		System.out.println("Day: " + i);
		}
		
	}

}
