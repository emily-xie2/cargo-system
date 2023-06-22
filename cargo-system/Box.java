// Import classes
import java.awt.Color;

/** [Box.java]
  * Desc: The class including all the information for the boxes
  * @author Emily Xie & Ali Asghar Bundookwalla
  * @version Oct 2022
  */

public class Box {
    // Variables
    private int length;
    private int width;
    private int height;
    private int weight;
    private int x,y;
    private Color color;
    
    /**
     * Box
     * This constructor creates a new Box object.
     */
    Box() {
        this.length = 0;
        this.width = 0;
        this.height = 0;
        this.weight = 0;
        this.x = 0;
        this.y = 0;
        this.color = null;
    }
    
    /**
     * Box
     * This constructor creates a new Box object.
     * @param length An int of the length of the box
     * @param width  An int of the width of the box
     * @param height An int of the height of the box
     * @param weight An int of the weight of the box
     */
    Box(int length, int width, int height, int weight) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.x = 0;
        this.y = 0;
        this.color = null;
    }
    
    /**
     * Box
     * This constructor creates a new Box object.
     * @param length An int of the length of the box
     * @param width  An int of the width of the box
     * @param height An int of the height of the box
     * @param weight An int of the weight of the box
     * @param x An int of the x position of the box
     * @param y An int of the y position of the box
     * @param color A Color object of the color of the box
     */
    Box(int length, int width, int height, int weight, int x, int y, Color color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    // Getters and setters
    /**
     * getLength
     * This method gets an int of the length of the box
     * @return A current object of the int of the length of the box
     */
    public int getLength() {
        return this.length;
    }
    
    /**
     * getWidth
     * This method gets an int of the width of the box
     * @return A current object of the int of the width of the box
     */
    public int getWidth() {
        return this.width;
    }
    
    /**
     * getHeight
     * This method gets an int of the height of the box
     * @return A current object of the int of the height of the box
     */
    public int getHeight() {
        return this.height;
    }
    
    /**
     * getWeight
     * This method gets an int of the weight of the box
     * @return A current object of the int of the weight of the box
     */
    public int getWeight() {
        return this.weight;
    }
    
    /**
     * getX
     * This method gets the x position of the box
     * @return A current object of the int of the x position of the box
     */
    public int getX() {
        return this.x;
    }
    
    /**
     * getY
     * This method gets the y position of the box
     * @return A current object of the int of the y position of the box
     */
    public int getY() {
        return this.y;
    }
    
    /**
     * getColor
     * This method gets the color of the box
     * @return A current object of the Color of the color of the box
     */
    public Color getColor() {
        return this.color;
    }
    
    /**
     * setLength
     * This method sets the length of the box
     * @param length An int of the length of the box
     */
    public void setLength(int length) {
        this.length = length;
    }
    
    /**
     * setWidth
     * This method sets the width of the box
     * @param width An int of the width of the box
     */
    public void setWidth(int width) {
        this.width = width;
    }
    
    /**
     * setHeight
     * This method sets the height of the box
     * @param height An int of the height of the box
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
    /**
     * setWeight
     * This method sets the weight of the box
     * @param weight An int of the weight of the box
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    /**
     * setX
     * This method sets the x position of the box
     * @param x An int of the x position of the box
     */
    public void setX(int x) {
        this.x = x;
    }
    
    /**
     * setY
     * This method sets the y position of the box
     * @param y An int of the y position of the box
     */
    public void setY(int y) {
        this.y = y;
    }
    
    /**
     * setColor
     * This method sets the color of the box
     * @param color A Color of the color of the box
     */
    public void setColor(Color color) {
        this.color = color;
    }
    
    /**
     * collidesWith
     * This method checks if the boxes are colliding
     * @param box A Box object
     * @return True if it has collided, false otherwise
     */
    public boolean collidesWith(Box box) { 
        if (this.y < box.getY() + box.getLength()  
                || this.y + this.length > box.getY()) { 
            return false; 
        } 
        if (this.x < box.getX() + box.getWidth() 
                || this.x + this.width > box.getX()) { 
            return false; 
        } 
        return true; 
     }
}