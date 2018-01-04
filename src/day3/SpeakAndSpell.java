package day3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
speak("spell mandlebrot");
		// 2. Catch the user's answer in a String
String sentence = JOptionPane.showInputDialog("Spell mandlebrot"));
		// 3. If the user spelled the word correctly, speak "correct"
if( sentence.equals(mandlebrot));{
	System.out.println("correct");
}
		// 4. Otherwise say "wrong"
else {
	System.out.println("wrong");
}
		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		Voice voice = VoiceManager.getInstance().getVoice("kevin16");
		voice.allocate();
		voice.speak(words);
		voice.deallocate();
	}

}


