package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	System.out.println("Hello SIRE");
	String name = JOptionPane.showInputDialog("Your Name plz sire");
	JOptionPane.showMessageDialog(null,"HELLO "+name);
}
}
