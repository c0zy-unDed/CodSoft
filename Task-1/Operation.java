import java.util.*;
public class Operation {
	Scanner input = new Scanner(System.in);
	int randomGenerator() {
		Random randomNumber = new Random();
		return randomNumber.nextInt(100);
	}
	void randGuesser(int random) {
		while(true) {
			System.out.println("Enter your guess: ");
			int playerGuess = input.nextInt();
			if(playerGuess > 100) {
				System.out.println("Enter a number between 0 to 100!");
			}
			else {
				if(playerGuess == random) {
					System.out.println("Your guess is correct");
					break;
				}		
				else if(random < playerGuess) {
					System.out.println("Guess lower");
				}
				else {
					System.out.println("Guess higher");
				}
			}
		}
	}
}
