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

  protected void addToppings(boolean addBacon, boolean addMushrooms, boolean addEggs, boolean addGuac, boolean addBbqSauce) {
    if (addBacon) {
      price += 250;
    }
    if (addMushrooms) {
      price += 120;
    }
    if (addEggs) {
      price += 100;
    }
    if (addGuac) {
      price += 100;
    }
    if (addBbqSauce) {
      price += 90;
    }

    String bacon = (addBacon) ? "bacon" : " ";
    String mushrooms = (addMushrooms) ? "mushrooms" : "";
    String eggs = (addEggs) ? "eggs" : "";
    String guacamole = (addGuac) ? "guacamole" : "";
    String bbq = (addBbqSauce) ? "barbeque sauce" : "";

    System.out.printf("Toppings: %s %s %s %s %s", bacon, mushrooms, eggs, guacamole, bbq);
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
