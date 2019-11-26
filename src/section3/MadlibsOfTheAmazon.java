package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested \n river, here's how to do it...");
		
		// Get the user to enter an adjective
		String name = JOptionPane.showInputDialog("ENTER AN ADJECTIVE NOW");
		// Get the user to enter a type of liquid
		String a = JOptionPane.showInputDialog("QUICK WHATS YOUR FAVORITE dRINK");
		// Get the user to enter a body part
		String b = JOptionPane.showInputDialog("NOW ENTER A BODy pART");
		// Get the user to enter a verb
		String c= JOptionPane.showInputDialog("Watermelon, enter a verb plz");
		// Get the user to enter a place
		String rude = JOptionPane.showInputDialog("GIB ME YOUR ADRESS");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		 JOptionPane.showMessageDialog(null, "Piranhas are more +name during the day, so cross the river at\n");  
				 JOptionPane.showMessageDialog(null,"Piranhas are attracted to fresh" +a);
		 		
				 JOptionPane.showMessageDialog(null,"likely take a bite out of your" +b);
						 JOptionPane.showMessageDialog(null,"you do, if you have an open wound, try to find another way to get\n" +c); 
		 						back to the +rude good luck (not)");

	}
}

