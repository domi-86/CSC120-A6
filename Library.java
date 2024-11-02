/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building {

    private Hashtable < String, Boolean > collection;

    /**
     * Constructor
     * @param name
     * @param address
     * @param nFloors
     */
    public Library(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.collection = new Hashtable < > ();
        System.out.println("You have built a library: 📖");
    }

    /**
     * addTitle
     * @param title
     */
    public void addTitle(String title) {
        this.collection.put(title, true);
    }


    /**
     * removeTitle
     * @param title
     * @return returns the book title that was removed
     */
    public String removeTitle(String title) {
        this.collection.remove(title);
        return title;

    }

    /**
     * checkOut
     * @param title
     */
    public void checkOut(String title) {
        this.collection.replace(title, false);
    }

    /**
     * returnBook
     * @param title
     */
    public void returnBook(String title) {
        this.collection.replace(title, true);
    }

    /**
     * containsTitle
     * @param title
     * @return returns boolean if a title is in the collection
     */
    public boolean containsTitle(String title) {
        return this.collection.contains(title);
    }

    /**
     * isAvailable
     * @param title
     * @return returns the value for the key title - whether or not the book is available
     * @throws Exception if title is not in collection
     */
    public boolean isAvailable(String title) {
        try {
            return this.collection.get(title);
        } catch (Exception e) {
            throw new RuntimeException("This title is not in the collection!");
        }

    }

    /**
     * printCollection
     * prints out the entire collection in an easy-to-read way (including checkout status)
     */
    public void printCollection() {
        //System.out.println(this.collection.toString());

        this.collection.forEach((key, value) - > System.out.println("TITLE: " + key + "    AVAILABLE: " + value));


    }

    // 

    public static void main(String[] args) {
        Library neilson = new Library("Neilson Library", "7 Neilson Drive, Northampton, MA 01063", 5);
        //neilson.new Library("Neilson Library", "7 Neilson Drive, Northampton, MA 01063", 5);

        neilson.addTitle("The Lorax by Dr. Seuss");
        System.out.println(neilson.isAvailable("The Lorax by Dr. Seuss"));
        neilson.checkOut("The Lorax by Dr. Seuss");
        neilson.printCollection();
        System.out.println(neilson.isAvailable("The Lorax by Dr. Seuss"));
        neilson.returnBook("The Lorax by Dr. Seuss");
        System.out.println(neilson.isAvailable("The Lorax by Dr. Seuss"));
        neilson.removeTitle("The Lorax by Dr. Seuss");
        //System.out.println(neilson.isAvailable("Vicious by V.E. Schwab"));
        neilson.addTitle("Vicious by V.E. Schwab");
        neilson.printCollection();

    }

}