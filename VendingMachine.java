
import java.util.Scanner;

public class VendingMachine {
	
	Scanner in = new Scanner(System.in);
		
	private int amountDeposited = 0; 
	private int cart = 0;
	private int amountRemaining = 0;
	//private boolean purchaseAgain;
	
	final int briskIcedTea = 150;
	final int fruitSnacks = 200;
	final int sourPatch = 100;
	final int water = 10;
	final int gum = 70;
	
	private int numBriskIcedTea;
	private int numFruitSnacks;
	private int numSourPatch;
	private int numWater;
	private int numGum;
	
	/***************************************************************************************/
	
	private int getAmountDeposited() {
		
		return amountDeposited;
		
	}
	
	/***************************************************************************************/

	
	public void setAmountDeposited() {
		
		int fiveDollarBills;
		int oneDollarBills;
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		double display;
		
		do {
			System.out.println("Please enter the number of $5 bills you would like to deposit");
			fiveDollarBills = in.nextInt();
			if(fiveDollarBills > 0) {
				this.amountDeposited = amountDeposited + (fiveDollarBills * 500);
			}
			
	    } while (fiveDollarBills != 0);
	    	
		
	    do {
	    	System.out.println("Please enter the number of $1 bills you would like to deposit");
	    	oneDollarBills = in.nextInt();
	    	if(oneDollarBills > 0) {
	    		this.amountDeposited = amountDeposited + (oneDollarBills * 100);
	    	}
	    	
	    } while (oneDollarBills != 0);
	    	
	    	
	    do {
	    	System.out.println("Please enter the number of quarters you would like to deposit");
	    	quarters = in.nextInt();
	    	if(quarters > 0) {
	    		this.amountDeposited = amountDeposited + (quarters * 25);
	    	}
	    	
	    } while (quarters != 0);
	    	
	    	
	    do {
		    System.out.println("Please enter the number of dimes you would like to deposit");
		    dimes = in.nextInt();
		    if(dimes > 0) {
		    	this.amountDeposited = amountDeposited + (dimes * 10);
		    }
		    
		} while (dimes != 0);
	    
	    do {
	    	System.out.println("Please enter the number of nickels you would like to deposit");
	    	nickels = in.nextInt();
	    	if(nickels > 0) {
	    		this.amountDeposited = amountDeposited + (nickels * 5);
	    	}
	    	
	    } while (nickels != 0);
	
	    	
	    do {
		    System.out.println("Please enter the number of pennies you would like to deposit");
		    pennies = in.nextInt();
		    if(pennies > 0) {
		    	this.amountDeposited = amountDeposited +  pennies;
		    }
		    
		} while (pennies != 0);
	    	
	    
		display = ((double)(amountDeposited))/100;
	    System.out.println("You have deposited $" + display + ".");
	    
	    
	}
	
	/***************************************************************************************/

	
	public void setAmountDeposited(int fiveDollarBills, int oneDollarBills, int quarters, int dimes, int nickels, int pennies) {
		this.amountDeposited = (fiveDollarBills * 500) + (oneDollarBills * 100) + (quarters * 25) + (dimes * 10) * (nickels * 5) + pennies;		

		double display;
		display = ((double)amountDeposited)/100;
		//System.out.println("You have deposited $" + display + ".");
	}	
		
	/***************************************************************************************/
	
		
	public void selection() {
	    	
		int userSelection;
	    double display = ((double)(amountDeposited - cart))/100;
	    System.out.println("Your remaining balance is $" + display);
	    System.out.println("Please choose an item from the vending machine");
	    System.out.println("1: Brisk Iced Tea, $1.50");
	    System.out.println("2: Fruit Snacks, $2.00");
	    System.out.println("3: Sour Patch, $1.00");
	    System.out.println("4: Water, $0.10");
	    System.out.println("5: Gum, $0.70");
	    System.out.println("Enter the corresponding number to add that item to your cart, 6 to cancel your selection, or 0 to conclude your order. ");
	    	
	    userSelection = in.nextInt();
	    	
	    switch(userSelection) {
	    case 0: checkout(); 
	    break;
	    case 1: addBriskIcedTea();
	    break;
	    case 2: addFruitSnacks();
	    break;
	    case 3: addSourPatch();
	    break;
	    case 4: addWater();
	    break;
	    case 5: addGum();
	    break;
	    case 6: cart = 6;
	    		System.out.println("Have a nice day!");
	    		System.exit(0);
	    default: this.selection();
	    }
	    	
	}
	
	/***************************************************************************************/
	
	public void selection(int userSelection) {
		
		double display = ((double)(amountDeposited - cart))/100;
	    //System.out.println("Your remaining balance is $" + display);
	    System.out.println("Please choose an item from the vending machine");
	    System.out.println("1: Brisk Iced Tea, $1.50");
	    System.out.println("2: Fruit Snacks, $2.00");
	    System.out.println("3: Sour Patch, $1.00");
	    System.out.println("4: Water, $0.10");
	    System.out.println("5: Gum, $0.70");
	    System.out.println("Enter the corresponding number to add that item to your cart or 0 to conclude your order.");
	    	
	    userSelection = in.nextInt();
	    	
	    switch(userSelection) {
	    case 0: checkout(); 
	    break;
	    case 1: addBriskIcedTeaPC();
	    break;
	    case 2: addFruitSnacksPC();
	    break;
	    case 3: addSourPatchPC();
	    break;
	    case 4: addWaterPC();
	    break;
	    case 5: addGumPC();
	    break;
	    default: this.selection();
	    }
	
	}
	
	/***************************************************************************************/
	
	public void addBriskIcedTea() {
		
		if(this.cart+briskIcedTea <= amountDeposited) {
			this.cart = cart + briskIcedTea;
			System.out.println("You have added a Brisk iced tea to your cart!");
			numBriskIcedTea = numBriskIcedTea+1;
			if(this.cart == amountDeposited) {
				checkout();
			}
			selection();
		} else {
		System.out.println("You have insufficient funds for that item. Please choose another item, or check out. ");
		}
	}
		
		public void addBriskIcedTeaPC() {
			
			if(this.cart+briskIcedTea <= amountDeposited) {
				this.cart = cart + briskIcedTea;
				System.out.println("You have added a Brisk iced tea to your cart!");
				numBriskIcedTea = numBriskIcedTea+1;
				if(this.cart == amountDeposited) {
					checkout();
				}
			} else {
			System.out.println("You have insufficient funds for that item. Please choose another item, or check out. ");
		}
	    
	}	    

	public void addFruitSnacks() {
		if(this.cart+fruitSnacks <= amountDeposited) {
			this.cart = cart + fruitSnacks;
			System.out.println("You have added a Fruit Snack to your cart!");
			numFruitSnacks = numFruitSnacks+1;
			if(this.cart == amountDeposited) {
				checkout();
			}
			selection();
		} else {
			System.out.println("You have insufficient funds for that item. Please choose another item, or check out. ");
		}
		    
	}	
	
	public void addFruitSnacksPC() {
		if(this.cart+fruitSnacks <= amountDeposited) {
			this.cart = cart + fruitSnacks;
			System.out.println("You have added a Fruit Snack to your cart!");
			numFruitSnacks = numFruitSnacks+1;
			if(this.cart == amountDeposited) {
				checkout();
			}
		} else {
			System.out.println("You have insufficient funds for that item. Please choose another item, or check out. ");
		}
		    
	}
	
	public void addSourPatch() {
		if(this.cart+sourPatch <= amountDeposited) {
			this.cart = cart + sourPatch;
			System.out.println("You have added a Sour Patch to your cart!");
			numSourPatch = numSourPatch+1;
			if(this.cart == amountDeposited) {
				checkout();
			}
			selection();
		} else {
			System.out.println("You have insufficient funds for that item. Please choose another item, or check out. ");
		}
		    
	}	
	
	public void addSourPatchPC() {
		if(this.cart+sourPatch <= amountDeposited) {
			this.cart = cart + sourPatch;
			System.out.println("You have added a Sour Patch to your cart!");
			numSourPatch = numSourPatch+1;
			if(this.cart == amountDeposited) {
				checkout();
			}
		} else {
			System.out.println("You have insufficient funds for that item. Please choose another item, or check out. ");
		}
		    
	}
	    
	public void addWater() {
		if(this.cart+water <= amountDeposited) {
			this.cart = cart + water;
			System.out.println("You have added a water to your cart!");
			numWater = numWater+1;
			if(this.cart == amountDeposited) {
				checkout();
			}
			selection();
		} else {
			System.out.println("You have insufficient funds for that item. Please choose another item, or check out. ");
		}
		    
	}	
	
	public void addWaterPC() {
		if(this.cart+water <= amountDeposited) {
			this.cart = cart + water;
			System.out.println("You have added a water to your cart!");
			numWater = numWater+1;
			if(this.cart == amountDeposited) {
				checkout();
			}
		} else {
			System.out.println("You have insufficient funds for that item. Please choose another item, or check out. ");
		}
		    
	}
	
	public void addGum() {
		if(this.cart+gum <= amountDeposited) {
			this.cart = cart + gum;
			System.out.println("You have added a Gum to your cart!");
			numGum = numGum+1;
			if(this.cart == amountDeposited) {
				checkout();
			}
			selection();
		} else {
			System.out.println("You have insufficient funds for that item. Please choose another item, or check out. ");
		}
		    
	}		
	
	public void addGumPC() {
		if(this.cart+gum <= amountDeposited) {
			this.cart = cart + gum;
			System.out.println("You have added a Gum to your cart!");
			numGum = numGum+1;
			if(this.cart == amountDeposited) {
				checkout();
			}
		} else {
			System.out.println("You have insufficient funds for that item. Please choose another item, or check out. ");
		}
		    
	}	
	/***************************************************************************************/

	    
	public void checkout() {
		
		double display = (double)cart /100;
		System.out.println("The total amount that you spent is: $" + display);
		System.out.println("You bought " + numBriskIcedTea + " Brisk Iced Teas!");
		System.out.println("You bought " + numFruitSnacks + " Fruit Snack!");
		System.out.println("You bought " + numSourPatch + " Sour Patch!");
		System.out.println("You bought " + numWater + " Water!");
		System.out.println("You bought " + numGum + " Gum!");
		display = ((double)(amountDeposited - cart))/100;
		System.out.println("Your change is: $" + display);
		
		System.out.println("You receive the following change.");
		this.amountRemaining = amountDeposited - cart;
		System.out.println((amountRemaining/25) + " quarters");
		amountRemaining = amountRemaining%25;
		System.out.println((amountRemaining/10) + " dimes");
		amountRemaining = amountRemaining%10;
		System.out.println((amountRemaining/5) + " nickels");
		amountRemaining = amountRemaining%5;
		System.out.println("and " + amountRemaining + " pennies.");
		
		System.exit(0);
	}
	    
	/***************************************************************************************/
	    
	public int getAmountRemaining() {
		return amountRemaining;
	}
	public void setAmountRemaining(int amountRemaining ) {
		this.amountRemaining = amountRemaining;
	}
	public int getCart() {
		return cart;
	}
	public void setCart(int cart) {
		this.cart = cart;
	}
	    
	    
	   
	    
	    
	    
}
