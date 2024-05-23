class B {
  int x11;
  int x33;
  int x16;
  int x21;
  int x23;
  long x31;
  long x9;
  long x30;
  int[] x40 = {-3, -3, 2, -3, 2};
  int[] x26 = {2, 3, -3, 2};
  int[] x27 = {2, 2, 3, -1, 3};
  static int x13;
  static int x8;
  static int x15;
  static int x22;
  static int x7;
  public B() {
    x11 = 8;
    x33 = 2;
    x16 = 4;
    x21 = 5;
    x23 = 2;
    x31 = 6L;
    x9 = 4L;
    x30 = 9L;
  }
  public void x12() {
    System.out.println("метод x12 в классе B");
    System.out.println(x22++);
  }
  public void x6() {
    System.out.println("метод x6 в классе B");
    System.out.println(x21 >> 2);
  }
  public void x1() {
    System.out.println("метод x1 в классе B");
    System.out.println(x16);
  }
  public void x34() {
    System.out.println("метод x34 в классе B");
    System.out.println(x27[2] + x27[2]);
  }
  public void x24() {
    System.out.println("метод x24 в классе B");
    System.out.println(x11);
  }
  public void x20() {
    System.out.println("метод x20 в классе B");
    System.out.println(x21 - 1);
  }
  public static void x4() {
    System.out.println("метод x4 в классе B");
    System.out.println(x22);
  }
  public static void x2() {
    System.out.println("метод x2 в классе B");
    System.out.println((x22 - 1));
  }
  public static void x37() {
    System.out.println("метод x37 в классе B");
    System.out.println(x7);
  }
  public static void x38() {
    System.out.println("метод x38 в классе B");
    System.out.println((x7 - 1));
  }
  public void x19(B r) {
    r.x12();
  }
  public void x19(H r) {
    r.x6();
  }
}
