public class ForVar {

    public static void main(String[] args){
        int sum = 0, factorial = 1;
        for (int i =1; i<=10; i++){
            sum +=i;
            factorial *=i; 
        }

        System.out.println("Sum " + sum);
        System.out.println("Factorial " + factorial);
    }
    
}
