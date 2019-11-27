package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
	int score = 0; 
		// 2.  Ask the user a question 
	String a = JOptionPane.showInputDialog("What is 5+5?");
		// 3.  Use an if statement to check if their answer is correct
	if(a.equalsIgnoreCase("10")) {
		score += 1; 
		JOptionPane.showMessageDialog(null,"CORRECT your score is "+score);
	}
		// 4.  if the user's answer was correct, add one to their score 

		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
	else {
		JOptionPane.showMessageDialog(null,"WRONG");
		
	}
		// 6.  After all the questions have been asked, print the user's score 
	String b = JOptionPane.showInputDialog("What is the one essiential for all living beings?");
	// 3.  Use an if statement to check if their answer is correct
if(b.equalsIgnoreCase("Water")) {
	score += 1; 
	JOptionPane.showMessageDialog(null,"CORRECT your score is "+score);
}
	// 4.  if the user's answer was correct, add one to their score 
if(b.equalsIgnoreCase("Food")) {
	score += 1; 
	JOptionPane.showMessageDialog(null,"Umm there is one more important one so your score is "+score);
}
	// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
else {
	JOptionPane.showMessageDialog(null,"WRONG");
	
}
	}
	
}
