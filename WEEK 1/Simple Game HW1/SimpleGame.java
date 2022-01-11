package simplegame;
import java.util.Scanner;

/**
 * In this assignment, you will implement a simple game.  This game has 2 options for the user playing.  Based on user input, the 
 * user can choose to either convert time, from seconds to hours, minutes, and seconds, or calculate the sum of all digits in an integer.  
 * 
 * At the beginning of the game, the user will be prompted to input either 1 or 2, to indicate which option of the game they want 
 * to play.  1 will indicate converting time, and 2 will indicate calculating the sum of digits in an integer.
 * 
 * For converting time, the user will be prompted to input a number of seconds (as an int) and the program will call a method that 
 * will convert the seconds to time, in the format hours:minutes:seconds, and print the result.  For example, if the user enters 6734, 
 * the program will print the time, 1:52:14. As another example, if the user enters 10,000, the program should print 2:46:39.
 * 
 * For calculating the sum of digits in an integer, the user will be prompted to input a number (as a non-negative int) and the program will 
 * call a method to calculate the sum of the digits in that number, and print the result.  For example, if the user enters 321, 
 * the program will print the sum, 6, because the individual digits in the number add up to 6.  3 + 2 + 1 = 6.
 * 
 * Each method has been defined for you, but without the code. See the javadoc for each method for instructions on what the method 
 * is supposed to do and how to write the code. It should be clear enough.  In some cases, we have provided hints to help you get started.
 * 
*/
public class SimpleGame {

	/**
	 * Write a method to convert the given seconds to hours:minutes:seconds.
	 * @param seconds to convert
	 */
	public static String convertTime(int seconds){
		String ans;
		// TODO: Your code goes here
		if(seconds>=0) {
		if(seconds%3600==0) {
			ans = (seconds/3600+":0:0");
		}
		else {
			int rem=seconds%3600;
			if(rem%60==0) {
				ans =(seconds/3600+":"+rem/60+":0");
			}
			else {
				ans =(seconds/3600+":"+rem/60+":"+rem%60);
			}
		}
		}
		else {
			ans =(seconds+":"+seconds+":"+seconds);
		}
		return ans;
	}

	/**
	 * Write a method that adds all the digits in the given non-negative integer.
	 * @param integer to add digits
	 */
	public static int digitsSum(int input){
		// TODO: Your code goes here
		int digit;
		int sum=0;
		while(input > 0)  
		{  
		//finds the last digit of the given number    
		digit = input % 10;  
		//adds last digit to the variable sum  
		sum = sum + digit;  
		//removes the last digit from the number  
		input = input / 10;  
		}
		return(sum);  
	}
	
	public static void main(String[] args) {
		// Create an instance of the SimpleGame class.
		// TODO: Your code goes here
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		if (num==1) {
			int inp=sc.nextInt();
			convertTime(inp);
		}
		else if(num==2) {
			int in=sc.nextInt();
			digitsSum(in);
		}
		// Ask the user which game to play.
		// Then ask the user for input and pass the value to the corresponding method.
		
		// If the user enters 1, ask for an integer to convert and call the convertTime method.
		// If the user enters 2, ask for an integer and call the digitsSum method.
		
		// TODO: Your code goes here
		
		sc.close();
	}	
}