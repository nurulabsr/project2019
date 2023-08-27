public class BubbleShorting {
    public static void main(String[] arrgs){
        int []arr= {100, 2000, 500, 2, -200, 600, -150, 900, 999, -999, -10000, 5000, 60000, -49, 49, 800, 8080, -8080, 50000, 50000};
        int x, y, z, lengt=20;
   
        for (x=1; x<lengt; x++){
           for (y= lengt-1; y>=x; y-- ){
               if(arr[y-1] > arr[y]){
                   z = arr[y-1];
                   arr[y-1] = arr[y];
                   arr[y] = z;
                
               for(int i =0; i<lengt; i++)
               System.out.print(arr[i] + " ");
               System.out.println(); 
               

           }      
       }
  }
   
    }
}
