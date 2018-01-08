package day4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		JOptionPane.showMessageDialog(null, "This is the Coraline movie quiz! \n Each question is worth 10 points, and you can earn up to a total of 60 points. \n "
				+ " (Make sure the first letter is capitalized for each of your answers)");
		// 2.  Ask the user a question 
		String company = JOptionPane.showInputDialog("Which animation company created the movie Coraline?");
		// 3.  Use an if statement to check if their answer is correct
		if (company.equals("Laika")){
		// 4.  if the user's answer is correct
		// -- add one to their score 
			score = score +10;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String when = JOptionPane.showInputDialog("What year did Coraline come out?");
		if (when.equals("2009")){
			score = score +10;
		}
		String where = JOptionPane.showInputDialog("Where is Coraline from?");
		if (where.equals("Michigan")){
			score = score +10;
		}
		String buttons = JOptionPane.showInputDialog("What do people in the other world have for eyes?");
		if (buttons.equals("Buttons")){
			score = score + 10;
		}
		String ghosts = JOptionPane.showInputDialog("How many ghost children were there before Coraline came? \n (Just put the number in. You don't have to type out the word)");
		if (ghosts.equals("3")){
			score = score +10;
		}
		String favorite = JOptionPane.showInputDialog("Is Coraline Ava's favorite movie?");
		if (favorite.equals("Yes")){ 
			score = score + 10;
		}
		System.out.println(score);
	}
}
