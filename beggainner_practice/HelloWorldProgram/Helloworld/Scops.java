class Scops {
 public static void main(String[] args) {
    int n, d;
    n = 10;
    d = 2;
    if(d != 0 && (n % d) == 0){
    System.out.println(d + " is a factor of " + n);
  }
    d = 0; // now, set d to zero
  if(d != 0 && (n % d) == 0){
    System.out.println(d + " is a factor of " + n);
   }

// divide-by-zero error
   if(d != 0 & (n % d) == 0)
     System.out.println(d + " is a factor of " + n);
  

  
 }
}