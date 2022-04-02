// display menud
// item id, name, price
// select item via itemid
// ask for quantity
// give subtotal first
// ask if want to order more
// If no, conclude and print table with total
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Bill {
	String itemName;
	int price;
	int quantity;
	int subtotal;
	
	Bill(String itemName, int itemPrice, int b, int subtotal) {
		this.itemName=itemName;
		this.price=itemPrice;
		this.quantity=b;
		this.subtotal=subtotal;
	}
	
	public String toString() {
		return itemName + "   " + price + "    " + quantity + "     " + subtotal;
	}
	
}



public class OrderFood {
	
	// table with food items
	static String board[][] = {
			{"ID", "Item", "Price"},
			{"1", "Water", "10"},
			{"2", "Coke", "20"},
			{"3", "Pizza", "100"},
			{"4", "Burger", "150"},
			{"5", "Fries", "75"}
	};
	
	
	static ArrayList<String[]>orderList = new ArrayList<String[]>();
	
	
	// display table method
	static void displayBoard() {
		for (String row[]: board) {
			System.out.println();
			for (String x: row) {
				System.out.print(x + "   ");
			}
		}
		System.out.println();
	}
	
	// display final table for orders 
//	static void displayBoardFinal(ArrayList<String>finalOrders) {
//		
//	}
	
	
	// get user's name method
	static String getName() {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		return name;
	}
	
	static void selectItem(String board[][], int id) {
		String[] selected[];
		orderList.add(board[id]);
		for (String[] str : orderList)
	      { 		      
	           System.out.println(Arrays.toString(str)); 		
	      }
//		switch(id) {
//		case 1: selected = board[id];
//		break;
//		case 2: selected = board[id];
//		break;
//		case 3: selected = board[id];
//		break;
//		case 4: selected = board[id];
//		break;
//		case 5: selected = board[id];
//		break;
//		default: System.out.println("Please choose from 1 - 5");
//		}
//		
//		orderList.add(selected);
//		
//		System.out.println(selected.toString());
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int subtotal = 0;
		int total = 0;
		int itemPrice = 0;
		String itemName = null;
		char cont='Y';
		ArrayList<List>finalOrders = new ArrayList<List>();
		ArrayList<Bill> newItem = new ArrayList<Bill>();
		
		System.out.println("Welcome to the Restaurant");
		System.out.println("Please enter your name: ");
		String name = getName();
		
		System.out.println("Hi " + name);
		
		while (cont == 'Y') {
			System.out.println("Please choose the following items by ID");
			
			displayBoard();

			System.out.println("Please choose your item (1 - 5)");
			int a = sc.nextInt();
			
			System.out.println("Please enter the quantity");
			int b = sc.nextInt();
			
			switch(a) {
			case 1: itemName="water";
					itemPrice=10;
					subtotal=b*itemPrice;
					break;
			case 2: itemName="coke";
					itemPrice=20;
					subtotal=b*itemPrice;
					break;
			case 3: itemName="pizza";
					itemPrice=100;
					subtotal=b*itemPrice;
					break;
			case 4: itemName="burger";
					itemPrice=150;
					subtotal=b*itemPrice;
					break;
			case 5: itemName="fries";
					itemPrice=75;
					subtotal=b*itemPrice;
					break;
			default:System.out.println("Invalid selection");
					break;
			}
			total += subtotal;
			
//			System.out.println(itemName + "  " + itemPrice + "   " + subtotal);
//			List<String> newOrder = Arrays.asList(itemName, Integer.toString(itemPrice), Integer.toString(subtotal));
//			finalOrders.add(newOrder);
			
			newItem.add(new Bill(itemName, itemPrice, b, subtotal));
			
			System.out.println("Would you like to order more(y/n)");
			String input = sc.next();
			input = input.toUpperCase();
			char in[] = input.toCharArray();
			cont = in[0];
		}
		
//		for (List str : finalOrders)
//	      { 		      
//	           System.out.println(str);
//	      }
		
		for(Bill x: newItem) {
			System.out.println(x.toString());
		}
		System.out.println(total);
		
		
//		selectItem(board, a);
		
		
	}

}
