import java.util.*;
public class Main {

	public static void main(String[] args) {
		Operation calculate = new Operation();
		try (Scanner input = new Scanner(System.in)) {
			int random = calculate.randomGenerator();
			calculate.randGuesser(random);
			
		}
		catch (InputMismatchException e) {
		    System.out.println("Invalid input. Please enter a valid integer.");
		}
	
}
}
