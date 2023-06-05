public class Store {
  //declare instance fields here
  String productType;
  double price;

  //constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }

  //advertise method
  public void advertise()
  {
    System.out.println("Come spend some money!");
    System.out.println("Selling " + productType + "!");
  }

  //greet method
  public void greetCustomer(String customer) {
    System.out.println("Welcome to the store, " + customer + "!");
  }

  //increase price method
  public void increasePrice(double priceToAdd) {
    double newPrice = price + priceToAdd;
    price = newPrice;
  }

  //price with tax method
  public double getPriceWithTax() {
    double totalPrice = price + price * 0.08;
    return totalPrice;
  }

  //toString() method
  public String toString() {
    return "This store sells " + productType + " at a price of " + price + ".";
  }

  //main method is where we create instances
  public static void main(String[] args) {

    //create the instance below
    Store cookieShop = new Store("cookies", 3.75);
    cookieShop.advertise();
    cookieShop.greetCustomer("Marcela");
    cookieShop.increasePrice(1.5);
    System.out.println(cookieShop.price);
    double cookiePrice = cookieShop.getPriceWithTax();
    System.out.println(cookiePrice);
    System.out.println(cookieShop);
  }
}
