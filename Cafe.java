/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    /**
     * Constructor
     * @param name
     * @param address
     * @param nFloors
     * @param coffeeOunces
     * @param sugarPackets
     * @param numCreams
     * @param numCups
     */
    public Cafe(String name, String address, int nFloors, int coffeeOunces, int sugarPackets, int numCreams, int numCups) {
        if ((coffeeOunces < 0) || (sugarPackets < 0) || (numCreams < 0) || (numCups < 0)) {
            throw new RuntimeException("Cannot have negative stock.");
        }
        super(name, address, nFloors);
        this.nCoffeeOunces = coffeeOunces;
        this.nSugarPackets = sugarPackets;
        this.nCreams = numCreams;
        this.nCups = numCups;

        System.out.println("You have built a cafe: ☕");
    }

    /**
     * sellCoffee
     * @param size
     * @param nSugarPackets
     * @param nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if ((size < 0) || (nSugarPackets < 0) || (nCreams < 0)) {
            throw new RuntimeException("Cannot have negative stock.");
        }
        if ((size < this.nCoffeeOunces) || (this.nSugarPackets < nSugarPackets) || (this.nCreams < nCreams) || (this.nCups < 1)) { // if something is out of stock
            System.out.println("Restocking!");
            this.restock(40, 20, 20, 20);
        }

        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        System.out.println("Coffee sold!");
    }

    /**
     * restock
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }

    public static void main(String[] args) {
        Cafe compass = new Cafe("Compass Cafe", "7 Elm St, Northampton, MA 01063", 1, 40, 40, 40, 100);
        compass.sellCoffee(30, 5, 5);
        compass.sellCoffee(20, 2, 3);


    }

}