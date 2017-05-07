package multiplePiggy;

import javax.swing.JOptionPane;

public class interPiggy {

	static double[] piggy1 = new double[10];
	static double[] piggy2 = new double[10];
	static double[] piggy3 = new double[10];
	static double[] piggy4 = new double[10];

	static double double_balance1;
	static double double_deposit1;
	static double double_lastTransaction1;
	static int int_counter1 = -1;

	static double double_balance2;
	static double double_deposit2;
	static double double_lastTransaction2;
	static int int_counter2 = -1;

	static double double_balance3;
	static double double_deposit3;
	static double double_lastTransaction3;
	static int int_counter3 = -1;

	static double double_balance4;
	static double double_deposit4;
	static double double_lastTransaction4;
	static int int_counter4 = -1;

	static int int_piggyBankNumber;
	static boolean bool_executionFlag = true;
	static int int_PB1;
	static int int_PB2;

	static boolean bool_dep = false;
	static boolean bool_with = false;
	static boolean bool_viewBalance = false;
	static boolean bool_statement = false;

	public static void main(String[] args) {

		/*
		 * Write a procedural program which simulates 4 piggy banks. The program
		 * must allow Inter-Piggy bank transfers. As program adopts procedural
		 * paradigm, limit your code within one package and one class with all
		 * the class members being static.
		 */

		while (bool_executionFlag) {

			UserAction();

			test();

		}
	}

	static void test() {
		
		switch (int_piggyBankNumber) {
		case 1:
			if (bool_dep) {
				double double_deposit = Double
						.parseDouble(JOptionPane.showInputDialog("Please enter the amount to be deposited."));

				if (double_deposit >= 0 && double_balance1 >= 0) {
					double_balance1 += double_deposit;
					double_lastTransaction1 = double_deposit;
					int_counter1++;
					if (int_counter1 >= 10) {
						for (int i = 0; i < piggy1.length - 1; i++) {
							piggy1[i] = piggy1[i + 1];
						}
						int_counter1--;
						piggy1[int_counter1] = double_lastTransaction1;
					} else
						piggy1[int_counter1] = double_lastTransaction1;
				}
			} else if (bool_with) {
				try {
					double double_withdrawalAmount = Double
							.parseDouble(JOptionPane.showInputDialog("Please enter the withdrawal amount."));

					if (double_withdrawalAmount <= double_balance1) {
						if (double_withdrawalAmount < 0) {
							JOptionPane.showMessageDialog(null, "Please enter an amount greater than 0");
						} else {
							double_balance1 -= double_withdrawalAmount;
							double_lastTransaction1 = -double_withdrawalAmount;
							int_counter1++;
							if (int_counter1 >= 10) {
								for (int i = 0; i < piggy1.length - 1; i++) {
									piggy1[i] = piggy1[i + 1];
								}
								int_counter1--;
								piggy1[int_counter1] = double_lastTransaction1;
							} else
								piggy1[int_counter1] = double_lastTransaction1;

						}
					} else {
						JOptionPane.showMessageDialog(null,
								"Please enter an amount lesser than your balance. \n Or \n Please view balance first.");
					}
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null,
							"Please enter an amount lesser than your balance. \n Or \n Please view balance first.");
				}
			} else if (bool_viewBalance) {
				JOptionPane.showMessageDialog(null, "Dear Sir, Your current balance is : " + double_balance1);
			} else if (bool_statement) {
				StringBuilder sb = new StringBuilder();
				sb.append("Please find the details of the last 10 transactions mentioned below \n ");
				for (int i = 0; i < piggy1.length; i++) {
					if (piggy1[i] != 0)
						sb.append("\nTransaction # " + (i + 1) + " : " + piggy1[i]);
				}
				JOptionPane.showMessageDialog(null, sb);
			}

			bool_dep = false;
			bool_with = false;
			bool_viewBalance = false;
			bool_statement = false;
			break;
		case 2:
			if (bool_dep) {
				double double_deposit = Double
						.parseDouble(JOptionPane.showInputDialog("Please enter the amount to be deposited."));

				if (double_deposit >= 0 && double_balance2 >= 0) {
					double_balance2 += double_deposit;
					double_lastTransaction2 = double_deposit;
					int_counter2++;
					if (int_counter2 >= 10) {
						for (int i = 0; i < piggy2.length - 1; i++) {
							piggy2[i] = piggy2[i + 1];
						}
						int_counter2--;
						piggy2[int_counter2] = double_lastTransaction2;
					} else
						piggy2[int_counter2] = double_lastTransaction2;
				}
			} else if (bool_with) {
				try {
					double double_withdrawalAmount = Double
							.parseDouble(JOptionPane.showInputDialog("Please enter the withdrawal amount."));

					if (double_withdrawalAmount <= double_balance2) {
						if (double_withdrawalAmount < 0) {
							JOptionPane.showMessageDialog(null, "Please enter an amount greater than 0");
						} else {
							double_balance2 -= double_withdrawalAmount;
							double_lastTransaction2 = -double_withdrawalAmount;
							int_counter2++;
							if (int_counter2 >= 10) {
								for (int i = 0; i < piggy2.length - 1; i++) {
									piggy2[i] = piggy2[i + 1];
								}
								int_counter2--;
								piggy2[int_counter2] = double_lastTransaction2;
							} else
								piggy1[int_counter2] = double_lastTransaction2;

						}
					} else {
						JOptionPane.showMessageDialog(null,
								"Please enter an amount lesser than your balance. \n Or \n Please view balance first.");
					}
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null,
							"Please enter an amount lesser than your balance. \n Or \n Please view balance first.");
				}
			} else if (bool_viewBalance) {
				JOptionPane.showMessageDialog(null, "Dear Sir, Your current balance is : " + double_balance2);
			} else if (bool_statement) {
				StringBuilder sb = new StringBuilder();
				sb.append("Please find the details of the last 10 transactions mentioned below \n ");
				for (int i = 0; i < piggy2.length; i++) {
					if (piggy2[i] != 0)
						sb.append("\nTransaction # " + (i + 1) + " : " + piggy2[i]);
				}
				JOptionPane.showMessageDialog(null, sb);
			}

			bool_dep = false;
			bool_with = false;
			bool_viewBalance = false;
			bool_statement = false;
			break;
		case 3:
			if (bool_dep) {
				double double_deposit = Double
						.parseDouble(JOptionPane.showInputDialog("Please enter the amount to be deposited."));

				if (double_deposit >= 0 && double_balance3 >= 0) {
					double_balance3 += double_deposit;
					double_lastTransaction3 = double_deposit;
					int_counter3++;
					if (int_counter3 >= 10) {
						for (int i = 0; i < piggy3.length - 1; i++) {
							piggy3[i] = piggy3[i + 1];
						}
						int_counter3--;
						piggy3[int_counter3] = double_lastTransaction3;
					} else
						piggy3[int_counter3] = double_lastTransaction3;
				}
			} else if (bool_with) {
				try {
					double double_withdrawalAmount = Double
							.parseDouble(JOptionPane.showInputDialog("Please enter the withdrawal amount."));

					if (double_withdrawalAmount <= double_balance3) {
						if (double_withdrawalAmount < 0) {
							JOptionPane.showMessageDialog(null, "Please enter an amount greater than 0");
						} else {
							double_balance3 -= double_withdrawalAmount;
							double_lastTransaction3 = -double_withdrawalAmount;
							int_counter3++;
							if (int_counter3 >= 10) {
								for (int i = 0; i < piggy3.length - 1; i++) {
									piggy3[i] = piggy3[i + 1];
								}
								int_counter3--;
								piggy3[int_counter3] = double_lastTransaction3;
							} else
								piggy3[int_counter3] = double_lastTransaction3;

						}
					} else {
						JOptionPane.showMessageDialog(null,
								"Please enter an amount lesser than your balance. \n Or \n Please view balance first.");
					}
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null,
							"Please enter an amount lesser than your balance. \n Or \n Please view balance first.");
				}
			} else if (bool_viewBalance) {
				JOptionPane.showMessageDialog(null, "Dear Sir, Your current balance is : " + double_balance3);
			} else if (bool_statement) {
				StringBuilder sb = new StringBuilder();
				sb.append("Please find the details of the last 10 transactions mentioned below \n ");
				for (int i = 0; i < piggy3.length; i++) {
					if (piggy3[i] != 0)
						sb.append("\nTransaction # " + (i + 1) + " : " + piggy3[i]);
				}
				JOptionPane.showMessageDialog(null, sb);
			}

			bool_dep = false;
			bool_with = false;
			bool_viewBalance = false;
			bool_statement = false;
			break;
		case 4:
			if (bool_dep) {
				double double_deposit = Double
						.parseDouble(JOptionPane.showInputDialog("Please enter the amount to be deposited."));

				if (double_deposit >= 0 && double_balance4 >= 0) {
					double_balance4 += double_deposit;
					double_lastTransaction4 = double_deposit;
					int_counter4++;
					if (int_counter4 >= 10) {
						for (int i = 0; i < piggy4.length - 1; i++) {
							piggy4[i] = piggy4[i + 1];
						}
						int_counter4--;
						piggy4[int_counter4] = double_lastTransaction4;
					} else
						piggy4[int_counter4] = double_lastTransaction4;
				}
			} else if (bool_with) {
				try {
					double double_withdrawalAmount = Double
							.parseDouble(JOptionPane.showInputDialog("Please enter the withdrawal amount."));

					if (double_withdrawalAmount <= double_balance3) {
						if (double_withdrawalAmount < 0) {
							JOptionPane.showMessageDialog(null, "Please enter an amount greater than 0");
						} else {
							double_balance4 -= double_withdrawalAmount;
							double_lastTransaction4 = -double_withdrawalAmount;
							int_counter4++;
							if (int_counter4 >= 10) {
								for (int i = 0; i < piggy4.length - 1; i++) {
									piggy4[i] = piggy4[i + 1];
								}
								int_counter4--;
								piggy4[int_counter4] = double_lastTransaction4;
							} else
								piggy4[int_counter4] = double_lastTransaction4;

						}
					} else {
						JOptionPane.showMessageDialog(null,
								"Please enter an amount lesser than your balance. \n Or \n Please view balance first.");
					}
				} catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(null,
							"Please enter an amount lesser than your balance. \n Or \n Please view balance first.");
				}
			} else if (bool_viewBalance) {
				JOptionPane.showMessageDialog(null, "Dear Sir, Your current balance is : " + double_balance4);
			} else if (bool_statement) {
				StringBuilder sb = new StringBuilder();
				sb.append("Please find the details of the last 10 transactions mentioned below \n ");
				for (int i = 0; i < piggy4.length; i++) {
					if (piggy4[i] != 0)
						sb.append("\nTransaction # " + (i + 1) + " : " + piggy4[i]);
				}
				JOptionPane.showMessageDialog(null, sb);
			}

			bool_dep = false;
			bool_with = false;
			bool_viewBalance = false;
			bool_statement = false;
			break;
		case 5:
			actionPiggyBankTransfer();
			break;
		default:
				bool_executionFlag = false;
			break;

		}
	}

	static void actionPiggyBankTransfer() {
		int_PB1 = Integer.parseInt(JOptionPane.showInputDialog(
				"Welcome to Piggy Bank: " + "\n\nEnter Bank 1.\n"));

		switch (int_PB1) {
		case 1:
			bool_dep = true;
			break;
		case 2:
			bool_with = true;
			break;
		case 3:
			bool_viewBalance = true;
			break;
		case 4:
			bool_statement = true;
			break;
		case 5:
			bool_executionFlag = false;
		default:
			break;
		}
		


	}

	static void UserAction() {
		int int_ActionNumber = Integer.parseInt(JOptionPane.showInputDialog(
				"Welcome to Piggy Bank: " + "\n\nPlease enter the section number :\n " + "1. Deposit cash \n "
						+ "2. Withdraw \n " + "3. View Balance \n " + "4. Statement \n " + "5. Quit"));
		switch (int_ActionNumber) {
		case 1:
			bool_dep = true;
			break;
		case 2:
			bool_with = true;
			break;
		case 3:
			bool_viewBalance = true;
			break;
		case 4:
			bool_statement = true;
			break;
		case 5:
			bool_executionFlag = false;
		default:
			break;
		}
		
		int_piggyBankNumber = Integer.parseInt(JOptionPane.showInputDialog(
				" Please enter your PiggyBank number :\n " + "1. Piggy Bank # 1 \n " + "2. Piggy Bank # 2 \n "
						+ "3. Piggy Bank # 3 \n " + "4. Piggy Bank # 4 \n " + "5. Inter-Piggy Bank Transfer"));
	}

}
