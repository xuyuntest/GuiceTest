package component;

public class DeafultPackage implements Package{

  private final String mt;

  public DeafultPackage(String m) {
    this.mt = m;
  }

  @Override
  public void pack(String target) {

    System.out.println("this is DeafultPackage" + target);
  }
}
