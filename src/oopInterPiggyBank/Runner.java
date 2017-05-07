package oopInterPiggyBank;

public class Runner {

	public static void main(String[] args) {

		OOPPiggyBank_Model pg1 = new OOPPiggyBank_Model();
		OOPPiggyBank_Model pg2 = new OOPPiggyBank_Model();
		OOPPiggyBank_Model pg3 = new OOPPiggyBank_Model();
		OOPPiggyBank_Model pg4 = new OOPPiggyBank_Model();

		Controller c1 = new Controller();
		c1.execute(pg1,pg2,pg3,pg4);
	}
}
