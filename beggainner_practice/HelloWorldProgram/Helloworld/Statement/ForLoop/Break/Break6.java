public class Break6{
    public static void main (String[] args){
        int x=0, y=0;
        stop1: for(x=0; x < 5; x++) {
            for(y = 0; y < 5; y++) {
             if(y == 2) break stop1;                 // brak step1 fully, so other iteration can't possible
            System.out.println("x and y value: " + x + " " + y);
            }
            }
        System.out.println();
            for(x=0; x < 5; x++)
            stop2: {
             for(y = 0; y < 5; y++) {
             if(y == 2) break stop2;  // break step2 inside for loop, so other iteration possible untill x < 5.
             System.out.println("x and y: " + x + " " + y);
             }            
    }
}

}