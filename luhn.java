import java.util.Scanner;

public class Exercise06_31{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a credit card number: ");
    String number = input.nextLine();

    /* Call card validation method. If it returns true, the card is valid
    If it returns False, the number is not valid */
    if (CardValid(number)) {
      System.out.printf("%s is VALID", number);
    } else{
      System.out.printf("%s is INVALID", number);
    }
    CardValid(number);
  }


static boolean CardValid(String num) {

    int numLen = num.length();
    int digitSums = 0;
    boolean alternate = false;

    for (int i = numLen-1;i >= 0 ; i--) {
      int digit = num.charAt(i)- '0';

      if (alternate == true){
        digit = digit*2;
      }
      digitSums += digit / 10; //adds first digit in double digit #
      digitSums += digit % 10; /*adds sinlge digit #'s and second digit for
                                 double digit #'s */

      alternate = !alternate; /*alternates between T and F to get every
                                other number in the sequence */
    }
    return (digitSums % 10 == 0);
  }
}
