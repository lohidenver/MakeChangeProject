import java.text.NumberFormat;
import java.util.Scanner;
//User Story #1 = **
//The user is prompted asking for the price of the item.
//
//User Story #2 = **
//The user is then prompted asking how much money was tendered by the customer.
//
//User Story #3 = **
//Display an appropriate message if the customer provided too little money or the exact amount.
//
//User Story #4 **
//If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.
public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	double change = inputs();
	change(change);

		
	}

	private static double change(double change) {
		// TODO Auto-generated method stub
		
		int convertedChange = (int) (change * 100);
		
		
		System.out.println("\nPlease give the customer the following: \n");
		
		if (change < 0) {
			System.out.println("A punch to the face!");
		} else if (change == 0) {
			System.out.println("A polite thank you.");
		} 
		
	///////
		if (change > 0) {
		int twenties, tens, fives, ones, quarters, dimes, nickles, cents;
		
		twenties = convertedChange/2000;
		if (twenties>0) {
			convertedChange = convertedChange % 2000;
			System.out.println(twenties + " $20");	
		}
		
		tens = convertedChange/1000;
		if (tens>0) {
			convertedChange = convertedChange % 1000;
			System.out.println(tens + " $10");	
		}
		
		fives = convertedChange/500;
		if (fives>0) {
			convertedChange = convertedChange % 500;
			System.out.println(fives + " $5");	
		}
		
		ones = convertedChange/100;
		if (ones>0) {
			convertedChange = convertedChange % 100;
			System.out.println(ones + " $1");	
		}
		
		quarters = convertedChange/25;
		if (quarters>0) {
			convertedChange = convertedChange % 25;
			System.out.println(quarters + " quarters");	
		}
		
		dimes = convertedChange/10;
		if (dimes>0) {
			convertedChange = convertedChange % 10;
			System.out.println(dimes + " dimes");	
		}
		
		nickles = convertedChange/5;
		if (nickles>0) {
			convertedChange = convertedChange % 5;
			System.out.println(nickles+ " nickles");	
		}
		
		cents = convertedChange/1;
		if (cents>0) {
			convertedChange = convertedChange % 1;
			System.out.println(cents + " cents");
		}
		System.out.println("\nand a polite thank you");
		}
		
	
		
		
	///////	
			
		return change;
		
	}

	private static double inputs() {
		// TODO Auto-generated method stub
		Scanner uI = new Scanner(System.in);
		
		System.out.println("Please enter the price of your item: ");
		double price = uI.nextDouble();
		
		System.out.println("Please enter the amount tendered: ");
		double tender = uI.nextDouble();
		
		double change1 = tender-price;
		
		String resp1 = "\nYou have no change.";
		String resp2 = "\nAre you trying to rob me?!?";
		String resp3 = "\nHold on while I get your change.";
		String resp4 = "\nYour change will be: ";
		//
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String moneyString = formatter.format(change1);
		//  

		if (change1 == 0) {
			System.out.println(resp1);
		} else if (change1 < 0) {
			System.out.println(resp2);
		} else {
			System.out.println(resp3 + resp4 + moneyString);
		}
		
		
		return change1;
		
	}
	
	
	
	
	
	
	

}
