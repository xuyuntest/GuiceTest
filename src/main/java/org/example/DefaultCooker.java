package org.example;

public class DefaultCooker implements Cooker{
  public DefaultCooker() {

    System.out.println("DefaultCooker");
  }
  @Override
  public String cook(String cookTarget) {
    System.out.println("cookTarget is:" + cookTarget);
    return cookTarget;
  }
}
