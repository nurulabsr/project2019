class X{
    int a;
    X (int i){
     a=i;
    }
}

class Y  {
   int a;
   Y (int j){
       a=j;
    }
}


class IncompatibleRef{
public static void  main(String[] args){
   X x = new X(100);
   Y y = new Y(1000);
   X x2;
   x2 = x;
   System.out.println(x.a);
//    X2 = y; // error


}

}