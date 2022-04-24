package rockPaperScissors;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] srgs) {
		System.out.println("0	-	Scissors");
		System.out.println("1	-	Rock");
		System.out.println("2	-	Paper");
		
		Scanner input = new Scanner(System.in);
		
		int randomInt = (int) Math.random() * 2;
		System.out.println("Choose a number between 0 and 2:");
		int userNum = input.nextInt();
		
		if ((userNum == 0) && (randomInt == 0)) 
		{
			System.out.println("This is a draw!");
		}
		
		if ((userNum == 0) && (randomInt == 1))
		{
			System.out.println("You lose!");
		}
		
		if ((userNum == 0) && (randomInt == 2))
		{
			System.out.println("You win!");
		}
		
		if ((userNum == 1) && (randomInt == 0))
		{
			System.out.println("You win!");
		}
		
		if ((userNum == 1) && (randomInt == 1))
		{
			System.out.println("This is a draw!");
		}
		
		if ((userNum == 1) && (randomInt == 2))
		{
			System.out.println("You lose!");
		}
		
		if ((userNum == 2) && (randomInt == 0))
		{
			System.out.println("You lose!");
		}
		
		if ((userNum == 2) && (randomInt == 1))
		{
			System.out.println("You win!");
		}
		
		if ((userNum == 2) && (randomInt == 2))
		{
			System.out.println("This is a draw!");
		}
		
		input.close();
	}
}