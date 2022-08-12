

// sets days into seconds

package JAVA.SoloLearn.Module1;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int days = scanner.nextInt();
		scanner.close();
		//your code goes here
		int seconds = days *24*60*60;
		System.out.println(seconds);
	}
}