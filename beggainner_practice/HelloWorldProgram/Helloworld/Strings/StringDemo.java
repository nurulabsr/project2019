class StringDemo {
 public static void main(String[] args) {
    // declare strings in various ways
    String str1 = new String("\nJava strings are objects.");
    String str2 = "They are constructed various ways.";
    String str = """
                 \nText blocks make multiple lines easy because they eliminate
                the need to use escape sequences to indicate a newline.
                As a result, text blocks make the programmer's life better!
                """;
    String sub_string = str1.substring(0, 12);
    String str3 = new String(str2);
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.print(sub_string);
    System.out.println(str1);
    System.out.println(str);

 }
}