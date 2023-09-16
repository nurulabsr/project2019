class A {
 int i, j;

 A(int a, int b) {
    i = a;
    j = b;
    }

 void show() {
    System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
  int k;
  B(int a, int b, int c) {
    super(a, b);
    k = c;
    }

    // B(int a, int b){
    //     super(a, b);
    // }
 // display k – this overrides show() in A
 void show() {
    System.out.println("k: " + k);
    }
}



class Override{
    public static void main(String[] args) {
       B subOb = new B(1, 2, 3);
       subOb.show();
      
    //    B b = new B(100, 100);
    //    b.show();
        

    }
}