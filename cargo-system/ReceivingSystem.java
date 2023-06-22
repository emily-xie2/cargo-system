// Import classes
import java.io.File;
import java.awt.event.ComponentListener;
import java.awt.event.ComponentEvent;
import java.lang.Exception;

/** [ReceivingSystem.java]
  * Desc: The class of all the panels of the receiving system
  * @author Emily Xie & Ali Asghar Bundookwalla
  * @version Oct 2022
  */

public class ReceivingSystem implements ComponentListener {
    // Variables
    private Warehouse warehouse;
    private LogInMenu logInMenu;
    private RegisterMenu registerMenu;
    private OptionMenu optionMenu;
    private CargoMenu cargoMenu;
    private CargoTable cargoTable;
    private TruckMenu truckMenu;
    private TruckTable truckTable;
    private ReviewMenu reviewMenu;
    
    /**
     * ReceivingSystem
     * This constructor creates a new ReceivingSystem object.
     */
    ReceivingSystem() {
        // Instantiate objects
        this.warehouse = new Warehouse();
        logInMenu = new LogInMenu();
        registerMenu = new RegisterMenu();
        optionMenu = new OptionMenu();
        cargoMenu = new CargoMenu();
        cargoTable = new CargoTable();
        truckMenu = new TruckMenu();
        truckTable = new TruckTable();
        reviewMenu = new ReviewMenu();
        reviewMenu.addComponentListener(this);
    }
    
    /**
     * run
     * This method runs the receiving system.
     */
    public void run() {
        Frame frame = new Frame();
        Frame.container.add(logInMenu, "logInMenu");
        Frame.container.add(registerMenu, "registerMenu");
        Frame.container.add(optionMenu, "optionMenu");
        Frame.container.add(cargoMenu, "cargoMenu");
        Frame.container.add(cargoTable, "cargoTable");
        Frame.container.add(truckMenu, "truckMenu");
        Frame.container.add(truckTable, "truckTable");
        Frame.container.add(reviewMenu, "reviewMenu");
        frame.setVisible(true);

        // Let the system sleep for a second to properly dispose the frame
        while (true) {
            if (reviewMenu.getIsSubmitted()) {
                break;
            } else{
                try {
                    Thread.sleep(1);
                } catch(Exception ex){
                    System.out.println("Interrupted exception");
                }
            }
        }
        frame.dispose();
        this.warehouse.setBoxes(reviewMenu.getCargos());
        this.warehouse.setTrucks(reviewMenu.getTrucks());
    }
    
    /**
     * loadBoxes
     * This method loads the boxes
     * @param file A File object of the box file
     */
    private void loadBoxes(File file) {
        reviewMenu.setCargoFile(file);
    }
    
    /**
     * loadTrucks
     * This method loads the trucks
     * @param file A File object of the truck file
     */
    private void loadTrucks(File file) {
        reviewMenu.setTruckFile(file);
    }
    
    // Getters and setters
    /**
     * getWarehouse
     * This method gets the warehouse
     * @return A current Warehouse object of the warehouse
     */
    public Warehouse getWarehouse() {
        return this.warehouse;
    }
    
    /**
     * setWarehouse
     * This method sets the warehouse
     * @param warehouse A warehouse object
     */
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }
    
    // Required for the component listener class
    @Override
    public void componentShown(ComponentEvent e) {
        reviewMenu.updateTable();
    }
    @Override
    public void componentHidden(ComponentEvent e) {
    }
    @Override
    public void componentMoved(ComponentEvent e) {
    }
    @Override
    public void componentResized(ComponentEvent e) {
    }
}