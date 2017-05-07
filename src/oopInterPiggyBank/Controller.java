package oopInterPiggyBank;

import static javax.swing.JOptionPane.showInputDialog;

import javax.swing.JOptionPane;

public class Controller {

	static String str_PiggyNumber;
	static int int_piggyBankNumber;

	static String str_UserInput;
	static int int_UserInput;

	void execute() {

		OOPPiggyBank_Model pg1 = new OOPPiggyBank_Model();
		OOPPiggyBank_Model pg2 = new OOPPiggyBank_Model();
		OOPPiggyBank_Model pg3 = new OOPPiggyBank_Model();
		OOPPiggyBank_Model pg4 = new OOPPiggyBank_Model();

		while (OOPPiggyBank_Model.isFlag()) {
			OOPPiggyBank_Model.setStr_customerName(showInputDialog("Please enter your first name"));
			Utility.dataValidation(OOPPiggyBank_Model.getStr_customerName());

			while (Utility.flag_name && OOPPiggyBank_Model.isFlag()) {

				int_piggyBankNumber = 0;

				try {
					str_PiggyNumber = JOptionPane
							.showInputDialog("Welcome to Piggy Bank: " + OOPPiggyBank_Model.getStr_customerName() + " "
									+ "\n\nPlease enter the Piggy Bank number :\n " + "1. Piggy Bank # 1 \n "
									+ "2. Piggy Bank # 2 \n " + "3. Piggy Bank # 3 \n " + "4. Piggy Bank # 4 \n "
									+ "5. Inter Piggy Bank Transfer");

					if (str_PiggyNumber == null)
						int_piggyBankNumber = 5;
					else
						int_piggyBankNumber = Integer.parseInt(str_PiggyNumber);
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null, "It seems you have not entered a valid number.");
				}

				switch (int_piggyBankNumber) {
				case 1:
					performAction(pg1);
					break;
				case 2:
					performAction(pg2);
					break;
				case 3:
					performAction(pg3);
					break;
				case 4:
					performAction(pg4);
					break;
				case 5:
					interPiggyTransfer();
					break;
				default:
					JOptionPane.showMessageDialog(null, "Please enter a valid Number");
					break;
				}
			}
		}
	}

	void performAction(OOPPiggyBank_Model pg) {

		try {
			str_UserInput = JOptionPane
					.showInputDialog("Welcome to Piggy Bank: " + OOPPiggyBank_Model.getStr_customerName() + " "
							+ "\n\nPlease enter the section number :\n " + "1. Deposit cash \n " + "2. Withdraw \n "
							+ "3. View Balance \n " + "4. Statement \n " + "5. Quit");
			if (str_UserInput == null)
				int_UserInput = 5;
			else
				int_UserInput = Integer.parseInt(str_UserInput);
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "It seems you have not entered a valid number.");
		}

		switch (int_UserInput) {
		case 1:
			int int_dep = 0;
			int int_ErrorCounter = 0;
			while (int_ErrorCounter < 3) {
				try {
					int_dep = Integer.parseInt(showInputDialog("Please enter the amount to be deposited."));
					pg.deposit(int_dep);
					break;
				} catch (Exception e) {
					int_ErrorCounter++;
					if (int_ErrorCounter >= 3)
						JOptionPane.showMessageDialog(null, "You have exceeded maximum error input. Please try again.");
					else
						JOptionPane.showMessageDialog(null,
								"You have maximum " + (3 - int_ErrorCounter) + " attempts left.");
				}
			}
			break;
		case 2:
			int int_with = 0;

			try {
				int_with = Integer.parseInt(JOptionPane.showInputDialog("Please enter the withdrawal amount."));

				pg.withdraw(int_with);
				break;

			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null,
						"Please enter an amount lesser than your balance. \n Or \n Please view balance first.");
			}
			break;
		case 3:
			pg.viewBalance();
			break;
		case 4:
			pg.Statement();
			break;
		case 5:
			OOPPiggyBank_Model.setFlag(false);
			JOptionPane.showMessageDialog(null,
					"Thank You for using PiggyBank " + OOPPiggyBank_Model.getStr_customerName());
			break;
		default:
			JOptionPane.showMessageDialog(null, "Please enter a valid Number");
			break;
		}

	}

	void interPiggyTransfer() {

	}

}