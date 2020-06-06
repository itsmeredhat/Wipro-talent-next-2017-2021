import java.util.Scanner;
public class LastDigit {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, last_digit;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number that you wish : ");
		number = sc.nextInt();	
		
		last_digit = number % 10;
		
		System.out.println("\n The Last Digit of a Given Number " + number + "  =  " + last_digit);
	}
}
