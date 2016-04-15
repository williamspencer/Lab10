package appPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import moviePackage.Movie;
import moviePackage.MovieIO;
import validatorPackage.Validator;

public class movieApp {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		ArrayList<Movie> myList = new ArrayList<>();
		ArrayList<String> alpha = new ArrayList<>();
		String[] alphaArray = null;
		String userInput = "";
		int x = 0;

		for (int i = 0; i < 100; i++) {
			myList.add(MovieIO.getMovie(i + 1));
		}

		System.out.println("Welcome to the Movie List Application!\n");
		System.out.println("There are " + myList.size() + " movies in this list.\n");

		do {
			alpha = new ArrayList<>();
			System.out.println("1.Drama\n2.Musical\n3.Animated");
			System.out.println("4.Scifi\n5.Horror\n6.Comedy");
			System.out.print("What category are you interested in? (enter # 1-6): ");
			
			x = Validator.getValidInt(1, 6);
			userInput = numToCat(x);

			for (int i = 0; i < myList.size(); i++) {
				if (myList.get(i).getCategory().equalsIgnoreCase(userInput))
					alpha.add(myList.get(i).getTitle());
			}
			alphaArray = new String[alpha.size()];
			alpha.toArray(alphaArray);
			Arrays.sort(alphaArray);

			for (int i = 0; i < alphaArray.length; i++) {
				System.out.println(alphaArray[i]);
			}

			System.out.print("Continue? (y/n): ");
			userInput = Validator.readYorN("y", "n");

		} while (userInput.equalsIgnoreCase("y"));
		System.out.println("Goodbye!");
		scan1.close();
	}

	public static String numToCat(int x) {
		String userInput = "";
		switch (x) {
		case 1:
			userInput = "drama";
			break;
		case 2:
			userInput = "musical";
			break;
		case 3:
			userInput = "animated";
			break;
		case 4:
			userInput = "scifi";
			break;
		case 5:
			userInput = "horror";
			break;
		case 6:
			userInput = "comedy";
			break;
		}
		return userInput;
	}
}
