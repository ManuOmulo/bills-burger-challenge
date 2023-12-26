public class Main {
  public static void main(String[] args) {
    var order1 = new Order();
    order1.getReceipt();

    var burger = new Burger("deluxe");
    var drink = new Drink("sprite", "grande");
    var side = new SideItem("coleslaw");
    var order2 = new Order(burger, drink, side);
    order2.getReceipt();
  }
}
