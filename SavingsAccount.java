public class SavingsAccount {
  int balance;

  //constructor
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  //checkBalance method
  public void checkBalance() {
    System.out.println("Hello!");
    System.out.println("Your balance is " + balance);
  }

  //deposit method
  public void deposit(int amountToDeposit) {
    balance += amountToDeposit;
    System.out.println("You Just deposited " + amountToDeposit);
  }

  //withdraw method
  public int withdraw(int amountToWithdraw) {
    balance -= amountToWithdraw;
    System.out.println("You just withdrew " + amountToWithdraw);
    return amountToWithdraw;
  }

  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);

    //Check balance:
    savings.checkBalance();

    //Withdrawing:
    savings.withdraw(300);

    //Deposit:
    savings.deposit(100);

    //Check balance:
    savings.checkBalance();

    //Deposit:
    savings.deposit(100);

    //Check balance:
    savings.checkBalance();

  }
}
