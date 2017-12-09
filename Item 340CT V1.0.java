package Stock;

/**
 * Write a description of class Item here.
 *
 * @author (Kevin Sennes)
 * @version (a version number or a date)
 */

public class Item {

    //instance variables - declared private because we only want to set them in this class
    private String itemID;
    private String itemName;
    private String itemPrice;
    private String itemQuantity;

    // constructor to create an instance of Item, we pass in the values as parameters and it assigns them to
    // the variables
    public Item(String itemID, String itemName, String itemPrice, String itemQuantity) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }
