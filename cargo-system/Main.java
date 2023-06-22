/** [Main.java]
  * Desc: The main class
  * @author Emily Xie & Ali Asghar Bundookwalla
  * @version Oct 2022
  */

public class Main {
    public static void main(String[] args) {
        // Instantiate objects
        ReceivingSystem rcv = new ReceivingSystem();
        rcv.run();
        Warehouse warehouse = rcv.getWarehouse();
        PlacementSystem plcmt = new PlacementSystem();
        plcmt.run(warehouse);
        DisplaySystem display = new DisplaySystem(warehouse);
    }
}