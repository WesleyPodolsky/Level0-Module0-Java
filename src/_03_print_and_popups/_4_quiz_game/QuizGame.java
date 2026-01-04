package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String input = JOptionPane.showInputDialog("What is the largest planet in our solar system"); 
				// 3.  Use an if statement to check if their answer is correct
		if(input.equals("jupiter")) {
			score += 1;
			JOptionPane.showMessageDialog(null,"Correct! Your current score is:  "+score);
		}
		
		String input2 = JOptionPane.showInputDialog("What is 6 * 4"); 
		
		if(input2.equals("24")) {
			score += 1;
			JOptionPane.showMessageDialog(null,"Correct! Your current score is:  "+score);
		}
		
		String input3 = JOptionPane.showInputDialog("How many e's are in the word 'hello'? "); 
		
		if(input3.equals("1")) {
			score += 1;
			JOptionPane.showMessageDialog(null,"Correct!");
		}
		
		JOptionPane.showMessageDialog(null,"You have a final score of: " + score);
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
