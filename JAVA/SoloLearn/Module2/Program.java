package JAVA.SoloLearn.Module2;

import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
   int remaining = amount ;
		//your code goes here
		for(int i=0 ; i<3 ; i++){
            int payment= ((amount*10)/100);
            remaining = amount - payment ;

            //System.out.println(payment);
            
            amount = remaining ;
		}
            System.out.println(remaining);
	}
}