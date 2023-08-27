public class GallonsToLiters{

     public static void main(String[] args){
      
        double gallons, litters;
        int counter; 
        counter = 0;
        
        for(gallons = 0; gallons <= 100; gallons++){
           litters = 3.7854  * gallons;
           System.out.println(gallons + " Gallons is " + litters + " L.");

           counter++;
           if(counter==20){
            System.out.println();
            counter=0;
           }


        }




     }


}