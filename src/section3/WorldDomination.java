package section3;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String a = JOptionPane.showInputDialog("Do you know what my least favorite color is?");
		// 2. If they say "yes", tell them they will rule the world.
	
if(a.equalsIgnoreCase("Orange")) {
	
	JOptionPane.showMessageDialog(null, "ORANGE IS THE WORST COLOR OF ALL TIME (in my opinion)");
}
		// 3. Otherwise, wish them good luck washing dishes.
else { 
	JOptionPane.showMessageDialog(null,"ay I like dat color");



}
}
}