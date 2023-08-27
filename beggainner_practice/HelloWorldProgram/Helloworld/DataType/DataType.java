package DataType;
public class DataType {
    
  public static void main(String[] args){
    
    double double_num, result;
    double_num = 7.5* 1100;
    System.out.println(double_num);
    
    result = Math.sqrt(double_num);
    System.out.println("Result of sqrt: "+ result);


    long im ;
    long ci;
    im = 5280*12;
    ci = im*im*im;
   
    System.out.println(ci);


    int a =10;
    System.out.println(a);

    double b =10, d; 
    System.out.println(b); 
    d = 10;
    System.out.println("d: " + d);
   
   ++d;
   System.out.println("++d: "+d);
  System.out.println("b: "+b);
  b++;
  System.out.println("b++: "+b);





  }

}
