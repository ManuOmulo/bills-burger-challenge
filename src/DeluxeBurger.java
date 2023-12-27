public class DeluxeBurger extends Burger {
  private String type;
  private double price;
  private boolean isDeluxe;

  public DeluxeBurger(String type) {
    this.type = type;
    this.price = 1900;
    this.isDeluxe = true;
  }

  @Override
  public String getType() {
    return type;
  }

  @Override
  public double getPrice() {
    return price;
  }

  public boolean isDeluxe() {
    return isDeluxe;
  }
}
