class X{
int a;
X(int i){ a = i;}
}

class Y extends X {
    int b;
    Y(int i, int j){
    super(j);
    b = i;
    }
    
}



class SupSubRef{
    public static void main(String[] args) {  //psvm
        X x = new X(100000000);
        Y y = new Y(50000000, 60000000);
        X x2;
        x2 = x; // OK, both of same type
        System.out.println("x2.a: " + x2.a);

        x2 = y; // still Ok because Y is derived from X
        System.out.println("x2.a: " + x2.a);

        x2.a = 19000000; // OK


    }
}
