// Import classes
import java.util.ArrayList;

/** [Truck.java]
  * Desc: The class including all the information for the trucks
  * @author Emily Xie & Ali Asghar Bundookwalla
  * @version Oct 2022
  */

public class Truck {
    // Variables
    private int length;
    private int width;
    private int height;
    private int maxWeight;
    private ArrayList<Box> loadedBoxes;
    private int availableWeight;
    
    /**
     * Truck
     * This constructor creates a new Truck object.
     */
    Truck() {
        this.length = 0;
        this.width = 0;
        this.height = 0;
        this.maxWeight = 0;
        this.loadedBoxes = new ArrayList<Box>();
    }
    
    /**
     * Truck
     * This constructor creates a new Truck object.
     * @param length An int of the length of the truck
     * @param width  An int of the width of the truck
     * @param height An int of the height of the truck
     * @param maxWeight An int of the maximum carrying capacity of the box
     */
    Truck(int length, int width, int height, int maxWeight) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.maxWeight = maxWeight;
        this.loadedBoxes = new ArrayList<Box>();
    }

    /**
     * isLoaded
     * This method checks if the box has been loaded into a truck.
     * @param box A box object of the given box
     * @return A boolean with a value of true, if the box is loaded, otherwise false
     */
    public boolean isLoaded(Box box) {
        boolean loaded = false;
        for (int i = 0;i < this.loadedBoxes.size(); i++) {
            if (this.loadedBoxes.get(i) == box && !loaded) {
                loaded = true;
            }
        }
        return loaded;
    }
    
    /**
     * addBox
     * This method adds a box to the loaded boxes in the truck.
     * @param box A box object of the given box
     */
    public void addBox(Box box) {
        loadedBoxes.add(box);
    }
    
    /**
     * removeBox
     * This method removes a box from the loaded boxes in the truck.
     * @param box A box object of the given box
     */
    public void removeBox(Box box) {
        loadedBoxes.remove(box);
    }
    
    /**
     * size
     * This method gets the size of the loaded boxes array list
     * @return The size of the loaded boxes array list
     */
    public int size() { 
        return loadedBoxes.size(); 
    } 

    // Getters and setters
    /**
     * getLength
     * This method gets an int of the length of the truck
     * @return A current object of an int of the length of the truck
     */
    public int getLength() {
        return this.length;
    }
    
    /**
     * getWidth
     * This method gets an int of the width of the truck
     * @return A current object of an int of the width of the truck
     */
    public int getWidth() {
        return this.width;
    }
    
    /**
     * getHeight
     * This method gets an int of the height of the truck
     * @return A current object of an int of the height of the truck
     */
    public int getHeight() {
        return this.height;
    }
    
    /**
     * getMaxWeight
     * This method gets an int of the maximum carrying capacity of the truck
     * @return A current object of an int of the maximum carrying capacity of the truck
     */
    public int getMaxWeight() {
        return this.maxWeight;
    }
    
    /**
     * getAvailableWeight
     * This method gets the available weight of the truck
     * @return The available weight of the truck
     */
    public int getAvailableWeight() { 
        int tmp = maxWeight; 
        for (int i=0; i<loadedBoxes.size(); i++) {
            tmp -= (loadedBoxes.get(i)).getWeight(); 
        } 
        return tmp;
    }

    /**
     * getBox
     * This method gets a box of the loaded boxes
     * @return A box object of the loaded boxes
     */
    public Box getBox (int i){ 
          return loadedBoxes.get(i); 
    }

    /**
     * getLoadedBoxes
     * This method gets an array list of the loaded boxes
     * @return A current array list of the boxes
     */
    public ArrayList<Box> getLoadedBoxes() { 
        return this.loadedBoxes; 
    }
    
    /**
     * setLength
     * This method sets the length of the truck.
     * @param length An int of the length of the truck
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * setWidth
     * This method sets the width of the truck.
     * @param width An int of the width of the truck
     */
    public void setWidth(int width) {
        this.width = width;
    }
    
    /**
     * setHeight
     * This method sets the height of the truck.
     * @param height An int of the height of the truck
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
    /**
     * setMaxWeight
     * This method sets the maximum carrying capacity of the truck.
     * @param maxWeight An int of the maximum carrying capacity of the truck
     */
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}