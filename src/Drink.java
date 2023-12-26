public class Drink {
  private String type;
  private String size;
  private double price;

  public Drink(String type, String size) {
    this.type = type;
    this.size = size;
    this.price = 0;
  }

  protected double getDrinkPrice() {
    switch (size) {
      case "small" -> price = 50;
      case "medium" -> price = 120;
      case "large" -> price = 190;
      case "grande" -> price = 250;
      default -> price = 0;
    }

    return price;
  }

  public String getType() {
    return type;
  }

  public String getSize() {
    return size;
  }
}
