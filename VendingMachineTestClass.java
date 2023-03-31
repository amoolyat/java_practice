public class VendingMachineTestClass {
	
	public static void main(String[] args) {
		
		VendingMachine vendingMachine1 = new VendingMachine();
		vendingMachine1.setAmountDeposited();
		vendingMachine1.selection();
		
		VendingMachine vendingMachine2 = new VendingMachine();
		vendingMachine2.setAmountDeposited(1,2,3,4,5,6);
		vendingMachine2.selection(1);
		vendingMachine2.selection(1);
		vendingMachine2.selection(2);
		vendingMachine2.selection(5);
		vendingMachine2.checkout();
		
		VendingMachine vendingMachine3 = new VendingMachine();
		vendingMachine3.setAmountDeposited(0,0,0,1,5,6);
		vendingMachine2.selection(1);
		vendingMachine2.selection(1);
		vendingMachine2.selection(2);
		vendingMachine2.selection(0);
		
		VendingMachine vendingMachine4 = new VendingMachine();
		vendingMachine3.setAmountDeposited(3,4,3,2,2,0);
		vendingMachine2.selection(5);
		vendingMachine2.selection(5);
		vendingMachine2.selection(0);

	}
}

