public class BreakErr {
    public static void main(String[] args){
        one: for(int i=0; i<=3; i++) {
            //  if (i==4)break one;
             System.out.print("Pass " + i + ": ");
            
            }
        
            for(int j=0; j<100; j++) {
             if(j == 10) break one; // incorrect
              System.out.print(j + " ");
            }
           }
    
}
