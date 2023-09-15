class Vehicle {
 private int passengers; // number of passengers
 private int fuelcap; // fuel capacity in gallons
 private int mpg; // fuel consumption in miles per gallon
 Vehicle(int p, int f, int m) {
    passengers = p;
    fuelcap = f;
    mpg = m;
    }
 // Compute fuel needed for a given distance.
 double fuelNeeded(int miles) {
    return (double) miles / mpg;
    }

    int getPassengers() { 
        return passengers; 
    }
    int getfuelcap(){
     return fuelcap;
    } 


}
class Truck extends Vehicle {
 private int cargocap; 
 Truck(int p, int f, int m, int c) {
    super(p, f, m);
    cargocap = c;
 }
    int getCargo() { return cargocap; }
}

class TruckDemo {
 public static void main(String[] args) {
    Truck semi = new Truck(2, 200, 7, 44000);
    Truck pickup = new Truck(3, 28, 15, 2000);
    double gallons;
    int dist = 292;
    gallons = semi.fuelNeeded(dist);
    System.out.println("Semi can carry " + semi.getCargo() + " pounds.");
    System.out.println("To go " + dist + " miles semi needs " + gallons + " gallons of fuel.\n");
    gallons = pickup.fuelNeeded(dist);
    System.out.println("Number of passenger " + semi.getPassengers() );
    System.out.println("Pickup can carry " + pickup.getCargo() + " pounds.");
    System.out.println("To go " + dist + " miles pickup needs " + gallons + " gallons of fuel.");

    
 }
}