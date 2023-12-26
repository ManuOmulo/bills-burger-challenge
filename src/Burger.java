public class Burger {
  private String type;
  private double price;

  public Burger(String type, double price) {
    this.type = type;
    this.price = price;
  }

  public Burger(String type) {
    this(type, 1900);
  }

  protected void addTopings() {

  }

  public double getPrice() {
    switch (type) {
      case "deluxe" -> price = 1900;
      case "chicken" -> price = 500;
      default -> price = 400;
    }
    return price;
  }

  public String getType() {
    return type;
  }
}
