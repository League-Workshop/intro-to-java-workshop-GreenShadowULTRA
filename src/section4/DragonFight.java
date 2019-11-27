package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/Woah.png");		
		
		JOptionPane.showMessageDialog(null, "Defeat the star to take it", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		Random dmg = new Random (); 
		 
		int pHealth = 150; 
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragHealth = 305;
		// 4. Create a variable to hold the damage the player's attack does each round
		int pAtk = 10; 
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragAtk = 50; 
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(pHealth>0 && dragHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String Attack = JOptionPane.showInputDialog("Use the Dark Sword or the Shiny Dagger");
		// 9. If they typed in "yell":
	 
		if(Attack.equalsIgnoreCase("Dark Sword")) {
			int rand1= dmg.nextInt(111);
			dragHealth -= rand1; 
		}
			//-- Find a randm number between 0 and 10 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		if(Attack.equalsIgnoreCase("Shiny Dagger")) {
			int rand2= dmg.nextInt(91);
			dragHealth -= rand2; 
			
		}
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		int dragDmg= dmg.nextInt(61);
		pHealth -= dragDmg;
		
		// 12. Subtract this number from the player's health
		
		
		
		// 13. If the user's health is less than or equal to 0
		if(pHealth <= 0) {
			JOptionPane.showMessageDialog(null,"RIP the human");
			System.exit(0);
		}
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		if(dragHealth <= 0) {
			JOptionPane.showMessageDialog(null,"Star Defeated. It vaporized so you loose anyways ");
			JOptionPane.showMessageDialog(null,"You aren't susposed to beat it you must be a hacker");
			JOptionPane.showInputDialog("Enter your Dev Code");
			JOptionPane.showMessageDialog(null,"ERROR 707 CODE NOT FOUND");
			System.exit(0);
		}
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
		else {
			JOptionPane.showMessageDialog(null,"Star health "  +dragHealth);
			JOptionPane.showMessageDialog(null,"Player health "  +pHealth);
		
			
		}
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		}
		}
	}

