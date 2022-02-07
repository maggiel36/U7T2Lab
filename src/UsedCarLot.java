import java.lang.reflect.Array;
import java.util.ArrayList;
/**
 * This class represents a UsedCarLot object
 *
 * @author Maggie Li
 */

public class UsedCarLot
{
    /** The inventory of the UsedCarLot */
    private ArrayList<Car> inventory = new ArrayList<Car>();

    /**
     * Instantiates a UsedCarLot object
     *
     */
    public UsedCarLot()
    {
        inventory = new ArrayList<Car>();
    }

    /**
     * Returns the current inventory of the car object
     *
     * @return the inventory of the car object
     */
    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    /**
     * Adds another car object to the Car inventory
     *
     * @param car new car object that was added to the inventory
     */
    public void addCar(Car car)
    {
        inventory.add(car);
    }

    /**
     * Returns true if the cars are successfully swapped; returns false if either one of the int parameters exceed the bounds of the inventory or is negative.
     * @param one The first indice
     * @param two The second indice
     * @return true or false depending on whether or not the swap was successful
     */
    public boolean swap(int one, int two)
    {
        if (one < inventory.size() && one >= 0 && two < inventory.size() && two >= 0)
        {
            inventory.set(two, inventory.get(one));
            inventory.set(one, inventory.get(two));
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Adds a Car to the inventory list at the index specified
     * by indexToAdd; this method increases the size of inventory by 1
     * PRECONDITION: 0 &lt; indexToAdd &lt; inventory.size()
     *
     * @param indexToAdd The index in the inventory that the new Car object will be added at
     * @param carToAdd The Car object that will be added
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }

    /**
     * "sells" the Car located at indexOfCarToSell which
     *  removes it from the inventory list and shifting the remaining
     *  Cars in the inventory list to the left to fill in the gap;
     *  this method reduces the size of inventory by 1
     *
     *  Returns the Car that is being "sold" (removed from lot)
     *
     *  PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell The index in the inventory that the Car object will be sold at
     * @return The Car object that was sold
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);
    }

    /**
     * "sells" the Car located at indexOfCarToSell,
     *  but instead of removing it and shifting the inventory
     *  list to the left, REPLACE the Car at indexOfCarToSell
     *  with NULL, thus creating an "empty parking spot" on the lot;
     *  this method does NOT reduce the size of inventory by 1
     *
     *  PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     *  This method returns the Car that is being "sold"
     *
     * @param indexOfCarToSell The index of the Car that is being sold
     * @return The Car object that is being sold
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        return inventory.set(indexOfCarToSell, null);
    }

    /**
     * moves Car located at index indexOfCarToMove to index destinationIndex;
     * if destinationIndex > indexOfCarToMove, moves the Car to the right in
     * inventory; if destinationIndex &lt; indexOfCarToMove, moves the
     * Car to the left in the inventory. All other cars in the inventory
     * should shift accordingly
     *
     * PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
     * destinationIndex &lt; inventory.size()
     *
     * @param indexOfCarToMove The index of the Car object to move
     * @param destinationIndex The index of where the Car object should be moved
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        inventory.add(destinationIndex, inventory.remove(indexOfCarToMove));
    }
}
