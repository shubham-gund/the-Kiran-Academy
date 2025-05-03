public class TypeConversion {
  public static void main(String[] args) {
      
      // Implicit Type Conversion 
      int intVal = 100;
      long longVal = intVal;          
      float floatVal = longVal;       
      double doubleVal = floatVal;    

      System.out.println("Implicit Type Conversion:");
      System.out.println("int value: " + intVal); // 100
      System.out.println("long value: " + longVal); // 100
      System.out.println("float value: " + floatVal); // 100.0
      System.out.println("double value: " + doubleVal); // 100.0

      // Explicit Type Conversion 
      double d = 123.456;
      float f = (float) d;           
      long l = (long) f;             
      int i = (int) l;               
      byte b = (byte) i;             

      System.out.println("\nExplicit Type Conversion:");
      System.out.println("double value: " + d); // 123.456
      System.out.println("float value: " + f); // 123.456
      System.out.println("long value: " + l); //  123
      System.out.println("int value: " + i); // 123
      System.out.println("byte value: " + b); //  123
  }
}
