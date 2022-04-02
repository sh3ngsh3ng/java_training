import java.util.Scanner;

class Guesser {
	int gnum;
	int guessNum() {
		System.out.println("Guesser: Guess a number from 0-50");
		Scanner scan = new Scanner(System.in);
		gnum = scan.nextInt();
		return gnum;
	}
}

class Player {
	int pnum;
	int guessNum() {
		System.out.println("Player: Guess a number from 0 - 50");
		Scanner scan = new Scanner(System.in);
		pnum = scan.nextInt();
		return pnum;
	}
}

class Umpire {
	int gnum;
	int pnum1;
	int pnum2;
	int pnum3;
	void collectGnum() {
		Guesser g = new Guesser();
		gnum = g.guessNum();
	}
	void collectPnum() {
		Player p1 = new Player();
		pnum1 = p1.guessNum();
		Player p2 = new Player();
		pnum2 = p2.guessNum();
		Player p3 = new Player();
		pnum3 = p3.guessNum();
	}
	
	void compare() {
		if (pnum1 == gnum) {
			System.out.println("Player 1 wins!");
		} 
		if (pnum2 == gnum) {
			System.out.println("Player 2 wins!");
		} 
		if (pnum3 == gnum) {
			System.out.println("Player 3 wins!");
		} 
		if (pnum1 != gnum && pnum2 != gnum && pnum3 != gnum){
			System.out.println("Game lost. Try again!!!");
		}
	}
}


public class LaunchGuesser {
	
	public static void main(String[] args) {
		boolean play = true;
		System.out.println("Game starts");
		while (play) {
			Umpire u = new Umpire();
			u.collectGnum();
			u.collectPnum();
			u.compare();
			
			System.out.println("Continue playing? Enter: true/false");
			Scanner scan = new Scanner(System.in);
			play = scan.nextBoolean();
			
		}
		System.out.println("Game ends");
		
	}

}
