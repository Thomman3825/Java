public class StringOps {
 public static void main(String[] args) {
    String s1 = new String ( "Thomas");
    String s2 = new String ("Thomas");
   if (s1.equals(s2)) {
    System.out.println("String are the same");
   }
   else{
    System.out.println("String are not the same");
   }

   StringBuffer sb = new StringBuffer("Thomas");
   sb.append(" Kurian");

   System.out.println(sb);
 }
}
