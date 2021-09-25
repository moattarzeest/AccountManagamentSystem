package acc.man.sys;




import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

class CheckingAccount //opening a checking account
{
  public

  float currentBal = 0;
  float AmountDep = 0;
  float transactionAmount = 0;
  int Tax = 15;

  int deduction = 0;
  float AmountWithdraw = 0;
  public String FullName;
  public String address;
  public String phone;
  public int AccNum = 0;

  Scanner scstrings = new Scanner(System.in);
  LocalDate dateD;
  LocalTime timeD;
  LocalDate dateW;
  LocalTime timeW;
  UserChoice obj = new UserChoice();

  Scanner scint = new Scanner(System.in);

  int PersonalInfo(int t1) {
    //  System.out.println("T1= "+t1);
    obj.counter++;
    //  System.out.println("---------"+obj.counter);
    System.out.println("Enter your full name: ");
    this.FullName = scstrings.nextLine(); //taking name input

    System.out.println("Enter your address: ");
    this.address = scstrings.nextLine(); //taking address input

    System.out.println("Enter your phone number: ");
    this.phone = scstrings.nextLine();

    System.out.println("Set a 4 digit account number: ");
    this.AccNum = scint.nextInt();
    obj.AccArr[t1] = AccNum;

    System.out.println("Your account number is: " + obj.AccArr[t1]);
    // System.out.println(+t1);

    t1++;

    //System.out.println(+t1);
    /*  for(int i =0 ;i<t1; i++)
      {
    	  System.out.println("PRINTING ARRAY: "+obj.AccArr[i]);
      }*/

    return t1;
  }
  void menu() {

    System.out.println("====================WELCOME TO YOUR CHECKING ACCOUNT=========================");
    System.out.println("Choose options from menu");
    System.out.println("1. IF you want to deposit amount press 1");
    System.out.println("2. IF you want to withdraw amount press 2");
    System.out.println("3. IF you want to check balance press 3");
    System.out.println("4. IF you want to transfer amount press 4");
    System.out.println("5. IF you want to display your deductions press 5");
    System.out.println("6. IF you want to print statement press 6");
    System.out.println("7. To exit menu press 0 ");
    int menuchoice = scint.nextInt();
    if (menuchoice == 1) {
      makeDeposit();
    } else if (menuchoice == 2) {
      makeWithdrawal();
    } else if (menuchoice == 3) {
      checkBalance();
    } else if (menuchoice == 4) {

    } else if (menuchoice == 5) {
      displayAllDeductions();
    } else if (menuchoice == 6) {
      printStatement();
    } else if (menuchoice == 0) {
      //System.out.println(+obj.m);
      //System.out.println("HEREEEEEE "+currentBal);
      obj.BalArr[obj.m] = currentBal; //Storing current balance of user6
      /* for(int i=0; i<=obj.m;i++)
       {
      	 System.out.println("BALANCE ARRAY = "+obj.BalArr[i]);
       }*/
      obj.m++;
      obj.k++;
      obj.AccountChoices();
    } else {
      System.out.println("INVALID INPUT");
    }

  }

  void makeDeposit() {
    System.out.println("Enter the amount you want to deposit");
    AmountDep = scint.nextFloat();
    transactionAmount = transactionAmount + AmountDep;
    currentBal = currentBal + AmountDep;
    currentBal = (float)(currentBal + obj.BalArr[obj.index]);
    if (currentBal > Tax) {
      currentBal = currentBal - Tax; //tax deducation
      deduction = deduction + 15;
      System.out.println("Your current balance after tax deduction is: " + currentBal);
      // obj.BalArr[obj.m]=currentBal;
      // for(int i =0; i<obj.m; i++)
      //{
      // System.out.println("BALANCE ARRAY= "+obj.BalArr[i]);
      //}
      System.out.println("==================================");
    } else {
      System.out.println("Your current balance is: " + currentBal);
      //	 obj.BalArr[obj.m]=currentBal;
      //	 for(int i =0; i<obj.m; i++)
      //	 {
      //		 System.out.println("BALANCE ARRAY= "+obj.BalArr[i]);
      //	 }
      System.out.println("==================================");
    }
    System.out.println("Transaction done at: ");
    //Displaying date and time of transactions
    dateD = LocalDate.now();
    System.out.println(dateD);
    timeD = LocalTime.now();
    System.out.println(timeD);

    System.out.println("==================================");
    System.out.println("Suspending ... ");
    for (int i = 1; i < 5; i++) {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
      // System.out.println(i); 
    }
    menu();

  }

  void makeWithdrawal() {
    System.out.println("Enter the amount you want to withdraw");
    AmountWithdraw = scint.nextFloat();
    transactionAmount = transactionAmount + AmountWithdraw;
    currentBal = (float)(currentBal + obj.BalArr[obj.index]);
    if (AmountWithdraw > currentBal) {
      System.out.println("You do not have sufficient balance to withdraw this amount");
    } else {

      currentBal = currentBal - AmountWithdraw;
      if (currentBal > Tax) {
        currentBal = currentBal - Tax;
        deduction = deduction + 15;
        System.out.println("Your current balance after tax deduction is: " + currentBal);
        // obj.BalArr[obj.m]=currentBal;
        //for(int i =0; i<obj.m; i++)
        //{
        //	 System.out.println("BALANCE ARRAY= "+obj.BalArr[i]);
        //}
        System.out.println("==================================");
      } else {
        System.out.println("Your current balance is: " + currentBal);
        // obj.BalArr[obj.m]=currentBal;
        //for(int i =0; i<obj.m; i++)
        //{
        //	 System.out.println("BALANCE ARRAY= "+obj.BalArr[i]);
        //}
        System.out.println("==================================");
      }

    }
    System.out.println("Transaction done at: ");
    dateW = LocalDate.now();
    System.out.println(dateW);
    timeW = LocalTime.now();
    System.out.println(timeW);

    System.out.println("Suspending ... ");
    for (int i = 1; i < 5; i++) {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
      // System.out.println(i); 
    }
    menu();

  }

  void checkBalance() {
    currentBal = (float)(currentBal + obj.BalArr[obj.index]);
    System.out.println("===BALANCE DETAILS===");
    System.out.println("Account holder " + FullName);
    System.out.println("Balance " + currentBal);
    // System.out.println(+obj.m);
    //obj.BalArr[obj.m]=currentBal;
    //obj.m++;
    //System.out.println(+obj.m);

    //for(int i =0; i<obj.m; i++)
    //{
    // System.out.println("BALANCE ARRAY= "+obj.BalArr[i]);
    // }
    System.out.println("Suspending ... ");
    for (int i = 1; i < 5; i++) {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println(e);
      }

    }

    menu();

  }
  //Transfer function pending
  void displayAllDeductions() {
    System.out.println("Your total deductions for Tax are: " + deduction);

    System.out.println("Suspending ... ");
    for (int i = 1; i < 5; i++) {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
      // System.out.println(i); 
    }
    menu();
  }

  void printStatement() {

    System.out.println("*********************");
    System.out.println("CURRENT ACCOUNT DETAILS ");
    System.out.println("*********************");
    System.out.println("Personal Information of account holder");
    System.out.println("Account Holder: " + FullName);
    System.out.println("Address: " + address);
    System.out.println("Phone Number: " + phone);
    if (obj.flag == true) //To display when new account opened  
    {
      //System.out.println("FOR NEW ACCOUNT");
      System.out.println("Account Number: " + obj.AccArr[obj.k]);
    } else if (obj.flag == false) //To display when login to existing account

    {
      //System.out.println("FOR LOGGING ACCOUNT");
      System.out.println("Account Number: " + obj.tempAcc);
    }
    System.out.println("*********************");
    System.out.println("Transaction History "); //Showing transaction details 
    System.out.println("Date and time of deposit = ");
    System.out.println(dateD);
    System.out.println(timeD);
    System.out.println(dateD);
    System.out.println("Amount Deposited = " + AmountDep);
    System.out.println("Date and time of withdrawal = ");
    System.out.println(dateW);
    System.out.println(timeW);
    System.out.println("Amount Withdrew = " + AmountWithdraw);
    System.out.println("Total amount of transaction = " + transactionAmount);
    System.out.println("Suspending ... ");
    System.out.println("*********************");
    for (int i = 1; i < 5; i++) {
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
      // System.out.println(i); 
    }

    menu();
  }

}