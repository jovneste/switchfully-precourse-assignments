package JAVA.SoloLearn.Module3;

import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here
		for(int i = arr.length-1; i>-1;i--){
			System.out.print(arr[i]);
		}
	}
}
