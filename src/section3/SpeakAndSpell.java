package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak("Spell Mettaton"); 
		// 2. Catch the user's answer in a String
		String a = JOptionPane.showInputDialog("Spell What It said :D");
		// 3. If the user spelled the word correctly, speak "correct"
		if(a.equalsIgnoreCase("Mettatonnnnnnnnnnnnnnnnnnnnnnn")) {
		speak("Great job SIRE"); 
		}
		// 4. Otherwise say "wrong"
		else { 
			speak("You are wrong, hahahhahahaahhaahahhahahaahahahahhaaaaa");
		}
		// 5. repeat the process for other words
	
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


