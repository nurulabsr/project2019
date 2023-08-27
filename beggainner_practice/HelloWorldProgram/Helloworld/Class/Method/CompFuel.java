class Vehicle {
    int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon
    int range() {
    return mpg * fuelcap;
    }
    // Compute fuel needed for a given distance.
    double fuelNeeded(int miles) {
    return (double) miles / mpg;
    }
}


public class CompFuel {
    public static void main(String[] args) {
            Vehicle minivan = new Vehicle();
            Vehicle sportscar = new Vehicle();
            double gallons;
            int dist = 252;
            // assign values to fields in minivan
            minivan.passengers = 7;
            minivan.fuelcap = 16;
            minivan.mpg = 21;
            // assign values to fields in sportscar
            sportscar.passengers = 2;
            sportscar.fuelcap = 14;
            sportscar.mpg = 12;
            gallons = minivan.fuelNeeded(dist);
            System.out.println("\nTo go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
            gallons = sportscar.fuelNeeded(dist);
            System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.\n");
        } 
}
