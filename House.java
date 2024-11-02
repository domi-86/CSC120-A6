/* This is a stub for the House class */

import java.util.ArrayList;

public class House extends Building {

    private ArrayList < String > residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
    private boolean hasDiningRoom;


    /**
     * Constructor
     * @param name name of house
     * @param address house's address
     * @param nFloors number of floors
     * @param residents arraylist of residents
     * @param diningRoom does it have a dining room?
     */
    public House(String name, String address, int nFloors, ArrayList < String > residents, boolean diningRoom) {
        super(name, address, nFloors);
        this.residents = residents;
        this.hasDiningRoom = diningRoom;
        System.out.println("You have built a house: 🏠");
    }

    /**
     * hasDiningRoom
     * @return returns boolean
     */
    public boolean hasDiningRoom() {
        return this.hasDiningRoom;
    }

    /**
     * nResidents
     * @return returns int number of residents
     */
    public int nResidents() {
        return this.residents.size();
    }

    /**
     * moveIn
     * @param name adds name to arraylist of residents
     */
    public void moveIn(String name) {
        this.residents.add(name);

    }

    /**
     * moveOut
     * @param name
     * @return removes name from arraylist and returns name
     */
    public String moveOut(String name) { // return the name of the person who moved out
        this.residents.remove(name); // if isResident, remove from arraylist; otherwise, "[name] is not living in this house!"
        return name;
    }


    /**
     * isResident
     * @param person
     * @return returns boolean
     */
    public boolean isResident(String person) {
        return residents.contains(person);

    }


    public static void main(String[] args) {
        //new House();
    }

}