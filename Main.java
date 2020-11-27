import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Scanner to find inputs from user
    Scanner input = new Scanner(System.in);
    // Variables
    int menuChoice;
    int [] multiplicationColl = {1,2,3,4,5,6,7,8,9,10,11,12};
    int [] multiplicationRow = {1,2,3,4,5,6,7,8,9,10,11,12};
    int MultiplicationOutput;
    String Red = "\033[0;31m";
    String White = "\033[0;37m";
    boolean True = true;
    boolean False = false;
    //This is the menun system that lets the user pick what they want to see
    do {
      System.out.println("What would you like to know?");
      System.out.println("1. Multiplication table 2. Addition table");
      System.out.println("3. AND logic gate table 4. OR logic gate table");
      System.out.println("5. Exit system");
      menuChoice = Integer.parseInt(input.nextLine());
     //This checks if the user wants to see something or if they want to exit the program, if they do want to see something then it checks again what option they want to see
      if (menuChoice == 1 || menuChoice == 2 || menuChoice == 3 || menuChoice == 4)
       {
          if (menuChoice == 1) 
         {
          System.out.println("This is the Multiplication table:");
          for(int i=0;i<12;i+=1)
          { 
            for (int j=0;j<12;j+=1)
            {
              MultiplicationOutput = multiplicationRow[j]*multiplicationColl[i];
                //First checks if a number is a perfect square then if true changes the colour of the perfect square to red then back to white
                if (MultiplicationOutput == Math.sqrt(MultiplicationOutput*MultiplicationOutput))
                {
                 
                }
              System.out.printf( "%4d" , MultiplicationOutput );
            }
            System.out.println();
          }
         }
          if (menuChoice == 2) 
         {
          System.out.println("This is the Addition table:");
          for(int j=0;j<10;j+=1)
          { 
            for (int i=0;i<=100;i+=10)
            {
              System.out.print(j+i+" ");
            }
            System.out.println();
          }
         }
          if (menuChoice == 3) 
         {
          System.out.println("This is the AND logic gate table:");
          System.out.println("Condition 1 | Condition 2 | AND ");
          System.out.println("   "+True+"     |    "+True+"     | "+True+" ");
          System.out.println("   "+True+"     |    "+False+"    | "+False+" ");
          System.out.println("   "+False+"    |    "+True+"     | "+False+" ");
          System.out.println("   "+False+"    |    "+False+"    | "+False+" ");
         }
          if (menuChoice == 4) 
         {
          System.out.println("This is OR logic gate table:");
          System.out.println("Condition 1 | Condition 2 | OR ");
          System.out.println("   "+True+"     |    "+True+"     | "+True+" ");
          System.out.println("   "+True+"     |    "+False+"    | "+True+" ");
          System.out.println("   "+False+"    |    "+True+"     | "+True+" ");
          System.out.println("   "+False+"    |    "+False+"    | "+False+" ");
         }
       }
      if (menuChoice == 5) 
      {
        System.out.print("Have a good day!");
      }

    } while (menuChoice != 5);

  }
}