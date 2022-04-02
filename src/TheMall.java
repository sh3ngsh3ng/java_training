import java.util.ArrayList;
import java.util.Scanner;


abstract class Menu {
	Scanner sc = new Scanner(System.in);
	MenuSwitcher ms = new MenuSwitcher();
	abstract void displayMenu();
	abstract void getOptions();
	abstract void userAction(int option);
}


class MainMenu extends Menu {
	static String menu[][] = {
			{"Food Court","You can buy food here!"},
			{"Clothing Store", "You can buy clothes here!"},
			{"Shoe Store", "You can buy shoes here!"},
			{"Pharmacy", "You can buy drugs here!"},
			{"Arcade", "You can earn coins here!"},
			{"Cart", "Check your cart!"},
			{"Profile", "Check your details!"},
			{"Exit", "Exit Mall with your items!"}
	};
	
	void displayMenu() {
		System.out.println("                The Mall                     ");
		Table.printMainMenu(menu); // change to table class
		System.out.println();
		System.out.println("Please enter a number from 1 to " + (menu.length - 1));
	}
	
	void userAction(int option) {
		switch(option) {
		case 1: ms.switchMenu(new FoodCourtMenu());
				break;
		case 2: ms.switchMenu(new ClothingStoreMenu());
				break;
		case 3: ms.switchMenu(new ShoeStoreMenu());
				break;
		case 4: ms.switchMenu(new Pharmacy());
				break;
		case 5: Arcade.TicTacToeGame();
				Arcade.checkResult();
				ms.switchMenu(new MainMenu());
				break;
		case 6: System.out.println("Below are the items currently in your cart");
				Table.printCart(Customer.cart);
				ms.switchMenu(new MainMenu());
				break;
		case 8: System.out.println("Thank you for shopping here in The Mall!");
				System.out.println("Below are the items you've bought!");
				Table.printCart(Customer.cart);
				System.out.println("Bye!");
				System.exit(0);
		default:System.out.println("Invalid selection. Please enter a valid number.");
				ms.switchMenu(new MainMenu());
				break;
		}
	}
	
	void getOptions() {
		int option = sc.nextInt();
		userAction(option);
	}

}


class FoodCourtMenu extends Menu {
	String itemName = null;
	int itemCost = 0;
	static String menu[][] = {
			{"Chicken Rice","Rice with steamed chicken!", "3 coins"},
			{"Duck Rice", "Rice with roasted duck!", "3 coins"},
			{"Wanton Noodles", "Noodles with wanton!", "5 coins"},
			{"Coke", "One bottled coke!", "1 coins"},
			{"Pepsi", "One bottled pepsi!", "1 coins"},
			{"Coffee", "One cup of black coffee", "2 coins"},
			{"Main Menu", "Return to Main Menu", "N/A"}
	};
	
	void displayMenu() {
		System.out.println("                Food Court                     ");
		System.out.println("Below is the menu in the food court! What would you like to buy?");
		Table.printMenu(menu);
		System.out.println();
		System.out.println("Please enter a number from 1 to " + menu.length);
	}
	

	void getOptions() {
//		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		userAction(option);
	}
	
	void userAction(int option) {
//		MenuSwitcher ms = new MenuSwitcher();
		switch(option) {
		case 1: itemName="Chicken Rice";
				itemCost=3;
				break;
		case 2: itemName="Duck Rice";
				itemCost=3;
				break;
		case 3: itemName="Wanton Noodles";
				itemCost=5;
				break;
		case 4: itemName="Coke";
				itemCost=1;
				break;
		case 5: itemName="Pepsi";
				itemCost=1;
				break;	
		case 6: itemName="Coffee";
				itemCost=2;
				break;	
		case 7: ms.switchMenu(new MainMenu());
				break;
		}
		Customer.addToCart(new CartItem(itemName, itemCost));
		Table.printCart(Customer.cart);
		ms.switchMenu(new FoodCourtMenu());
	}
	
}


class ClothingStoreMenu extends Menu {
	String itemName = null;
	int itemCost = 0;
	static String menu[][] = {
			{"T-Shirt", "Black Cotton Shirt", "5 coins"},
			{"Long Pants","Leather Green Pants", "5 coins"},
			{"Skirt","Black Skirt","5 coins"},
			{"Blouse","Grey Blouse", "5 coins"},
			{"Jacket", "Black Leather Jacket", "8 coins"},
			{"Socks","One pair of white socks", "2 coins"},
			{"Main Menu","Return to Main Menu", "N/A"}
	};
	
	void displayMenu() {
		System.out.println("                Clothing Store                     ");
		System.out.println("Below is the catalogue for the Clothing Store! What would you like to buy?");
		Table.printMenu(menu);
		System.out.println();
		System.out.println("Please enter a number from 1 to " + menu.length);
	}
	
	void getOptions() {
		int option = sc.nextInt();
		userAction(option);
	}
	
	void userAction(int option) {
		switch(option) {
		case 1: itemName="T-Shirt";
				itemCost=5;
				break;
		case 2: itemName="Long Pants";
				itemCost=5;
				break;
		case 3: itemName="Skirt";
				itemCost=5;
				break;
		case 4: itemName="Blouse";
				itemCost=5;
				break;
		case 5: itemName="Jacket";
				itemCost=8;
				break;	
		case 6: itemName="Socks";
				itemCost=2;
				break;	
		case 7: ms.switchMenu(new MainMenu());
				break;
		}
		Customer.addToCart(new CartItem(itemName, itemCost));
		Table.printCart(Customer.cart);
		ms.switchMenu(new ClothingStoreMenu());
	}
	
}


class ShoeStoreMenu extends Menu {
	String itemName = null;
	int itemCost = 0;
	static String menu[][] = {
			{"Slippers", "Green Slippers", "3 coins"},
			{"Safety Boots","Black Boots", "4 coins"},
			{"Leather Boots","Grey Leather Boots","6 coins"},
			{"Sneakers","White Sneakers", "7 coins"},
			{"High Heels", "3 Inch Heels", "7 coins"},
			{"Platforms","5 Inch Platforms", "8 coins"},
			{"Main Menu","Return to Main Menu", "N/A"}
	};
	
	void displayMenu() {
		System.out.println("                Shoe Store                     ");
		System.out.println("Below is the catalogue for the Shoe Store! What would you like to buy?");
		Table.printMenu(menu);
		System.out.println();
		System.out.println("Please enter a number from 1 to " + menu.length);
	}
	
	void getOptions() {
		int option = sc.nextInt();
		userAction(option);
	}
	
	void userAction(int option) {
		switch(option) {
		case 1: itemName="Slippers";
				itemCost=3;
				break;
		case 2: itemName="Safety Boots";
				itemCost=4;
				break;
		case 3: itemName="Leather Boots";
				itemCost=6;
				break;
		case 4: itemName="Sneakers";
				itemCost=7;
				break;
		case 5: itemName="High Heels";
				itemCost=7;
				break;	
		case 6: itemName="Platforms";
				itemCost=8;
				break;	
		case 7: ms.switchMenu(new MainMenu());
				break;
		}
		Customer.addToCart(new CartItem(itemName, itemCost));
		Table.printCart(Customer.cart);
		ms.switchMenu(new ShoeStoreMenu());
	}
}


class Pharmacy extends Menu {
	String itemName = null;
	int itemCost = 0;
	static String menu[][] = {
			{"Panadol", "For headaches & fever", "3 coins"},
			{"Loratadine","For allergies", "4 coins"},
			{"Fibogel","For constipation","4 coins"},
			{"Charcoal","For food poisoning", "5 coins"},
			{"Pi Par Gao", "For sore throat", "6 coins"},
			{"Vitamin C","For immunity", "7 coins"},
			{"Main Menu","Return to Main Menu", "N/A"}
	};
	
	void displayMenu() {
		System.out.println("                  Pharmacy                       ");
		System.out.println("Below is the catalogue for the Pharmacy! What would you like to buy?");
		Table.printMenu(menu);
		System.out.println();
		System.out.println("Please enter a number from 1 to " + menu.length);
	}
	
	void getOptions() {
		int option = sc.nextInt();
		userAction(option);
	}
	
	void userAction(int option) {
		switch(option) {
		case 1: itemName="Panadol";
				itemCost=3;
				break;
		case 2: itemName="Loratadine";
				itemCost=4;
				break;
		case 3: itemName="Fibogel";
				itemCost=4;
				break;
		case 4: itemName="Charcoal";
				itemCost=5;
				break;
		case 5: itemName="Pi Par Gao";
				itemCost=6;
				break;	
		case 6: itemName="Vitamin C";
				itemCost=7;
				break;	
		case 7: ms.switchMenu(new MainMenu());
				break;
		}
		Customer.addToCart(new CartItem(itemName, itemCost));
		Table.printCart(Customer.cart);
		ms.switchMenu(new ShoeStoreMenu());
	}
}


class Customer {
	static int totalCoins = 0;
	String name;
	
	static ArrayList<CartItem> cart = new ArrayList<CartItem>();
	
	Customer(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	static void getCart() {
		for (CartItem c: cart) {
			System.out.println(c.toString());
		}
	}
	
	static int displayCoins() {
		return totalCoins;
	}
	
	void displayCart() {
		System.out.println("This is your cart...");
	}
	
	static void addToCart(CartItem item) {
		if (item.itemCost > totalCoins) {
			System.out.println("You do not have enough coins");
			System.out.println("Please select another item OR go to the arcade to earn more coins");
		} else {
			totalCoins -= item.itemCost;
			System.out.println("Your item has been added to cart.");
			System.out.println();
			cart.add(item);
		}
	}
}


class CartItem {
	String itemName;
	int itemCost;
	
	CartItem(String itemName, int itemCost) {
		this.itemName = itemName;
		this.itemCost = itemCost;
	}
	
	public String toString() {
		return itemName + "                          " + itemCost;
	}
	
}


class MenuSwitcher {
	void switchMenu(Menu ref) {
		ref.displayMenu();
		ref.getOptions();
	}
}


class Table {
	static String menuFormat = "| %-4d | %-20s | %-28s | %-8s |%n";
	static String mainMenuFormat = "| %-4d | %-20s | %-28s | %n";
	static String cartFormat = "| %-20s| %-8s|%n";
	static void printMenu(String[][] menu) {
		System.out.format("+------+----------------------+------------------------------+----------+%n");
		System.out.format("|No    | Name                 |Description                   |Cost      |%n");
		System.out.format("+------+----------------------+------------------------------+----------+%n");
		for (int i = 1; i <= menu.length; i++) {
		    System.out.format(menuFormat, i, menu[i-1][0], menu[i-1][1], menu[i-1][2]);
		}
		System.out.format("+------+----------------------+------------------------------+----------+%n");
	}
	
	static void printCart(ArrayList<CartItem> cart) {
		System.out.format("+---------------------+---------+%n");
		System.out.format("| Item                |Cost     |%n");
		System.out.format("+---------------------+---------+%n");
		for (CartItem x: cart) {
			System.out.format(cartFormat, x.itemName, x.itemCost);
		}
	
		System.out.format("+---------------------+---------+%n");
	}
	
	static void printMainMenu(String[][] menu) {
		System.out.format("+------+----------------------+------------------------------+%n");
		System.out.format("|No    | Name                 |Description                   |%n");
		System.out.format("+------+----------------------+------------------------------+%n");
		for(int i=1; i <= menu.length; i++) {
			System.out.format(mainMenuFormat, i, menu[i-1][0], menu[i-1][1]);
		}
		System.out.format("+------+----------------------+------------------------------+%n");
	}
}


class Arcade {
	static String gameResult;
	
	static void TicTacToeGame() {
		String[] args = {};
		TicTacToe.main(args);
		gameResult = TicTacToe.result;
	}
	
	static void resetResults() {
		gameResult = null;
		TicTacToe.result = "";
	}
	
	static void checkResult() {
		System.out.println(gameResult);
		if (gameResult == "win") {
			System.out.println("You've earned 10 coins!");
			Customer.totalCoins+=10;
		} else if (gameResult == "draw") {
			System.out.println("You've earned 5 coins!");
			Customer.totalCoins+=5;
		} else {
			System.out.println("You did not earn any coins. Try again.");
		}
		resetResults();
		Customer.displayCoins();
	}
}


public class TheMall {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MenuSwitcher ms = new MenuSwitcher();
		
		System.out.println("Please enter your full name to register:  ");
		String name = sc.nextLine();
		
		Customer cust = new Customer(name);
		
		System.out.println("Welcome to The Mall! " + cust.getName() + "! You can redeem items by earning coins at the arcade!");
		System.out.println("You currently have " + Customer.displayCoins() + " coins. Go to the Arcade to earn some!");
		System.out.println();
		
		MainMenu mm = new MainMenu();
		ms.switchMenu(mm);

	}
}
