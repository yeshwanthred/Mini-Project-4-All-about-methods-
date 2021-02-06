//Scanner import
import java.util.Scanner;

class Main {
 public static void main(String[] args) {
  
  //Scanner statement

    Scanner scan = new Scanner(System.in);
     System.out.println("Hey there, welcome to garage 3B");
 
  //Total of red and blue cars

    System.out.println("How many blue and red cars do you see? "); 
  
  //Get input from client about how many red cars 

    int totalCars = scan.nextInt();

    System.out.println("How many red cars are there?");

    int redCars = scan.nextInt();
  
  System.out.println("There are " + blueCars(totalCars, redCars) + " blue cars in garage 3B");
    //Asking user for how much each parking spot cost  
    System.out.println("You are renting a parking garage? ");

    
    System.out.println("What is the price of 1 parking spot? ");
    int pricePark = scan.nextInt();
  
  System.out.println("How many park spots do you want to reserve ? ");
    int reserve = scan.nextInt();

    System.out.println(" You ordered " + reserve + " parking spots " + "the total cost is $" + totalPrice( pricePark, reserve));
  }
 
  //The 1st method
  static int blueCars(int totalCars, int redCars) {
    //To find the amount of blue cars in a parking lot
    return totalCars - redCars;
  }
 
