import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class PowerballSimulator {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		Scanner input = new Scanner(System.in);
		Random x = new Random();
		int ball1 = 0;
		int ball2 = 0;
		int ball3 = 0;
		int ball4 = 0;
		int ball5 = 0;
		int powerball = 0;
		int myball1 = 0;
		int myball2 = 0;
		int myball3 = 0;
		int myball4 = 0;
		int myball5 = 0;
		int mypowerball = 0;
		int moneyspent = 0;
		int winnings = 0;
		boolean quickpick = false;
		int tickets = 0;

		while(true) {
			System.out.println("How many tickets would you like to buy");
			tickets = input.nextInt();
			System.out.println("Would you like to play Quick Pick? Please answer with a boolean value");
			quickpick = input.nextBoolean();
			moneyspent = moneyspent + (tickets*2);
			if (quickpick == true) {

				myball1 = x.nextInt(69) + 1;
				myball2 = x.nextInt(69) + 1;
				myball3 = x.nextInt(69) + 1;
				myball4 = x.nextInt(69) + 1;
				myball5 = x.nextInt(69) + 1;
				mypowerball = x.nextInt(26) + 1;
			}

			else {
				System.out.println("Pick Ball 1. Note Ball 1 can be numbers 1-69.");
				myball1 = input.nextInt();
				System.out.println("Pick Ball 2. Note Ball 2 can be numbers 1-69.");
				myball2 = input.nextInt();
				System.out.println("Pick Ball 3. Note Ball 3 can be numbers 1-69.");
				myball3 = input.nextInt();
				System.out.println("Pick Ball 4. Note Ball 4 can be numbers 1-69.");
				myball4 = input.nextInt();
				System.out.println("Pick Ball 5. Note Ball 5 can be numbers 1-69.");
				myball5 = input.nextInt();
				System.out.println("Pick Powerball. Note Powerball can be numbers 1-26.");
				mypowerball = input.nextInt();
			}
			ball1 = x.nextInt(69) + 1;
			ball2 = x.nextInt(69) + 1;
			ball3 = x.nextInt(69) + 1;
			ball4 = x.nextInt(69) + 1;
			ball5 = x.nextInt(69) + 1;
			powerball = x.nextInt(26) + 1;

			System.out.println("Your numbers were " + myball1 + ", " + myball2 + ", " + myball3 + ", " + myball4 + ", " + myball5 + " and your powerball was " + mypowerball);
			System.out.println("The winning numbers were " + ball1 + ", " + ball2 + ", " + ball3 + ", " + ball4 + ", " + ball5 + " and the powerball was " + powerball);

			if (ball1 == myball1 && ball2 == myball2 && ball3 == myball3 && ball4 == myball4 && ball5 == myball5 && powerball == mypowerball) {
				System.out.println("You won the jackpot!");
				winnings = winnings + 1500000000;
			}
			else if (powerball == mypowerball) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball1 == myball1) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball2 == myball2) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball3 == myball3) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball4 == myball4) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball5 == myball5) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball1 == myball2) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball1 == myball3) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball1 == myball4) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball1 == myball5) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball2 == myball1) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball2 == myball3) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball2 == myball4) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball2 == myball5) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball3 == myball1) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball3 == myball2) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball3 == myball4) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball3 == myball5) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball4 == myball1) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball4 == myball2) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball4 == myball3) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball4 == myball5) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball5 == myball1) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball5 == myball2) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball5 == myball3) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball5 == myball4) {
				System.out.println("You won 4 dollars!");
				winnings = winnings + 4;	}
			else if (powerball == mypowerball && ball1 == myball1 && ball2 == myball2) {
				System.out.println("You won 7 dollars!");
				winnings = winnings + 7; }
			else if (powerball == mypowerball && ball2 == myball1 && ball1 == myball2) {
				System.out.println("You won 7 dollars!");
				winnings = winnings + 7; }
			else if (powerball == mypowerball && ball1 == myball1 && ball2 == myball3) {
				System.out.println("You won 7 dollars!");
				winnings = winnings + 7; }

		}
		}
	}
