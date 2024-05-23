class H extends B {
  public H() {
    x11 = 0;
    x33 = 9;
    x16 = 7;
    x31 = 7L;
    x9 = 1L;
  }
  public void x6() {
    System.out.println("метод x6 в классе H");
    System.out.println(--x16);
  }
  public void x34() {
    System.out.println("метод x34 в классе H");
    System.out.println(x11 - 1);
  }
  public static void x4() {
    System.out.println("метод x4 в классе H");
    System.out.println(x13);
  }
  public static void x2() {
    System.out.println("метод x2 в классе H");
    System.out.println((x13 + 3));
  }
  public static void x37() {
    System.out.println("метод x37 в классе H");
    System.out.println(++x13);
  }
  public static void x38() {
    System.out.println("метод x38 в классе H");
    System.out.println(x8);
  }
  public void x19(B r) {
    r.x1();
  }
  public void x19(H r) {
    r.x34();
  }
}
