package oopInterPiggyBank;

import javax.swing.JOptionPane;

public class Utility {
	
	static String str_spclChars = "!@#$%^&*()_<>?,./;':\"/*-+[]{}";
	static boolean flag_name = false;
	
	static boolean dataValidation(String content) {
		if (content != null && !content.equalsIgnoreCase("")) {
			for (int i = 0; i < content.length(); i++) {
				if (str_spclChars.indexOf(content.charAt(i)) != -1) {
					JOptionPane.showMessageDialog(null,
							"Please enter only your first name. No Special characters are allowed");
					return false;
				}
			}
			flag_name = true;
			return true;
		} else {
			JOptionPane.showMessageDialog(null, "Please enter your first name.");
			return false;
		}
	}

}
