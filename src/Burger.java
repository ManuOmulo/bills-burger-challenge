public class Burger {
  private String type;
  private double price;

  public Burger(String type, double price) {
    this.type = type;
    this.price = price;
  }

  public Burger(String type) {
    this(type, 400);
  }

  public Burger() {
  }

  protected void addToppings(boolean addBacon, boolean addMushrooms, boolean addBbqSauce) {
    int count = 0;

    while (count < 4) {
      if (addBacon) {
        price += 250;
        count += 1;
      }
      if (addMushrooms) {
        price += 120;
        count += 1;
      }
      if (addBbqSauce) {
        price += 90;
        count += 1;
      }
    }

    String bacon = (addBacon) ? "bacon" : "";
    String mushrooms = (addMushrooms) ? "mushrooms" : "";
    String bbq = (addBbqSauce) ? "barbeque sauce" : "";

    System.out.printf("Toppings: %s %s %s \n", bacon, mushrooms, bbq);
  }

  public double getPrice() {
    switch (type) {
      case "pork" -> price = 350;
      case "chicken" -> price = 500;
      default -> price = 400;
    }
    return price;
  }

  public String getType() {
    return type;
  }
}
