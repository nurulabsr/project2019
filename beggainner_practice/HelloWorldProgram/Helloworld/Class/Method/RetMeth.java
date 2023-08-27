class Vehicle {
    int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon
    int range() {
    return mpg * fuelcap;
 }
}
public class RetMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        int range1, range2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;


        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("\nMinivan can carry " + minivan.passengers + " with range of " + minivan.range() + " Miles");  
        System.out.println("Sportscar can carry " + sportscar.passengers + " with range of " + range2 + " miles\n");
        if(minivan.range() > sportscar.range()) System.out.println("minivan has greater range \n");



    }
    
}
