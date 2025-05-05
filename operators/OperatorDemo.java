public class OperatorDemo {
  public static void main(String[] args) {
      // Arithmetic operations
      int a = 10, b = 3;
      long l = 20L;
      float f = 5.5f;
      double d = 2.2;

      System.out.println("Arithmetic Operations:");
      System.out.println("int / int = " + (a / b));               // 10 / 3 = 3
      System.out.println("int % int = " + (a % b));               // 10 % 3 = 1
      System.out.println("int + long = " + (a + l));              // 10 + 20 = 30 (long)
      System.out.println("long / int = " + (l / a));              // 20 / 10 = 2 (long)
      // System.out.println("int / long = " + (a / l));  This will give a compilation error!

      System.out.println("float * int = " + (f * a));             // 5.5 * 10 = 55.0
      System.out.println("double + float = " + (d + f));          // 2.2 + 5.5 = 7.7
      System.out.println("double / int = " + (d / a));            // 2.2 / 10 = 0.22
      System.out.println("int - double = " + (a - d));            // 10 - 2.2 = 7.8

      System.out.println("\nRelational (Conditional) Operations:");
      System.out.println("a == b: " + (a == b));                  // false
      System.out.println("a != b: " + (a != b));                  // true
      System.out.println("a > b: " + (a > b));                    // true
      System.out.println("a < b: " + (a < b));                    // false
      System.out.println("a >= 10: " + (a >= 10));                // true
      System.out.println("b <= 3: " + (b <= 3));                  // true

      System.out.println("\nLogical Operations:");
      boolean x = true, y = false;
      System.out.println("x && y: " + (x && y));                  // false
      System.out.println("x || y: " + (x || y));                  // true
      System.out.println("!x: " + (!x));                          // false
      System.out.println("!(a > b): " + (!(a > b)));              // false
      System.out.println("(a > b) && (a == 10): " + ((a > b) && (a == 10))); // true
  }
}
