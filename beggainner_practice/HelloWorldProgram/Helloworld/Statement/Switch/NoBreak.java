public class NoBreak {
    public static void main(String[] args){
        for(int i=0; i<=5; i++){
          switch(i){
            case 0:
            System.out.println("i is less than one");
            case 1:
            System.out.println("i is less than two");
            case 2:
            System.out.println("i is less than three");
            case 3:
            System.out.println("i is less than four");
            case 4:
            System.out.println("i is less than five");
            default:
             System.out.println("none");
          }
            System.out.println();
        }
       
    }
}
