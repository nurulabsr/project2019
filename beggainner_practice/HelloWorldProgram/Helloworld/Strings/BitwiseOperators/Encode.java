class Encode {
 public static void main(String[] args) {
    String msg = "I Love my! januuuu";
    // var fin = new FileInputStream("test.txt");
    // System.out.println(fin);
    String encmsg = "";
    String decmsg = "";
    int key = 90;
    System.out.print("Original message: ");
    System.out.println(msg + " ");
    // encode the message
    for(int i=0; i < msg.length(); i++)
        // System.out.print(msg.charAt(i));
        encmsg = encmsg + (char) (msg.charAt(i) ^ key);  
        System.out.print("Encoded message: ");
        System.out.println(encmsg);

    // decode the message
    for(int i=0; i < msg.length(); i++)
        decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        System.out.print("Decoded message: ");
        System.out.println(decmsg);

 }

}