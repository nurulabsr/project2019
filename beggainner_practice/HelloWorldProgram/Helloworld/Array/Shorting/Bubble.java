public class Bubble {
    public static void main(String[] args){
        int[] nums = { 99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49 };
       
        // System.out.println(g);
        // System.out.println(nums[9]);
        int a, b, t;
        int size;
        size = 10; 
        // System.out.print("Original array is:");
    //  hello: 
     for(a=1; a < size; a++) {       //a = 2,  3,  4, 5, 6, 7, 8, 9
            // if(a==5) break hello; 
             for(b=size-1; b >= a; b--) {    //9, 8, 7, 6, 5, 4, 3, 2, 1
              if(nums[b-1] > nums[b]) {    // b=10-1 = 9   9>=1; if(num[8] > num[9]) = 287 > 49
               t = nums[b-1];     // t = num[8] = 287 
            //    System.out.println("t = "+ t);
               nums[b-1] = nums[b]; // num[8] = num[9] = 49
               nums[b] = t;  // nums[9] = t = 49 
               System.out.print("result "+nums[b] +"\n");
            //    if(nums[b]==t) break hello;

               

        System.out.print(a +". Sorted array is:");
        for(int i=0; i < size; i++)
        System.out.print(" " + nums[i]);
        System.out.println();
    }
}

    

     }


 

   
    }
    
}
