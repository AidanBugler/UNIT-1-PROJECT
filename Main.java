import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Scanner to find inputs from user
    Scanner input = new Scanner(System.in);
    // Variables
    int menuChoice;
    int [] multColl = {1,2,3,4,5,6,7,8,9,10,11,12};
    int [] multRow = {1,2,3,4,5,6,7,8,9,10,11,12};
    int [] addColl = {10,20,30,40,50,60,70,80,90,100};
    int [] addRow = {1,2,3,4,5,6,7,8,9,10};
    
    
    do {
      System.out.println("What would you like to know?");
      System.out.println("1. Multiplication table 2. Addition table");
      System.out.println("3. AND logic gate table 4. OR logic gate table");
      System.out.println("5. Exit system");
      menuChoice = Integer.parseInt(input.nextLine());
      if (menuChoice == 1 || menuChoice == 2 || menuChoice == 3 || menuChoice == 4)
       {
          if (menuChoice == 1) 
         {
          System.out.println("this is the Multiplication table");
          for(int i=0;i<12;i+=1)
          { 
          
            for (int j=0;j<12;j+=1)
            {
              System.out.print(multRow[j]*multColl[i]+" ");
            }
            System.out.println();
          }
         }
          if (menuChoice == 2) 
         {
          System.out.println("this is the Addition table");
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
          System.out.println("this is the AND logic gate table");
         }
          if (menuChoice == 4) 
         {
          System.out.println("this is OR logic gate table");
         }
       }
      if (menuChoice == 5) 
      {
        System.out.print("Have a good day!");
      }

    } while (menuChoice != 5);

  }
}