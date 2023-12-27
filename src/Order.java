public class Order {
  private Burger burger;
  private Drink drink;
  private SideItem sideItem;

  public Order(Burger burger, Drink drink, SideItem sideItem) {
    this.burger = burger;
    this.drink = drink;
    this.sideItem = sideItem;
  }

  public Order() {
    burger = new Burger("beef", 400);
    drink = new Drink("coke", "large");
    sideItem = new SideItem("fries");
  }

  protected double calculatePrice() {
    if (burger.getClass().getSimpleName().contains("DeluxeBurger")) {
      return burger.getPrice();
    }
    return drink.getDrinkPrice() + sideItem.getSideItemPrice() + burger.getPrice();
  }

  protected void getReceipt() {
    System.out.printf("Order: %n" +
        "- Drink: %s, %s, %.2f %n" +        //type, size, price
        "- Side: %s, %.2f %n" +             //type, price
        "- Burger: %s, %.2f %n",            //type, price
        drink.getType(), drink.getSize(), drink.getDrinkPrice(),
        sideItem.getType(), sideItem.getSideItemPrice(),
        burger.getType(), burger.getPrice()
    );
    System.out.printf("Total Cost = Ksh. %.2f %n", this.calculatePrice());
  }
}
