package noRepeats;

//import packages
import java.util.ArrayList;
import java.util.Scanner;

public class LetterRepeatsDelete {

	public static void main(String[] args) {
		// Display to the user instructions to add a sentence.
		System.out.println("Please enter a sentence/word that you want to remove all the duplication characters:");

		// Use the scanner function to capture the input of the user.
		Scanner inputWordKeyboard = new Scanner(System.in);
		String startSentence = inputWordKeyboard.nextLine();
		// Close the scanner function.
		inputWordKeyboard.close();

		/*
		 * Call on the method called noRepeat to convert the sentence that the user have
		 * entered.
		 */
		String noDoubles = noRepeat(startSentence);

		// Print the original sentence that the user have entered.
		System.out.println("\nOriginal sentence:\n" + startSentence);
		// Print the new message after the method is called on it.
		System.out.println("\nNew sentence: \n" + noDoubles);
	}

	// This method is used to remove all the duplicate characters in a String.
	public static String noRepeat(String sentence) {
		// Declare the array called newSentence for the characters to be stored in.
		ArrayList<String> newSentence = new ArrayList<String>();

		/*
		 * Use a for loop to run the amount of times equal to the length of the
		 * characters in the word or sentence.
		 */
		for (int i = 0; i < sentence.length(); i++) {
			// Get the character at each position.
			// Convert the character to a String.
			String letter = Character.toString(sentence.charAt(i));

			/*
			 * If the upper case or lower case of a letter is not yet in the new array, add
			 * the character to the array.
			 */
			if (!(newSentence.contains(letter.toLowerCase()) || newSentence.contains(letter.toUpperCase()))) {
				newSentence.add(letter);
			} /*
				 * If the character is a space, then it should always be added even if has been
				 * used before.
				 */
			else if (letter.equals(" ")) {
				newSentence.add(letter);
			}
		}
		// Convert the new array sentence back to a string by joining all the elements.
		String stringSentence = String.join("", newSentence);
		// Return the new String that has no duplications.
		return stringSentence;
	}
}