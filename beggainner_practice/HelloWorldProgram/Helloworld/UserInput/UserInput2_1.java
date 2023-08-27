public class UserInput2_1 {
    public static void main(String[] args) throws java.io.IOException{
        char i;
        i = (char) System.in.read();
      while (i !='K') {
        System.out.println("Please Enter any random latter from A to Z: ");
        i = (char) System.in.read();
        i++;
      }
      

    }
}
