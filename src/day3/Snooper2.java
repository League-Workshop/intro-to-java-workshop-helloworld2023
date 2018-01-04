package day3;

import javax.swing.JOptionPane;

public class Snooper2 {
public static void main(String[] args) {
String name = JOptionPane.showInputDialog("What is your name?");
JOptionPane.showMessageDialog(null, "Hi "+ name);
String address = JOptionPane.showInputDialog("Where do you live?");
String birthday = JOptionPane.showInputDialog("When is your birthday?");
String birthplace = JOptionPane.showInputDialog("Where were you born?");
String favoritecolor = JOptionPane.showInputDialog("What is your favorite color?");
String socialsecurity = JOptionPane.showInputDialog("Can you give me your social security number?");
JOptionPane.showMessageDialog(null, "Hi I know all of the following information about you:" + name + "," +address + "," + birthday + "," + birthplace + "," + favoritecolor + "," + socialsecurity);
JOptionPane.showMessageDialog(null, "Don't give personal information to strangers!");
}
}
