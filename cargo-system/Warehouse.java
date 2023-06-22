// Import classes
import java.util.ArrayList;

/** [Warehouse.java]
  * Desc: The class including all the information for the warehouse
  * @author Emily Xie & Ali Asghar Bundookwalla
  * @version Oct 2022
  */

class Warehouse{
    // Variables
    private ArrayList<Box> boxes;
    private ArrayList<Truck> trucks;
    
    /**
     * Warehouse
     * This constructor creates a new Warehouse object.
     * @param boxes An array list of the boxes in the warehouse
     * @param trucks An array list of the trucks in the warehouse
     */
    Warehouse(ArrayList<Box> boxes, ArrayList<Truck> trucks) {
        this.boxes = new ArrayList<Box>();
        this.trucks = new ArrayList<Truck>();
    }
    
    /**
     * Warehouse
     * This constructor creates a new Warehouse object.
     */
    Warehouse() {
        this.boxes = new ArrayList<Box>();
        this.trucks = new ArrayList<Truck>();
    }
    
    /**
     * addBox
     * This method adds a box to the warehouse.
     * @param box A box object of the given box
     */
    public void addBox(Box box) {
        this.boxes.add(box);
    }
    
    /**
     * addTruck
     * This method adds a truck to the warehouse.
     * @param truck A truck object of the given truck
     */
    public void addTruck(Truck truck) {
        this.trucks.add(truck);
    }
    
    // Getters and setters
    /**
     * getBoxes
     * This method gets the list of boxes.
     * @return A current object of an array list of the boxes
     */
    public ArrayList<Box> getBoxes() {
        return this.boxes;
    }
    
    /**
     * getTrucks
     * This method gets the list of trucks.
     * @return A current object of an array list of the trucks
     */
    public ArrayList<Truck> getTrucks() {
        return this.trucks;
    }
    
    /**
     * setBoxes
     * This method sets the list of boxes.
     * @param boxes An array list of the boxes
     */
    public void setBoxes(ArrayList<Box> boxes) {
        this.boxes = boxes;
    }
    
    /**
     * setTrucks
     * This method sets the list of trucks.
     * @param trucks An array list of the trucks
     */
    public void setTrucks(ArrayList<Truck> trucks) {
        this.trucks = trucks;
    }
}