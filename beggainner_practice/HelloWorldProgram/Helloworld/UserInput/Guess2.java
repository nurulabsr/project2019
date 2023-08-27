public class Guess2 {
    public static void main(String[] args) throws java.io.IOException{
        char ch;
        for (int answer=0; answer<=3; answer++){
            
            ch = (char) System.in.read();
            if(ch=='R'){
                System.out.println("Wow! Successfully You Entered!");
                answer = 3;
            }
            if (answer!='R') {
             System.out.println("Please Enter any random latter from A to Z: ");
             answer =0;
            }

        }

    }
}
