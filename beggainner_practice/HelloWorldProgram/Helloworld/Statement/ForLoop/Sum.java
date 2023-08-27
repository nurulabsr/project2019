public class Sum {
    public static void main(String[] args){
        double []nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 22, 13, 14, 15, 16, 17, 18, 19, 20};
        double sum=0;

        for (int i =0; i<nums.length; i++){
            sum+=nums[i];
            
        }

        System.out.println("\nSum of nums array: " + sum + "\n");


        int[] nums1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 22, 13, 14, 15, 16, 17, 18, 19, 20};
        int sum1 = 0;
        for(int x: nums1){
        System.out.println("Value is: " + x);
        sum1 += x;
        }
        System.out.println("\nSum1 of nums1 array: " + sum1 + "\n");
        
        //break
        for(int x : nums1) {
            System.out.println("Value is: " + x);
            sum1 += x;
            if(x == 5) break; // stop the loop when 5 is obtained
           }
    }


}
