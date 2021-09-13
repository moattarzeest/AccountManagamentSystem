package man.system;

/* MOATTAR ZEEST RANA
 * 19i-0581
 * ADVANCED PROGRAMMING-E
 */

import java.util.Scanner;
import java.time.LocalDate;
import java.util.*;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalTime;

class UserChoice {

  public
  int counter = 0;
  static int temp = 0;
  static int index = 0;
  static int AccArr[] = new int[10];
  static double BalArr[] = new double[10];
  static int k = 0;
  static int m = 0;
  public int AccNumber = 0;
  public static int tempAcc = 0;
  static boolean flag = true;

  UserChoice() {

  }
  char open = 'o';
  char close = 'c';

  static void AccountChoices() {
    //Displaying the banking managment system welcome lines
    System.out.println("=====================================Welcome to our Account Management System=========================================");
    System.out.println("1. If you want to open an account PRESS O");
    System.out.println("2. If you want to close an account PRESS C");
    System.out.println("3. If you want to login to your account PRESS L");
    System.out.println("4. IF you want to quit press Q");

    //Asking user for its choice
    Scanner sc = new Scanner(System.in);
    Scanner scint = new Scanner(System.in);
    char choice = sc.next().charAt(0); //Taking input

    CheckingAccount obj = new CheckingAccount();
    SavingAccount objS = new SavingAccount();
    if (choice == 'o' || choice == 'O') //opening account
    {
      flag = true;
      // System.out.println("PRINTING TEMP: "+temp);
      System.out.println("You chose to open an account");

      // System.out.println("PRINTING TEMP: "+temp);

      System.out.println("==========================================");
      System.out.println("1. If you want to open a checking account PRESS A");
      System.out.println("2. If you want to open a saving account PRESS B");
      System.out.println("==========================================");
      Scanner type = new Scanner(System.in);
      char acctype = type.next().charAt(0);
      if (acctype == 'A' || acctype == 'a') {
        System.out.println("Proceeding to your checking account...");
        int StoringTemp = obj.PersonalInfo(temp);
        temp = StoringTemp;

        obj.menu();

      } else if (acctype == 'B' || acctype == 'b') {
        System.out.println("Proceeding to your saving account...");
        int StoringTemp = objS.PersonalInfo(temp);
        temp = StoringTemp;
        objS.menu();
      } else {
        System.out.println("You entered an invalid choice");
      }

    } else if (choice == 'c' || choice == 'C') //Closing Account
    {
      System.out.println("You chose to close an account");
      System.out.println("Enter your account number");
      int AccNumber = scint.nextInt();
      for (int i = 0; i < 10; i++) {
        if (AccNumber == AccArr[i]) {
          AccArr[i] = 0;
        }
      }
      System.out.println("Your account has been closed successfuly");
      AccountChoices();

    } else if (choice == 'l' || choice == 'L') //Logging in 
    {
      flag = false;
      System.out.println("You chose to login to your account");
      System.out.println("1. If you have a checking account PRESS A");
      System.out.println("2. If you have a saving account PRESS B");
      Scanner type = new Scanner(System.in);
      char acctype = type.next().charAt(0);
      if (acctype == 'A' || acctype == 'a') {
        System.out.println("Enter your 4 digit account number to login");

        int AccNumber = scint.nextInt();
        tempAcc = AccNumber;
        for (int i = 0; i < 10; i++) {
          if (AccNumber == AccArr[i]) {
            index = i;
            System.out.println("Opening your Checking Account");
            obj.menu();

          } else {

          }

        }
        System.out.println("No such account number in bank record");
      } else if (acctype == 'b' || acctype == 'B') {
        System.out.println("Enter your 4 digit account number to login");
        
        int AccNumber = scint.nextInt();
        for (int i = 0; i < 1; i++) {
          if (AccNumber == AccArr[i]) {
            index = i;
            System.out.println("Opening your Saving Account");
            objS.menu();

          } else {

          }

        }
        System.out.println("No such account number in bank record");

      } else {
        System.out.println("You entered invalid choice");
      }

    } else if (choice == 'Q' || choice == 'q') //Terminating the Account Management System
    {
      System.exit(0);
    } else {
      System.out.println("You have entered invalid choice");

    }

  }
  public static void main(String args[]) {
    AccountChoices();
  }

}
//*******************************************************************************************************************************************************************************

//****************************************************************************************************************************************************************************

