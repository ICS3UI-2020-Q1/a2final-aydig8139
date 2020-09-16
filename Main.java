import java.util.Scanner;

/**
 * Calculates the subtotal, tax and total of the size of pizza the customer wants
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // ask customer for the size of pizza they want 
    System.out.println("What is the size of the pizza (in cm):");
    int size = input.nextInt();

    //create constant for the price of labour
    final double LABOUR_COST = 0.75;

    //create constant for the price to run the ovens
    final double OVEN_COST = 0.99;

    //create constant for price per diameter centimeter
    final double PER_CM = 0.50;

    //calculate subtotal 
    double subtotal = LABOUR_COST + OVEN_COST + size * PER_CM;

    //tell user the subtotal 
    System.out.println("Subtotal: $" + subtotal);

    //calculate tax
    double tax = subtotal * 0.13;

    //tell user tax
    System.out.println("Taxes: $" + tax);

    //calculate total price
    double total = tax + subtotal;

    //tell user the total prices
    System.out.println("Total: $" + total);

    if (size >= 1 && size <= 20) {
      System.out.println("We are going to make you a cute little pizza!");
    } else if (size >= 21 && size <= 40) {
      System.out.println("This will be delicious!");
    } else {
      System.out.println("Whoa, big pizza! You might need a truck to get this home!");
    }
    
  }
}
