public class Break3 {
    public static void main(String[] args) {
        for(int i=0; i<3; i++) {
        System.out.println("Outer loop count: " + i);
        System.out.print(" Inner loop count: ");
        int t = 0;
            while(t < 150) {
            if(t == 135) break; // terminate loop if t is 135
            System.out.print(t + " ");
            t++;
            }
        System.out.println();
        }
        // System.out.println("Loops complete.");
    }
}
