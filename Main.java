import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Scanner to find inputs from user
    Scanner input = new Scanner(System.in);
    // Variables
    int menuChoice;
    do {
      System.out.println("What would you like to know?");
      System.out.println("1. Multiplication table 2. Addition table");
      System.out.println("3. AND logic gate table 4. OR logic gate table");
      System.out.println("5. Exit system");
      menuChoice = Integer.parseInt(input.nextLine());
      if (menuChoice == 1 || menuChoice == 2 || menuChoice == 3 || menuChoice == 4) {
        if (menuChoice == 1) {
          System.out.println("this is 1");
        }
        if (menuChoice == 2) {
          System.out.println("this is 2");
        }
        if (menuChoice == 3) {
          System.out.println("this is 3");
        }
        if (menuChoice == 4) {
          System.out.println("this is 4");
        }
      }
      if (menuChoice == 5) {
        System.out.print("this is the exit");
      }

    } while (menuChoice != 5);

  }
}