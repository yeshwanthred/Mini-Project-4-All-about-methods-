//Scanner import
import java.util.Scanner;

class Main {
 public static void main(String[] args) {
  
  //Scanner statement

    Scanner scan = new Scanner(System.in);
     System.out.println("Hey there, welcome to garage 3B");
 
  //Total of red and blue cars

    System.out.println("How many blue and red cars do you see? "); 
  
  //Get input from client

    int totalCars = scan.nextInt();

    System.out.println("How many red cars are there?");

    int redCars = scan.nextInt();
