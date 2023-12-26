public class SideItem {
  private String type;
  private double price;

  public SideItem(String type) {
    this.type = type;
    this.price = 0;
  }

  protected double getSideItemPrice() {
    switch (type) {
      case "fries" -> price = 150;
      case "coleslaw" -> price = 200;
      case "icecream" -> price = 480;
      default -> price = 0;
    }

    return price;
  }

  public String getType() {
    return type;
  }
}
