class Factor {
 boolean isFactor(int a, int b) {
  if( (b % a) == 0) return true;
  else return false;
  }
}

public class IsFact {
    public static void main(String[] args){
        Factor x = new Factor();
        if(x.isFactor(2, 30)) System.out.println("\n2 is factor\n");
        if(x.isFactor(3, 20)) System.out.println("this won't be displayed\n");
    }
    
}
