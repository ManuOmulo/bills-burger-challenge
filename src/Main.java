public class Main {
  public static void main(String[] args) {
    makeOrder();

    makeOrder("deluxe", "sprite", "grande", "coleslaw");

    makeOrder("chicken", "fanta", "large", "icecream");
  }

  public static void makeOrder(String burgerType, String drinkType, String drinkSize, String sideType) {
    var burger = new Burger(burgerType);
    var drink = new Drink(drinkType, drinkSize);
    var side = new SideItem(sideType);
    var order2 = new Order(burger, drink, side);
    order2.getReceipt();
  }

  public static void makeOrder() {
    var order1 = new Order();
    order1.getReceipt();
  }
}
