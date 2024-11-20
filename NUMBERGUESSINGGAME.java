package oasis;

import java.util.Random;
import java.util.Scanner;

public class NUMBERGUESSINGGAME {
	private static int maxNum = 100;
	private static int maxAttempts = 10;

	public static void main(String[] args) {

		System.out.println("******* WELCOME TO TENNYSON NUMBER GUESS GAME *******");

		System.out.println();
		System.out.println("ALL THE BEST");
		System.out.println();
		int totalScore = 0;

		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int round = 4;
		System.out.println(" Total Rounds are : " + round);
		System.out.println("Maximum Attempts for each round is: " + maxAttempts);
		for (int i = 1; i <= round; i++) {
			int r1 = r.nextInt(maxNum);

			int attempt = 0;
			while (attempt < maxAttempts) {

				System.out.println("Please Enter the Guess Number :");
				int a = sc.nextInt();
				attempt++;// 1 2

				if (r1 == a) {
					// 10-1=9
					int score = maxAttempts - attempt;
					totalScore = totalScore + score;
					System.out.println("!! Congrats !! -You Found it ^ You score is :" + score);
					break;
				}

				else if (a < r1) {
					System.out.println("The Number should be greated than " + a + " Your Attempts left are : "
							+ (maxAttempts - attempt));
				}

				else {
					System.out.println("The Number should be lesser than " + a + " Your Attempts left are : "
							+ (maxAttempts - attempt));
				}

			}

			if (attempt == maxAttempts) {

				System.out.println("******* Attempts are Over *******");
				System.out.println("The Guess Number is :" + r1);
			}
		}
		System.out.println("********* Game Over ***********");

		System.out.println("Your Total score is : " + totalScore);

	}

}
