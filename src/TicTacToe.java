import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	static ArrayList<Integer> ppos = new ArrayList<Integer>();
	static ArrayList<Integer> cpos = new ArrayList<Integer>();
	
	static String result = "";
	
	static int moveNum = 1;
	
	static String board[][] = {
			{
				" ", "|", " ", "|"," "
			}, 
			{
				"-", "+","-","+","-"
			},
			{
				" ", "|", " ", "|"," "
			}, 
			{
				"-", "+","-","+","-"
			},
			{
				" ", "|", " ", "|"," "
			}
			
	};
	
	static String dupBoard[][] = {
			{
				" ", "|", " ", "|"," "
			}, 
			{
				"-", "+","-","+","-"
			},
			{
				" ", "|", " ", "|"," "
			}, 
			{
				"-", "+","-","+","-"
			},
			{
				" ", "|", " ", "|"," "
			}
	};
	
	static void resetBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j<board.length; j++) {
				board[i][j] = new String(dupBoard[i][j]);
			}
		}
		ppos = new ArrayList<Integer>();
		cpos = new ArrayList<Integer>();
		
	}
   
	static void displayBoard(String board[][]) {
		System.out.println();
		
		for (String row[]:board) {
			for (String x: row) {
				System.out.print(x);
			}
			System.out.println();
		}
	}
	
//	static void checkDupPosition(ArrayList<Integer>ppos, ArrayList<Integer>cpos) {
//		if (ppos.contains(cpos))
//	}
	
	static void insertPosition(String board[][], int position, String playerType) {
		String symb;
		if (playerType.equals("player")) {
			symb = "X";
			ppos.add(position);
		} else {
			symb = "O";
			cpos.add(position);
		}
		switch(position) {
		case 1: board[0][0]=symb;
			break;
		case 2: board[0][2] =symb;
			break;
		case 3: board[0][4] =symb;
			break;
		case 4: board[2][0] =symb;
			break;
		case 5: board[2][2] =symb;
			break;
		case 6: board[2][4] =symb;
			break;
		case 7: board[4][0] =symb;
			break;
		case 8: board[4][2] =symb;
			break;
		case 9: board[4][4] =symb;
			break;
		default: System.out.println("invalid position"); 
		}
		
		TicTacToe.displayBoard(board);
	}
	
	
//	static void comInsertPosition() {
//		Random rand = new Random();
//		int comPosition = rand.nextInt(9);
//		comPosition++;
//		TicTacToe.insertPosition(board, comPosition, "computer");
//	}
	
	public static void winningCondition() {
		List toprow = Arrays.asList(1,2,3);
		List midrow = Arrays.asList(4,5,6);
		List botrow = Arrays.asList(7,8,9);
		List fcol = Arrays.asList(1,4,7);
		List scol = Arrays.asList(2,5,8);
		List lastcol = Arrays.asList(3,6,9);
		List diag1 = Arrays.asList(1,5,9);
		List diag2 = Arrays.asList(3,5,7);
		
		ArrayList<List>winningcond = new ArrayList<List>();
		winningcond.add(toprow);
		winningcond.add(midrow);
		winningcond.add(botrow);
		winningcond.add(fcol);
		winningcond.add(scol);
		winningcond.add(lastcol);
		winningcond.add(diag1);
		winningcond.add(diag2);
		
		
		for(List x:winningcond) {
			if (ppos.containsAll(x)) {
				System.out.println("Player wins!");
				TicTacToe.result = "win";
				resetBoard();
//				restartGame();
//				System.exit(0);
			} else if (cpos.containsAll(x)) {
				System.out.println("Computer wins!");
				TicTacToe.result = "lose";
				resetBoard();
//				restartGame();			
//				System.exit(0);
			} else if ((ppos.size()+cpos.size()) == 9) {
				System.out.println("Draw!");
				TicTacToe.result = "draw";
				resetBoard();
//				restartGame();
//				System.exit(0);
			}
		}
	}
	
	public static void restartGame() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to play again? Y/N");
		String res = sc.nextLine();
		System.out.println(res);
		if (res == "y") {
			System.out.println(TicTacToe.result);
			TicTacToe.result = "";
		} else if(res == "n") {
			System.out.println(TicTacToe.result + "1");
			System.exit(0);
		}
		System.out.println(TicTacToe.result);
	}
	
	public static void main(String[] args) {
		TicTacToe.displayBoard(board);
		Scanner sc = new Scanner(System.in);
		int playerposition;
		int cpuposition;
		
		while (TicTacToe.result == "") {
			
			System.out.println("Enter the position (1 - 9)");
			
			playerposition = sc.nextInt();
			
			while(TicTacToe.ppos.contains(playerposition) || TicTacToe.cpos.contains(playerposition)) {
				System.out.println("Position already occupied. Please enter a new position(1-9)");
				playerposition = sc.nextInt();
			}
			TicTacToe.insertPosition(board, playerposition, "player");
			
			System.out.println("Enter the position (1 - 9)");

			
			Random rand = new Random();
			cpuposition = rand.nextInt(9)+1;
			
			while (TicTacToe.ppos.contains(cpuposition) || TicTacToe.cpos.contains(cpuposition)) {
				TicTacToe.winningCondition();
				System.out.println("Position already occupied. Please enter a new position(1-9)");
				cpuposition = rand.nextInt(9)+1;
			}
			
			TicTacToe.insertPosition(board, cpuposition, "cpu");
			TicTacToe.winningCondition();
		}
	
		playerposition = 0;
		cpuposition = 0;
		
		
		
	}
}
