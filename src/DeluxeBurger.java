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

  protected void addToppings(boolean addBacon, boolean addMushrooms, boolean addEggs, boolean addGuac, boolean addBbqSauce) {

    String bacon = (addBacon) ? "bacon" : "";
    String mushrooms = (addMushrooms) ? "mushrooms" : "";
    String eggs = (addEggs) ? "eggs" : "";
    String guacamole = (addGuac) ? "guacamole" : "";
    String bbq = (addBbqSauce) ? "barbeque sauce" : "";

    System.out.printf("Toppings: %s %s %s %s %s \n", bacon, mushrooms, eggs, guacamole, bbq);
  }
}
