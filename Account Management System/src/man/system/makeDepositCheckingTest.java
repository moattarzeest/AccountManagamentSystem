package man.system;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class makeDepositCheckingTest {

  //private static CheckingAccount testDeposit;

  /*@BeforeClass
  public static void beforeIfElseClass()
  {
  	
  	testDeposit=new CheckingAccount();
  }*/
  /* TEST CASES FOR CLASS CheckingAccount*/

  @Test
  void testDepositedTaxPositive() {
    CheckingAccount testDeposit = new CheckingAccount();

    float returnBal = testDeposit.currentBal;

    float output = testDeposit.storingBalTemp(120); //To check the tax collection POSITIVE
    assertEquals(105, output);

  }

  @Test
  void testDepositedTaxNegative() {
    CheckingAccount testDeposit = new CheckingAccount();

    float returnBal = testDeposit.currentBal;

    float output = testDeposit.storingBalTemp(120); //To check the tax collection NEGATIVE
    assertEquals(100, output);

  }

  @Test
  void testDepositedNonTaxPositive() {
    CheckingAccount testDeposit = new CheckingAccount();

    float returnBal = testDeposit.currentBal;

    float output = testDeposit.storingBalTemp(10); //To check the tax collection POSITIVE
    assertEquals(10, output);

  }
  @Test
  void testDepositedNonTaxNegative() {
    CheckingAccount testDeposit = new CheckingAccount();

    float returnBal = testDeposit.currentBal;

    float output = testDeposit.storingBalTemp(10); //To check the tax collection Negative
    assertEquals(0, output);

  }
  /* TEST CASES FOR CLASS SavingAccount */

  @Test
  void testDepositedTaxPositive2() {
    SavingAccount testDeposit = new SavingAccount();

    float returnBal = testDeposit.currentBal;

    float output = testDeposit.storingBalTemp(120); //To check the tax collection POSITIVE
    assertEquals(105, output);

  }

  @Test
  void testDepositedTaxNegative2() {
    SavingAccount testDeposit = new SavingAccount();

    float returnBal = testDeposit.currentBal;

    float output = testDeposit.storingBalTemp(120); //To check the tax collection NEGATIVE
    assertEquals(100, output);

  }

  @Test
  void testDepositedNonTaxPositive2() {
    SavingAccount testDeposit = new SavingAccount();

    float returnBal = testDeposit.currentBal;

    float output = testDeposit.storingBalTemp(10); //To check the tax collection POSITIVE
    assertEquals(10, output);

  }
  @Test
  void testDepositedNonTaxNegative2() {
    SavingAccount testDeposit = new SavingAccount();

    float returnBal = testDeposit.currentBal;

    float output = testDeposit.storingBalTemp(10); //To check the tax collection Negative
    assertEquals(0, output);

  }
  @Test
  void testZakatPositive() //Test case to check calculation of Zakat POSITIVE
  {
    SavingAccount testingZakat = new SavingAccount();
    double output = testingZakat.calculateZakat(30000);
    assertEquals(750.0, output);

  }

  @Test
  void testNonZakatPositive() //Test case to check calculation of Zakat POSITIVE
  {
    SavingAccount testingZakat = new SavingAccount();
    double output = testingZakat.calculateZakat(10000);
    assertEquals(0, output);

  }

  @Test
  void testZakatNegative() //Test case to check calculation of Zakat NEGATIVE
  {
    SavingAccount testingZakat = new SavingAccount();
    double output = testingZakat.calculateZakat(30000);
    assertEquals(650.0, output);

  }

  @Test
  void testNonZakatNegative() //Test case to check calculation of Zakat NEGATIVE
  {
    SavingAccount testingZakat = new SavingAccount();
    double output = testingZakat.calculateZakat(10000);
    assertEquals(760, output);

  }

  /*TEST CASES FOR CLASS UserChoice */
  void testLogin() //Test case to check the login id 
  {
    UserChoice test = new UserChoice();
    boolean output = test.AccountChoices(1234);
    assertEquals(false, output);
  }
}