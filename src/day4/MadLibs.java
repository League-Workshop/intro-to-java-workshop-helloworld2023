package day4;

import javax.swing.JOptionPane;

public class MadLibs {
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Get ready to play some Mad Libs!");
		String name = JOptionPane.showInputDialog("Give me a boy's name.");
		String adjective = JOptionPane.showInputDialog("Give me an adjective.");
		String number = JOptionPane.showInputDialog("Give me a number.");
		String sport = JOptionPane.showInputDialog("Name a sport.");
		String city = JOptionPane.showInputDialog("Name a city.");
		String animal = JOptionPane.showInputDialog("Name an animal, but make it plural.");
		String condition = JOptionPane.showInputDialog("Name a condition. Examples: Good,Great,Bad,Terrible");
		JOptionPane.showMessageDialog(null, name + ": " + name + " is very " + 
		adjective + ". \n He is number " + number + " and plays " + sport + 
		" for the " + city + " " + animal + ". \n He is a really " + condition + " player."  );
	}

}
