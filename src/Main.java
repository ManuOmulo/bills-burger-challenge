public class Main {
  public static void main(String[] args) {
    makeOrder();

    makeOrder(true,"beef", "sprite", "grande", "coleslaw", true, true, true, true, true);

    makeOrder(false,"chicken", "fanta", "large", "icecream", true, false, true, true, false);
  }

  public static void makeOrder(
      boolean isDeluxe, String burgerType, String drinkType, String drinkSize, String sideType,
      boolean addBacon, boolean addMushrooms, boolean addEggs, boolean addGuac, boolean addBbqSauce
  ) {
    var burger = isDeluxe ? new DeluxeBurger(burgerType) : new Burger(burgerType);
    burger.addToppings(addBacon, addMushrooms, addEggs, addGuac, addBbqSauce);
    var drink = new Drink(drinkType, drinkSize);
    var side = new SideItem(sideType);
    var order2 = new Order(burger, drink, side);
    order2.getReceipt();
  }

  public static void makeOrder(
      boolean isDeluxe, String burgerType, String drinkType, String drinkSize, String sideType,
      boolean addBacon, boolean addMushrooms, boolean addBbqSauce
  ) {
    var burger = isDeluxe ? new DeluxeBurger(burgerType) : new Burger(burgerType);
    burger.addToppings(addBacon, addMushrooms, addBbqSauce);
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
