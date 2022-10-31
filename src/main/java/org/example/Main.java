package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import component.AlipayTag;
import component.DefaultPayTag;
import component.Order;
import component.Package;
import component.Pay;

public class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");

    Injector injector = Guice.createInjector(new TryBindingModule());
    //linked bindings
    //Cooker cooker = injector.getInstance(Cooker.class);
    //cooker.cook("cake");
    //instance bindings
    //String string = injector.getInstance(String.class);
    //System.out.println(string);

    //Provides bindings
    //Package packages = injector.getInstance(Package.class);
    //packages.pack("DeafultPackage cake");

    //BindingAnnotation
    Pay defaultPay = injector.getInstance(Key.get(Pay.class, DefaultPayTag.class));
    defaultPay.pay(new Order("cake","11111111",19.33));

    Pay aliPay = injector.getInstance(Key.get(Pay.class, AlipayTag.class));
    aliPay.pay(new Order("cake","222222",20.99));

  }
}