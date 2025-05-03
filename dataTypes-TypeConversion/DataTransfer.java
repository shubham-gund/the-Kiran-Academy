public class DataTransfer {
  public static void main(String[] args) {
      byte b = 10;
      short s = b;        
      int i = s;          
      long l = i;         
      float f = l;       
      double d = f;       

      // byte can be negative so explicitly convert to char
      char c = (char) b;

      System.out.println("Byte value: " + b);          // Byte value: 10
      System.out.println("Short value: " + s);         // Short value: 10
      System.out.println("Int value: " + i);           // Int value: 10
      System.out.println("Long value: " + l);          // Long value: 10
      System.out.println("Float value: " + f);         // Float value: 10.0
      System.out.println("Double value: " + d);        // Double value: 10.0
      System.out.println("Char value: " + (int)c + " (Unicode of char '" + c + "')"); //  '\n' used to print next line  
      
  }
}
