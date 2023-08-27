public class TwoD {
    public static void main(String[] args){
        int t, i;
        int[][] table = new int[10][10];
        for(t=0; t <=9; t++) {
         for(i=0; i <=9; ++i) {
        table[t][i] = (t*10)+i+1;
        System.out.print(table[t][i] + "\t");
        }
        System.out.println();
 }
    }
}
