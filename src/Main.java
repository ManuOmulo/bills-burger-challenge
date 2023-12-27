public class Main {
  public static void main(String[] args) {
    makeOrder();

    makeOrder(true,"beef", "sprite", "grande", "coleslaw");

    makeOrder(false,"chicken", "fanta", "large", "icecream");
  }

  public static void makeOrder(boolean isDeluxe, String burgerType, String drinkType, String drinkSize, String sideType) {
    var burger = isDeluxe ? new DeluxeBurger(burgerType) : new Burger(burgerType);
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
