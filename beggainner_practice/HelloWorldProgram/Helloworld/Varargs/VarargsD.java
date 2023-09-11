class Test{
    int sum;

    int demo(int ... v){
            // System.out.println("Number of args: " + v.length);
            if (sum != v.length) 
            sum = demo(v) + sum;
            return sum;
        }


    // void demo2(int ... a){
    //         System.out.println("Number of args: " + a.length);
    //         for(int i = 0; i <=a.length; i++){
    //         sum += a[i];
    //         }
    //     }
}

public class VarargsD {

    public static void main(String[] args){
        Test h = new Test();
        h.demo(5,6,8,9);
        System.out.println("Sum of args: " + h.sum );
        
        // demo2(1,2,3,4,5,6,7,8,9,100, 1, 1, 1);

    }
}
