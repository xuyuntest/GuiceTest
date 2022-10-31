package component;

public class DefaultPay implements Pay{
  @Override
  public void pay(Order order) {
    System.out.println("DefaultPay pay");

  }
}
