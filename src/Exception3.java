import java.util.Scanner;

class InvalidCredentialsException extends Exception {
	public String getMessage() {
		return "Invalid credentials";
	}
}


class Atm {
	int username;
	int password;
	void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username");
		username = sc.nextInt();
		System.out.println("Enter your password");
		password = sc.nextInt();
	}
	
	void checkCredentials() throws InvalidCredentialsException {
		if ((username == 1111) && (password == 2222)) {
			System.out.println("Collect your money");
		} else {
			InvalidCredentialsException ice = new InvalidCredentialsException();
			System.out.println(ice.getMessage() + "- Message displayed in ATM");
			throw ice;
		}
	}
}

class Bank {
	void initiate() {
		Atm atm =  new Atm();
		atm.getInput();
		try {
			atm.checkCredentials();
		} catch (InvalidCredentialsException ice) {
			System.out.println(ice.getMessage() + "- Message dispplayed in BANK");
		}
		
	}
}


public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		b.initiate();
		
	}

}
