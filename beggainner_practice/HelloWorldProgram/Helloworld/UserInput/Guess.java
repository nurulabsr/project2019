// package UserInput;
public class Guess{
    public static void main(String[] args) throws java.io.IOException{
      char ch, answer='R';
      System.out.println("Please Enter a random latter from A to Z");
      ch = (char) System.in.read();
      System.out.println("You Entered: " + ch);
      if (ch==answer){
        System.out.println("Successfully you Entered Guess Number!");
      }

      else{
        System.out.println("Oh! Don't matched, Try again latter.");
      }

      

    }
}