package component;

public class Alipay implements Pay{
  @Override
  public void pay(Order order) {
    System.out.println("Alipay pay");
  }
}
