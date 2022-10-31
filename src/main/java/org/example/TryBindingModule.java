package org.example;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import component.Alipay;
import component.AlipayTag;
import component.DeafultPackage;
import component.DefaultPay;
import component.DefaultPayTag;
import component.Package;
import component.Pay;

public class TryBindingModule extends AbstractModule
{
  @Override
  protected void configure() {

    bind(Cooker.class).to(DefaultCooker.class);
    bind(String.class).toInstance("Compass Java");

    bind(Pay.class).annotatedWith(DefaultPayTag.class).to(DefaultPay.class);
    bind(Pay.class).annotatedWith(AlipayTag.class).to(Alipay.class);
  }

  @Provides
  public Package packProvide(){
    return new DeafultPackage("mmmm");
  }
}
