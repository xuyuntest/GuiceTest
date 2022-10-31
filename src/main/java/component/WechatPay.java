package component;

public class WechatPay implements Pay{
  @Override
  public void pay(Order order) {
    System.out.printf("WechatPay pay");

  }
}
