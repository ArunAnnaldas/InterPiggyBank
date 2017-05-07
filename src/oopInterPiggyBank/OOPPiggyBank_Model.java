package oopInterPiggyBank;

import static javax.swing.JOptionPane.*;

import javax.swing.JOptionPane;

public class OOPPiggyBank_Model {
	
	private int int_balance;
	private int int_lastTransaction;
	private static boolean flag = true;
	private static String str_customerName = "";
	private int[] arrTransaction = new int[10];
	private int int_counter = -1;
	
	
	boolean deposit(int int_depAmount)
	{
		if(int_depAmount > 0 && int_balance >= 0)
		{
			int_balance += int_depAmount; 
			int_lastTransaction = int_depAmount;
			int_counter++;
			tracker();
			return true;
		}
		else
		{
			showMessageDialog(null, "Please enter valid amount");
			return false;
		}
	}
	
	boolean withdraw(int int_withdraw)
	{
		if(int_withdraw > 0 && int_withdraw <= int_balance)
		{
			int_balance -= int_withdraw;
			int_lastTransaction = -int_withdraw;
			int_counter++;
			tracker();
			return true;
		}
		else
		{
			showMessageDialog(null, "Please enter valid amount");
			return false;
		}
	}
	
	void interPiggyTransfer(OOPPiggyBank_Model obj_pg2, boolean bool_dep,boolean bool_with, int int_amount)
	{
		if(bool_dep)
		{
			while(true)
			{
				if(obj_pg2.withdraw(int_amount))
				{
					this.deposit(int_amount);
					break;
				}	
			}
		}
		else if(bool_with)
		{
			while(true)
			{
				if(this.withdraw(int_amount))
				{
					obj_pg2.deposit(int_amount);
					break;
				}	
			}
		}
	}
	
	void tracker() {
		if (int_counter >= 10) {
			for (int i = 0; i < arrTransaction.length - 1; i++) {
				arrTransaction[i] = arrTransaction[i + 1];
			}
			int_counter--;
			arrTransaction[int_counter] = int_lastTransaction;
		} else
			arrTransaction[int_counter] = int_lastTransaction;
	}
	
	void Statement()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Please find the details of the last 10 transactions mentioned below \n ");
		for (int i = 0; i < arrTransaction.length; i++) {
			if (arrTransaction[i] != 0)
				sb.append("\nTransaction # " + (i + 1) + " : " + arrTransaction[i]);
		}
		JOptionPane.showMessageDialog(null, sb);
	}
	
	void viewBalance() {
		JOptionPane.showMessageDialog(null,
				"Dear " + str_customerName + "\n" + "Your current balance is : " + int_balance);
	}

	public static boolean isFlag() {
		return flag;
	}

	public static void setFlag(boolean flag) {
		OOPPiggyBank_Model.flag = flag;
	}

	public static String getStr_customerName() {
		return str_customerName;
	}

	public static void setStr_customerName(String str_customerName) {
		OOPPiggyBank_Model.str_customerName = str_customerName;
	}
	
	
}


